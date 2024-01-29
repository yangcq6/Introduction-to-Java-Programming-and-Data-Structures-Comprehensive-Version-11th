package chapter02.exer;

import java.util.Scanner;

public class Code2_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 y1 x2 y2 x3 y3 :");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double dx1 = x1 - x2, dy1 = y1 - y2;
        double dx2 = x1 - x3, dy2 = y1 - y3;
        double dx3 = x2 - x3, dy3 = y2 - y3;

        double s1 = Math.pow(dx1 * dx1 + dy1 * dy1, 0.5);
        double s2 = Math.pow(dx2 * dx2 + dy2 * dy2, 0.5);
        double s3 = Math.pow(dx3 * dx3 + dy3 * dy3, 0.5);

        double s = (s1 + s2 + s3) / 2;

        double area = Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);

        System.out.println(area);

        input.close();
    }
}
