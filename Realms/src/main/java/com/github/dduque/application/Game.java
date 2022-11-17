package com.github.dduque.application;

import com.github.dduque.models.Player;

import java.util.Scanner;

public class Game
{
    public static void main(String[] args)
    {
        mainMenu();
        createCharacter();

    }

    public static void mainMenu()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("\n======");
        System.out.println("REALMS");
        System.out.println("======\n");
        System.out.print("Welcome to REALMS! A text-based adventure RPG made by Daniel Duque. If you're ready to embark on this journey, press Enter... ");
        // awaits for user to hit Enter before continuing
        input.nextLine();
    }

    public static void createCharacter()
    {
        Player player = new Player();
        Scanner input = new Scanner(System.in);

        System.out.println(". . .\n");
        System.out.println("...And so your journey begins. Although, no journey can begin without a name for the bards to sing of...What do you call yourself? ");
        String playerName = input.nextLine();
        player.setName(playerName);
        System.out.println("...To confirm, your name is... " + player.getName() + "? (Y/N)");

        // refactor into name method. Maybe in Player class?
        String answer = input.nextLine();

        if (!answer.equalsIgnoreCase("n"))
        {
            System.out.println("Not a valid input.");
            System.out.println("...To confirm, your name is... " + player.getName() + "? (Y/N)");
            answer = input.nextLine();
        }

        while (answer.equalsIgnoreCase("n"))
        {

            System.out.println("Alright! What do you call yourself? ");
            playerName = input.nextLine();
            player.setName(playerName);
            System.out.println("...To confirm, your name is... " + player.getName() + "? (Y/N)");
            answer = input.nextLine();

        }
        System.out.println("A glorious name you have chosen!");
    }

}
