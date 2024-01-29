package chapter02.exer;

import java.util.Scanner;

public class Code2_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate: ");
        double bal = input.nextDouble();
        double rate = input.nextDouble();

        double res = bal * (rate / 1200);

        System.out.println(res);


        input.close();
    }
}
