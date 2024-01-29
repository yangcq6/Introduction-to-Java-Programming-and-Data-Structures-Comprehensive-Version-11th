package chapter02.exer;

import java.util.Scanner;

public class Code2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double money = input.nextDouble();

        double m1 = money * (1 + 0.00417);
        double m2 = (100 + m1) * (1 + 0.00417);
        double m3 = (100 + m2) * (1 + 0.00417);
        double m4 = (100 + m3) * (1 + 0.00417);
        double m5 = (100 + m4) * (1 + 0.00417);
        double m6 = (100 + m5) * (1 + 0.00417);
    

        System.out.println(m6);

        input.close();
    }
}
