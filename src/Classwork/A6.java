package Classwork;

import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers there should be in the array: ");
        int numOfNumbers = sc.nextInt();
        int[] intArray = new int[numOfNumbers];
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("Enter a number for number " + (i+1) + " : ");
            intArray[i] = sc.nextInt();
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("Number " + (i+1) + " = ");
            System.out.print(intArray[i] + "\n");
        }

    }
}