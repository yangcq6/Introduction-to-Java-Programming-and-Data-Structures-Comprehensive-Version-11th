package chapter02.exer;

import java.util.Scanner;

public class Code2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius and length of a cylinder: ");

        double r = input.nextDouble();
        double h = input.nextDouble();

        double area = r * r * 3.14159;
        double volume = area * h;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

        input.close();
    }
}
