package chapter03.exer;

import java.util.Scanner;

public class Code3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter today's day");
        int today = input.nextInt();
        System.out.print("numbers: ");
        int nums = input.nextInt();

        int res = (today + nums) % 7;

        switch (res) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            default:
                break;
        }
        
        
        
        input.close();
    }
}
