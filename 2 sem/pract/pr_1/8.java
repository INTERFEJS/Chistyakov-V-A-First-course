package pract.pr_1;

import java.util.Scanner;
import java.util.ArrayList;

class Triangles {
    
    public static void main(String[] args) {
        //Создаём массивы
        ArrayList <Integer> arrayOfNumbers = new ArrayList<>();
        ArrayList <Integer> finalArray = new ArrayList<>();
        ArrayList <Double> arrayOfCorner = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите длины отрезков.");

        //Вводим размеры отрезков и сохраняем в массив
        for (int i = 0; i != 3; i++) {
            System.out.print("Введите размер "+(i+1));
            System.out.print("го отрезка: ");
            arrayOfNumbers.add(in.nextInt());
            System.out.println();
        }
        
        in.close();

        //Исключаем максимальное значение, чтобы применить следствие из неравенства треугольника
        var max = arrayOfNumbers.get(0);

        for (int num : arrayOfNumbers) {
            finalArray.add(num);
            if (num > max) {
                max = num;
            }
        }

        //Проверяем можно ли составить из отрезков треугольник
        double a, b, c;
        int indMax = arrayOfNumbers.indexOf(max);
        arrayOfNumbers.remove(indMax);
        if (max < (arrayOfNumbers.get(0)+arrayOfNumbers.get(1))) {

            //Если можно, то с помощью теоремы косинусов находим углы треугольника
            //и сохраняем их в массив
            System.out.println("Из этих отрезков можно составить треугольник!");

            //Первый угол
            double cosA = (((Math.pow(finalArray.get(0), 2)
            + (Math.pow(finalArray.get(2), 2))
            - (Math.pow(finalArray.get(1), 2))) 
            / (2 * (finalArray.get(0)) * (finalArray.get(2)))));
            a = Math.toDegrees(Math.acos(cosA));
            arrayOfCorner.add(a);

            //Второй угол
            double cosB = (((Math.pow(finalArray.get(0), 2)
            + (Math.pow(finalArray.get(1), 2))
            - (Math.pow(finalArray.get(2), 2))) 
            / (2 * (finalArray.get(0)) * (finalArray.get(1)))));
            b = Math.toDegrees(Math.acos(cosB));
            arrayOfCorner.add(b);

            //Третий угол
            double cosC = (((Math.pow(finalArray.get(1), 2)
            + (Math.pow(finalArray.get(2), 2))
            - (Math.pow(finalArray.get(0), 2))) 
            / (2 * (finalArray.get(2)) * (finalArray.get(1)))));
            c = Math.toDegrees(Math.acos(cosC));
            arrayOfCorner.add(c);
            
            //Теперь найдём наибольший внешний угол исключив наименьший внутренний угол
            var min = arrayOfCorner.get(0);

        for (double n : arrayOfCorner) {
            if (n > min) {
                min = n;
            }
        }
        
        int indMin = arrayOfCorner.indexOf(min);
        arrayOfNumbers.remove(indMin);
        double maxCorner = arrayOfCorner.get(0) + arrayOfCorner.get(1);
        String result = String.format("%.2f", maxCorner);
        System.out.print("Наибольший внешний угол треугольника равен: "+result);
        System.out.print("°");
        }
        else {
            System.out.println("Из этих отрезков нельзя составить треугольник!");

        }
    }

}
