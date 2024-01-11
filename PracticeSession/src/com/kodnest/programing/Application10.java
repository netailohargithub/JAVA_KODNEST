package com.kodnest.programing;

import java.util.Scanner;

public class Application10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        Question10 q10 =new Question10();

        q10.decodeCharacter(ch);
        System.out.println("Unicode value of '" + ch + "' is: " +  q10.decodeCharacter(ch));

        scanner.close();
    }

	
}
