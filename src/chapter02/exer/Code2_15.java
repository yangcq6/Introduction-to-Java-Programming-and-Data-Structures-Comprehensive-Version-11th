package chapter02.exer;

import java.util.Scanner;

public class Code2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble(), y2 = input.nextDouble();

        double dx = x1 - x2, dy = y1 - y2;

        double res = Math.pow(dx * dx + dy * dy, 0.5);

        System.out.println(res);

        input.close();
    }
}
