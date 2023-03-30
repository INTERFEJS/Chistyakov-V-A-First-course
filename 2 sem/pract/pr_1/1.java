package pract.pr_1;
import java.util.Scanner;
import java.util.Random;


class Matrix {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Введите высоту матрицы: ");
        int height = in.nextInt();
        System.out.println("Введите ширину матрицы: ");
        int width = in.nextInt();

        in.close();

        int[][] massive = new int[height][width];  //размерность y на х
        for(int j=0;j<massive.length; j++){
            massive[j] = new int[width]; 
        }

        for(int i = 0; i < massive.length; i++){  
            for(int j = 0; j < massive[i].length; j++){ 
                int min = 0;
                int max = 50;
                int diff = max - min;
                Random random = new Random();
                int count = random.nextInt(diff + 1);
                count += min;
                massive[i][j] = count;  //присваиваем элементу двумерного массива значение count
            }
        }

        System.out.println();
        System.out.println("Исходный массив:");
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                System.out.printf("%4d\t", massive[i][j]); //вывод массива
            }
            System.out.println(); 
        }

        System.out.println();
        System.out.println("Обновлённый массив:");
        for (int j = 0; j < massive[0].length; j++) {
            for (int i = 0; i < massive.length; i++) {
                System.out.printf("%4d\t", massive[i][j]); //вывод массива
            }
            System.out.println(); 
        }
    }
}