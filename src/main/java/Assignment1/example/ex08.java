/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment1.example;


import java.util.Scanner;

public class ex08
{
    public static void main( String[] args )
    {
        System.out.print( "How many people? " );
        Scanner amountOfPeople = new Scanner(System.in);
        String numPeople = amountOfPeople.nextLine();
        int x = Integer.parseInt(numPeople);

        System.out.print( "How many pizzas do you have? " );
        Scanner numPizzas = new Scanner(System.in);
        String totalPizzas = numPizzas.nextLine();
        int y = Integer.parseInt(totalPizzas);

        System.out.print( "How many slices per pizza? ");
        Scanner sliceTotal = new Scanner(System.in);
        String numSlices = sliceTotal.nextLine();
        int slicePerPizza = Integer.parseInt(numSlices);

        int z = slicePerPizza * y;
        int slicePerPerson = z / x;

        System.out.println(x + " people with " + y + " pizzas (" + z + " slices)" );
        System.out.println("Each person gets " + slicePerPerson + " pieces of pizza.");
        System.out.println("There are " + z%x + " leftover pieces.");
    }
}
