/*
 *  UCF COP3330 Fall 2021 Assignment 27 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise27;

import java.util.Scanner;
import java.util.ArrayList;

public class Solution27
{
        public static void characterLength(String input, String name, ArrayList<String> check)
        {
            if (input.length() < 2) 
            {
                check.add("The " + name + " must be at least 2 characters long.");
            }
        }
        
        public static void EmployeeIdCheck(String input, String ID, ArrayList<String> checkID)
        {
            if (!input.matches("[a-zA-Z]{2}-[0-9]{4}"))
            {
                checkID.add("The " + ID + " must be in the format of AA-1234.");
            }
        }
    public static void nameCheck(String input, String name, ArrayList<String> check)
    {
        if (input.isEmpty())
        {
            check.add("The " + name + " must be filled in.");
        }
    }

    public static void zipcodeCheck(String input, String zipcode, ArrayList<String> errors)
    {
        if (!input.matches("[0-9]+") || input.length() != 5)
        {
            errors.add("The " + zipcode + " must be a 5 digit number.");
        }
    }

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter the first name: ");
            String firstName = scan.nextLine();
            System.out.print("Enter the second name: ");
            String secondName = scan.nextLine();
            System.out.print("Enter the ZIP code: ");
            String zipCode = scan.nextLine();
            System.out.print("Enter the employee ID: ");
            String employeeID = scan.nextLine();

            ArrayList<String> errors = new ArrayList<>();
            characterLength(firstName, "first name", errors);
            characterLength(secondName, "second name", errors);
            nameCheck(firstName, "first name", errors);
            nameCheck(secondName, "second name", errors);
            EmployeeIdCheck(employeeID, "employee ID", errors);
            zipcodeCheck(zipCode, "zipcode", errors);

            if (errors.isEmpty())
            {
                System.out.println("There were no errors found.");
            }
            for (String error : errors)
            {
                System.out.println(error);
            }
            scan.close();
        }
}