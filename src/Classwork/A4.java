package Classwork;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Until what? " + num);
        int sum = 0;

        for(int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum is " + sum);
    }
}
