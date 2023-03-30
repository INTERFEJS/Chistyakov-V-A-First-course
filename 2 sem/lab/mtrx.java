/*package lab;
import java.util.Random;


public class mtrx {
    private final int[][] matrix;
    
    public Main(int n) {
        matrix = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(9) + 1;
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d\t", matrix[i][j]); //вывод массива
            }
            System.out.println(); 
        }
        int sum = 0;
        int diff = 0;
        int mult = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i < j)
                {
                    int vr = sum;
                    sum = matrix[i][j] + vr;
                }
                if (i > j)
                {
                    int vrd = diff;
                    diff = vrd - matrix[i][j];
                }
                if (i == j)
                {
                    int vrm = 0;
                    if (mult == 0);
                    {
                        vrm = mult;
                        mult = vrm * matrix[i][j];
                    }
                }
            }
        }
        System.out.println("Сумма = "+sum);
        System.out.println("Разность = "+diff);
        System.out.println("Произведение = "+mult);


    }
 }*/