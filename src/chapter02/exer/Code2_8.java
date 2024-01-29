package chapter02.exer;

import java.util.Scanner;

public class Code2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");

        int offset = input.nextInt();

        long totalMills = System.currentTimeMillis();

        long totalSeconds = totalMills / 1000;
        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        currentHours += offset;

        currentHours %= 24;

        System.out.printf("%d, %d, %d", currentHours, currentMinutes, currentSeconds);


        input.close();
    }
}
