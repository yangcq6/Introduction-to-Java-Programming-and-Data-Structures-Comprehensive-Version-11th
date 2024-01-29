package chapter02.exer;

import java.util.Scanner;

public class Code2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        double res = pounds * 0.454;

        System.out.println(pounds + " pounds is " + res + " kilograms");


        input.close();
    }
}
