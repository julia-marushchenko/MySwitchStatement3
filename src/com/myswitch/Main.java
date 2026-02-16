/**
 *  Java program to demonstrate switch statement to find weather letter is vowel or consonant.
 */

package com.myswitch;

import java.util.Scanner;

/**
 *  Main.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating scanner to read from console.
        Scanner sc = new Scanner(System.in);

        // Reading character.
        char ch = sc.next().charAt(0);

        // Creating switch statement.
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");

        }
    }
}