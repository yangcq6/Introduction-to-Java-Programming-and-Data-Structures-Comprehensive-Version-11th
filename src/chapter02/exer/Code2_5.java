package chapter02.exer;

import java.util.Scanner;

public class Code2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double sb = input.nextDouble();
        double rate = input.nextDouble();

        double fee = sb * (rate / 100);
        double total = sb + fee;

        System.out.println("The gratuity is $" + fee + " and total is$" + total);

        input.close();
    }
}
