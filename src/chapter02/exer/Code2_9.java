package chapter02.exer;

import java.util.Scanner;

public class Code2_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");

        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double res = (v1 - v0) / t;

        System.out.println("The average acceleration is " + res);


        input.close();
    }
}
