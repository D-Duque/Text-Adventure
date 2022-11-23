package com.github.dduque.IO;

import com.github.dduque.models.Player;

import java.util.Scanner;

public class Dialogue
{
    public static void displayIntroduction()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("\n======");
        System.out.println("REALMS");
        System.out.println("======\n");
        System.out.print("Welcome to REALMS! A text-based adventure RPG made by Daniel Duque. If you're ready to embark on this journey, press Enter... ");
        // awaits for user to hit Enter before continuing
        input.nextLine();
    }


}
