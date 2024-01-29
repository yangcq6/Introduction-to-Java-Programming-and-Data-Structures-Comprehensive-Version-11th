package chapter02.exer;

import java.util.Scanner;

public class Code2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58℉ and 41℉:");
        double temper = input.nextDouble();
        System.out.print("Enter the wind speed: ");
        double speed = input.nextDouble();

        double res = 35.74 + 0.6215 * temper - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temper * Math.pow(speed, 0.16);

        System.out.println(res);
        

        input.close();
    }
}
