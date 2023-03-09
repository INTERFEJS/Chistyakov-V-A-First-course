package lab;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        int[][] massive = new int[3][3];  //размерность х на х
        for(int j=0;j<massive.length; j++){
            massive[j] = new int[3]; 
        }
        
        for(int j = 0; j < massive.length; j++){  
            for(int l = 0; l < massive.length; l++){ 
                int min = 0;
                int max = 50;
                int diff = max - min;
                Random random = new Random();
                int count = random.nextInt(diff + 1);
                count += min;
                massive[j][l] = count;  //присваиваем элементу двумерного массива значение count
            }
        }
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                System.out.printf("%4d\t", massive[i][j]); //вывод массива
            }
            System.out.println(); 
        }
        int sum = 0;
        int diff = 0;
        int mult = 1;
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                if (i < j)
                {
                    int vr = sum;
                    sum = massive[i][j] + vr;
                }
                if (i > j)
                {
                    int vrd = diff;
                    diff = vrd - massive[i][j];
                }
                if (i == j)
                {
                    int vrm = 0;
                    if (mult == 0);
                    {
                        vrm = mult;
                        mult = vrm * massive[i][j];
                    }
                }
            }
        }
        System.out.println("Сумма = "+sum);
        System.out.println("Разность = "+diff);
        System.out.println("Произведение = "+mult);


    }
}