package Classwork;

import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers there should be in the array: ");
        int countOfNumbers = sc.nextInt();
        int[] intArray = new int[countOfNumbers];
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("Enter a number for number " + (i + 1) + " : ");
            intArray[i] = sc.nextInt();
        }

        for (int j = intArray.length - 1; j >= 0; j--) {
            System.out.print("Number " + (j+1) + " = ");
            System.out.print(intArray[j] + "\n");

            }
        }
    }

