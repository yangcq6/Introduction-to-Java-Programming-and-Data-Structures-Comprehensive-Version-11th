package chapter02.exer;

import java.util.Scanner;

public class Code2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the side: ");
        double s = input.nextDouble();

        double res = 3 * Math.pow(3, 0.5) / 2 * s * s;

        System.out.println(res);

        input.close();
    }
}
