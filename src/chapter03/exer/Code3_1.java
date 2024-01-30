package chapter03.exer;

import java.util.Scanner;

public class Code3_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a, b, c");

        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("The equation has no real roots");
        } else if (delta == 0) {
            double x = (-b + Math.pow(delta, 0.5)) / (2 * a);
            System.out.println("one root: " + x);
        } else {
            double x1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
            double x2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
            System.out.println(x1 + " and " + x2);
        }

        input.close();
    }
}