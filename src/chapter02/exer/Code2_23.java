package chapter02.exer;

import java.util.Scanner;

public class Code2_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon");
        double mpg = input.nextDouble();
        System.out.print("Enter price per gallon");
        double price = input.nextDouble();

        double res = distance / mpg * price;

        System.out.println(res);

        input.close();
    }
}
