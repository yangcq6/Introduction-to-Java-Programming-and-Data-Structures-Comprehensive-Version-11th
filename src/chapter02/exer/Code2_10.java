package chapter02.exer;

import java.util.Scanner;

public class Code2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double amount = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double init = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double end = input.nextDouble();

        double res = amount * (end - init) * 4184;

        System.out.println("The energy needed is " + res);



        input.close();
    }
}
