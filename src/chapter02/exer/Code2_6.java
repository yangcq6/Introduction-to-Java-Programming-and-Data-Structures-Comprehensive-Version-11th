package chapter02.exer;

import java.util.Scanner;

public class Code2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");

        int num = input.nextInt();

        int bai = num / 100;
        int shi = num / 10 % 10;
        int ge = num % 10;
        

        int s = bai + shi + ge;
        System.out.println("The sum of the digits is " + s);


        input.close();
    }
}
