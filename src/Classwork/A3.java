package Classwork;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input1 = sc.nextInt();
        System.out.println("Enter a second number:");
        int input2 = sc.nextInt();
        sc.close();

        for (int i = input1; i <= input2; i++) {
            if(i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }


    }
}
