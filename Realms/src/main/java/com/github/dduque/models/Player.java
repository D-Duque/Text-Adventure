package com.github.dduque.models;

import com.github.dduque.IO.Dialogue;

import java.util.Scanner;

public class Player
{
    private String name;
    private String archetype;
    private int health = 100;

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public String getArchetype(){return archetype;}

    // For later functionality
    public int getHealth(){return health;}
    public void setHealth(int health){this.health = health;}

    public Player()
    {

    }

    public Player(String name, String archetype)
    {
        this.name = name;
        this.archetype = archetype;
    }

    public Player(String name, String archetype, int health)
    {
        this.name = name;
        this.archetype = archetype;
        this.health = health;
    }

    public static Player createCharacter()
    {
        Player player = new Player();
        Scanner input = new Scanner(System.in);

        // confirm & set player name
        confirmName(player, input);
        // prompt user to choose an archetype
        Dialogue.displayArchetypeSelection();
        String choice = input.nextLine();
        // set player instance as archetype input
        player.setArchetype(choice);
        System.out.println("You chose: " + player.getArchetype());

        return player;
    }

    public static void confirmName(Player player, Scanner input)
    {
        char confirmation;
        String playerName;

        do
        {
            System.out.println("What do you call yourself? ");
            playerName = input.nextLine();
            do
            {
                System.out.println("...So, your name is... " + playerName + "? (Y/N)");
                confirmation = input.nextLine().toLowerCase().charAt(0);
            }
            while (confirmation != 'n' && confirmation != 'y');
        }
        while (confirmation == 'n');
        player.setName(playerName);
        System.out.println("A glorious name you have chosen!");
    }

    public void setArchetype(String choice)
    {
        switch (choice)
        {
            case "1": this.archetype = "knight";
                      break;
            case "2": this.archetype = "mage";
                      break;
            case "3": this.archetype = "rogue";
                      break;
        }
    }
}

