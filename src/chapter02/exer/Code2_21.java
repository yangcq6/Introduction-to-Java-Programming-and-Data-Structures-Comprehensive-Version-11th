package chapter02.exer;

import java.util.Scanner;

public class Code2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double money = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double rate = input.nextDouble();
        System.out.print("Enter number of years");
        int year = input.nextInt();

        double res = money * Math.pow( (1 + rate / 100 / 12), year * 12 );

        System.out.println(res);

        input.close();
    }
}
