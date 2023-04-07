package pract.pr_1;

import java.util.Scanner;
import java.util.ArrayList;

class triangles {
    
    public static void main(String[] args){

        ArrayList <Integer> arrayOfNumbers = new ArrayList<>();
        ArrayList <Integer> finalArray = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите длины отрезков.");

        for(int i = 0; i != 3; i++){

            System.out.print("Введите размер "+(i+1));
            System.out.print("го отрезка: ");
            arrayOfNumbers.add(in.nextInt());
            System.out.println();

        }

        int min = arrayOfNumbers.get(0);
        System.out.println("min "+min);
        int sumMin = 0;
        int ind, num;

        while(1<arrayOfNumbers.size()){

            num = arrayOfNumbers.get(1);
            System.out.println(num);
            if (num < min || num == min) {
                min = num;
                sumMin += min;
                ind = arrayOfNumbers.indexOf(min);
                finalArray.add(min);
                arrayOfNumbers.remove(ind);

            }
            else{

                if(arrayOfNumbers.indexOf(0) > arrayOfNumbers.indexOf(1)){
                ind = arrayOfNumbers.indexOf(num);
                num = arrayOfNumbers.get(1);
                finalArray.add(num);
                num = arrayOfNumbers.get(0);
                finalArray.add(num);
                arrayOfNumbers.remove(ind);

                }
                else{

                ind = arrayOfNumbers.indexOf(num);
                num = arrayOfNumbers.get(0);
                finalArray.add(num);
                num = arrayOfNumbers.get(1);
                finalArray.add(num);
                arrayOfNumbers.remove(ind);

                }
            }
        }
        
        System.out.println(finalArray);



    }

}
