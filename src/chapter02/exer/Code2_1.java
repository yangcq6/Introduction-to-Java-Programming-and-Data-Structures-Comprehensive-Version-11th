package chapter02.exer;

import java.util.Scanner;

public class Code2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double cels = input.nextDouble();

        double res = (9.0 / 5) * cels + 32;

        System.out.println(cels + " Celsius is " + res + " Fahrenheit");

        input.close();
    }
}
