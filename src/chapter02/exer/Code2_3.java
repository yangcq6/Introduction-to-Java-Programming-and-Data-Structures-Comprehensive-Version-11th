package chapter02.exer;

import java.util.Scanner;

public class Code2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        double res = feet * 0.305;
        System.out.println(feet + " feet is " + res + " meters");

        input.close();
    }
}
