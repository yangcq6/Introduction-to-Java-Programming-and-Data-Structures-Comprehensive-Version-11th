package chapter02.exer;

import java.util.Scanner;

public class Code2_14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double w = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double h = input.nextDouble();

        double res = w * 0.45359237 / Math.pow(h * 0.0254, 2);

        System.out.println(res);

        input.close();

    }
}
