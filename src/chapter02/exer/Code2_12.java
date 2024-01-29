package chapter02.exer;

import java.util.Scanner;

public class Code2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");

        double s = input.nextDouble();
        double a = input.nextDouble();

        double res = s * s / (2 * a);

        System.out.println(res);


        input.close();
    }
}
