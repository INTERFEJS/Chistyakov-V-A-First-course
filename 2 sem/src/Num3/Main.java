package Num3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int ey, ex, dy, dx, fy, fx;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите x координату вершины E: ");
        ex = in.nextInt();
        System.out.println("Введите y координату вершины E: ");
        ey = in.nextInt();
        System.out.println("Введите x координату вершины D: ");
        dx = in.nextInt();
        System.out.println("Введите y координату вершины D: ");
        dy = in.nextInt();
        System.out.println("Введите x координату вершины F: ");
        fx = in.nextInt();
        System.out.println("Введите y координату вершины F: ");
        fy = in.nextInt();
        in.close();
        double centroidY = (ey + dy + fy)/3.000;
        double centroidX = (ex + dx + fx)/3.000;
        String x = String.format("%.3f", centroidX);
        String y = String.format("%.3f", centroidY);
        System.out.print("Координаты барицентра треугольника: " +x);
        System.out.print(", " +y);
    }
}
