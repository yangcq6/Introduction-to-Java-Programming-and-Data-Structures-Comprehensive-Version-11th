package chapter02.exer;

import java.util.Scanner;

public class Code2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int now = 312032486;

        System.out.print("Enter the number of years: ");
        int year = input.nextInt();

        int seconds = year * 365 * 24 * 60 * 60;

        int birth = seconds / 7;
        int death = seconds / 13;
        int immigration = seconds / 45;

        int sum = now + birth - death + immigration;

        System.out.println("人数为：" + sum);


        input.close();
    }
}
