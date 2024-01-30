package chapter03.exer;

import java.util.Scanner;

public class Code3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a,b,c,d,e,f");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double x = a * d - b * c;

        if (x == 0) {
            System.out.println("no solution");
        } else {
            double x1 = (e * d - b * f) / x;
            double x2 = (a * f - e * c) / x;
            System.out.println(x1 + " and " + x2);
        }


        input.close();
    }
}
