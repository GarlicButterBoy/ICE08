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

        //2d Array Example
        int rows = 8, columns = 8;
        float[][] chessBoard = new float[rows][columns];

        for (int x = 0; x < rows ; x++)
        {
            for (int y = 0; y < columns; y++) {
                chessBoard[x][y] = (100.0f * (float)Math.random()) + 1.0f;

            }
        }
        for (int x = 0; x < rows ; x++)
        {
            for (int y = 0; y < columns; y++)
            {
                var randRows = (int) (Math.random() * rows) + 1.0f;
                var randColumns = (int) (Math.random() * columns) + 1.0f;

                System.out.print("\nFor Row: " + (x + 1) + " For Columns: " + (y + 1) + " ");
                System.out.printf("\nThe random number is: %.2f", chessBoard[x][y]);
            }
        }
        //Output
        System.out.println();
        System.out.printf("You entered: %s\n", name);
        System.out.printf("Your entered: %.2f\n", age);
    }
}
