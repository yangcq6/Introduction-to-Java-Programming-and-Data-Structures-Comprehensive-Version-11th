package chapter02.exer;

import java.util.Scanner;

public class Code2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");

        long mins = input.nextLong();

        long year = mins / (365 * 24 * 60);
        mins %= 365 * 24 * 60;
        long day = mins / (24 * 60);

        System.out.println(mins + " minutes is approximately " + year + " years and " + day + " days");

        input.close();
    }
}
