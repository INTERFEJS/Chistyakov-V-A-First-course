package Num50;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
import java.util.*;
class Calculator {
    private static final String HISTORY_FILE = "history.txt";

    private Map<String, String> operations = new HashMap<>();
    private List<String> history = new ArrayList<>();

    public Calculator() {
        operations.put("+", "сложение");
        operations.put("-", "вычитание");
        operations.put("*", "умножение");
        operations.put("/", "деление");
        operations.put("//", "деление без остатка");
        operations.put("%", "остаток от деления");
        operations.put("^", "возведение в степень");
        operations.put("|", "модуль числа");

        loadHistory();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Ввести уравнение");
            System.out.println("2. Вывести историю всех вычислений");
            System.out.println("3. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите уравнение: ");
                    String expression = scanner.nextLine();
                    double result = calculateExpression(expression);
                    System.out.println("Результат: " + result);
                    saveHistory(expression, result);
                    break;

                case 2:
                    System.out.println("\nИстория всех вычислений:");
                    for (int i = 0; i < history.size(); i++) {
                        System.out.printf("%d. %s%n", i + 1, history.get(i));
                    }
                    break;

                case 3:
                    saveHistory();
                    System.out.println("Досвидания!");
                    return;

                default:
                    System.out.println("Неверный ввод! Попробуйте еще раз.");
            }
        }
    }
    private double calculateExpression(String expression) {
        try {
            String[] tokens = expression.split(" ");
            Deque<Double> numbers = new ArrayDeque<>();
            Deque<String> operations = new ArrayDeque<>();
            int i = 0; // объявляем переменную i

            for (String token : tokens) {
                switch (token) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                    case "//":
                    case "%":
                    case "^":
                        while (!operations.isEmpty() && getPriority(token) <= getPriority(operations.peek())) {
                            double secondNumber = numbers.pop();
                            double firstNumber = numbers.pop();
                            String operation = operations.pop();
                            double result = performOperation(operation, firstNumber, secondNumber);
                            numbers.push(result);
                        }
                        operations.push(token);
                        break;

                    case "|":
                        double number = Double.parseDouble(tokens[i + 1]); // используем i + 1 вместо ++i
                        numbers.push(Math.abs(number));
                        break;

                    default:
                        numbers.push(Double.parseDouble(token));
                }
                i++; // увеличим i на единицу после каждого шага цикла
            }

            while (!operations.isEmpty()) {
                double secondNumber = numbers.pop();
                double firstNumber = numbers.pop();
                String operation = operations.pop();
                double result = performOperation(operation, firstNumber, secondNumber);
                numbers.push(result);
            }

            return numbers.pop();

        } catch (Exception e) {
            System.out.println("Ошибка выполнения вычисления: " + e.getMessage());
            return Double.NaN;
        }
    }

    private int getPriority(String operation) {
        switch (operation) {
            case "+":
            case "-":
                return 1;

            case "*":
            case "/":
            case "//":
            case "%":
                return 2;

            case "^":
            case "|":
                return 3;

            default:
                return 0;
        }
    }

    private double performOperation(String operation, double a, double b) {
        switch (operation) {
            case "+":
                return a + b;

            case "-":
                return a - b;

            case "*":
                return a * b;

            case "/":
                return a / b;

            case "//":
                return (int) (a / b);

            case "%":
                return a % b;

            case "^":
                return
                        Math.pow(a, b);

            case "|":
                return Math.abs(a);

            default:
                throw new IllegalArgumentException("Неверный знак операции: " + operation);
        }
    }

    private void saveHistory() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(HISTORY_FILE))) {
            for (String historyItem : history) {
                writer.println(historyItem);
            }
            System.out.println("История вычислений сохранена в файле: " + HISTORY_FILE);

        } catch (IOException e) {
            System.out.println("Ошибка сохранения истории: " + e.getMessage());
        }
    }

    private void saveHistory(String expression, double result) {
        String historyItem = String.format("%s = %.2f", expression, result);
        history.add(historyItem);
    }

    private void loadHistory() {
        File file = new File(HISTORY_FILE);
        if (!file.exists() || !file.isFile()) {
            System.out.println("Файл истории вычислений не найден: " + HISTORY_FILE);
            return;
        }

        try (Scanner scanner = new Scanner(file)) {
            int count = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                history.add(line);
                count++;
            }
            System.out.printf("Загружено %d записей истории вычислений из файла: %s%n", count, HISTORY_FILE);

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка загрузки истории: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.run();
    }
}