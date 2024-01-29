package chapter02.exer;

import java.util.Scanner;

public class Code2_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in int ");
    
        int remainingAmount = input.nextInt();

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println(numberOfOneDollars);
        System.out.println(numberOfQuarters);
        System.out.println(numberOfDimes);
        System.out.println(numberOfNickels);
        System.out.println(numberOfPennies);






        input.close();
    }
}
