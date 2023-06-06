package Num48;

import java.util.*;

public class SeriesOfNumbers {

    ArrayList<Integer> list = new ArrayList<>();
    public static final int LASTDIT = 20;
    public void start(){
        functionForArray();
        removeDublicate();
        sortingArray();
    }

    public void functionForArray() {
        list.add(1);
        int uZ;
        int uY;
        int x = list.get(0);
        int x1 = list.get(0);
        for (int i = 0; i < LASTDIT; i++) {
            int Y = 2 * x + 1;
            int Z = 3 * x1 + 1;
            uZ = Z;
            uY = Y;
            list.add(uY);
            list.add(uZ);
            x = list.get(i);
            x1 = list.get(i);
        }
    }
    public void removeDublicate() {
        Set<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
    }

    public void sortingArray() {
        Collections.sort(list);
    }

    @Override
    public String toString() {
        return "SeriesOfNumbers{" +
                "list=" + list +
                '}';
    }

    public static void main(String[] args) {
        SeriesOfNumbers seriesOfNumbers = new SeriesOfNumbers();
        seriesOfNumbers.start();
        System.out.println(seriesOfNumbers);
    }
}
