/*
 * Author      : Nick Sturch-Flint
 * Date        : November 11, 2020
 * Program Name: In-Class Exercise 08
 */
package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Declarations
        String name = "";
        Scanner keyboard = new Scanner(System.in);
        float age = 0.0f;
        boolean dirtyFlag = true;

        //Input
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        while (dirtyFlag)
        {
            try
            {
                System.out.print("Please enter your age : ");
                age = keyboard.nextFloat();
                //Validation
                if (age <= 0.0f || age > 100.00f)
                {
                    System.out.print("\nYou must enter a valid float greater than 0.00 or lower than 100.00\n");
                    keyboard.nextLine();
                    dirtyFlag = true;
                }
                else
                    {
                        dirtyFlag = false;
                    }
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.print("\nYou must enter a valid float greater than 0.00 or lower than 100.00\n");
                keyboard.nextLine();
                dirtyFlag = true;
            }
        }


        //Output
        System.out.println();
        System.out.printf("You entered: %s\n", name);
        System.out.printf("Your entered: %.2f\n", age);
    }
}
