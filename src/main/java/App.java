/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Scanner;

public class App{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?");
        int euros = Integer.parseInt(input.nextLine());

        System.out.println("What is the exchange rate?");
        double rate = Double.parseDouble(input.nextLine());

        System.out.format("%d Euros at an exchange rate of %.4f is\n%.2f U.S. dollars.", euros, rate, rate*euros);
    }
}