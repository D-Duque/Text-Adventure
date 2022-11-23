package com.github.dduque.models;

import java.util.Scanner;

public class Player
{
    private String name;
    private String archetype;
    private int health = 100;

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public String getArchetype(){return archetype;}
    public void setArchetype(String archetype){this.archetype = archetype;}
    public int getHealth(){return health;}
    public void setHealth(int health){this.health = health;}

    public Player()
    {

    }

    public Player(String name, String archetype, int health)
    {
        this.name = name;
        this.archetype = archetype;
        this.health = health;
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
        String answer = input.nextLine();

        confirmName(answer, playerName);
    }

    public static void confirmName(String answer, String name)
    {
        Player player = new Player();
        Scanner input = new Scanner(System.in);

        boolean isValidInput = answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("y");

// TODO: set loop to validate user input if not yes or no
        while (!isValidInput)
        {
            System.out.println("Not a valid input.");
            System.out.println("...To confirm, your name is... " + name + "? (Y/N)");
            answer = input.nextLine();
        }

        while (answer.equalsIgnoreCase("n"))
        {
            System.out.println("Alright! What do you call yourself? ");
            String playerName = input.nextLine();
            player.setName(playerName);
            System.out.println("...To confirm, your name is... " + player.getName() + "? (Y/N)");
            answer = input.nextLine();

            while (!isValidInput)
            {
                System.out.println("Not a valid input.");
                System.out.println("...To confirm, your name is... " + player.getName() + "? (Y/N)");
                answer = input.nextLine();
            }
        }


        System.out.println("A glorious name you have chosen!");
    }

}

