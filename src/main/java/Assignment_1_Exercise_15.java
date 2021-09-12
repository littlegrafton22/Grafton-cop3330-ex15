/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Grafton
 */
import java.util.Scanner;
public class Assignment_1_Exercise_15 {
    public static void main(String[] args) {

        String knownPassword  = "abc$123";

        System.out.print("Enter your Username : ");
        Scanner s = new Scanner(System.in);    //creating Scanner class object to scan user input
        String username = s.nextLine();

        System.out.print("What is the password ? : ");
        String password = s.nextLine();


        //equals() method returns true if Two strings are same
        if(knownPassword.equals(password))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
}
