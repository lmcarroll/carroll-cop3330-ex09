/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        System.out.println("What is the length?");
        Scanner input = new Scanner(System.in);
        String NotInt = input.nextLine();
        int length = Integer.parseInt(NotInt);

        System.out.println("What is the width?");
        input = new Scanner(System.in);
        NotInt = input.nextLine();
        int width = Integer.parseInt(NotInt);

        int area = length * width;
        int a = 350;
        int i = 1;

        while (a < area){
            a += 350;
            i++;
        }

        System.out.println("You will need to purchase " + i + " gallons of paint to cover " + area + " square feet.");
    }
}
