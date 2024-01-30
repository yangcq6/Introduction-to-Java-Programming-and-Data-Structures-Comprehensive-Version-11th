package chapter03.exer;

import java.util.Scanner;

public class Code3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);

        System.out.print("what is " + a + " + " + b + " + " + c + " = ?");

        int res = input.nextInt();

        if (res == (a + b + c)) {
            System.out.println("bingo");
        } else {
            System.out.println("wrong");
        }

        input.close();
    }
}
