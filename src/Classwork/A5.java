package Classwork;

import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        int[] intArray = {3, 10, 42, 12, 52, 234, 12, 44, 87, 1};
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number that should be in the array: ");
        int inputUser = sc.nextInt();
        int itemsFound = 0;

        for(int aInputUser : intArray) {
            if (aInputUser != inputUser) {
                continue;
            }
            itemsFound++;
        }
        if (itemsFound == 0) {
            System.out.println("Nothing found!");
        } else {
            System.out.println("Found items: " + itemsFound);
        }
    }
}
