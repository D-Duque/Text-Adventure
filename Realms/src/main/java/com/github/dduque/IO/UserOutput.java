package com.github.dduque.IO;

import java.util.Scanner;

public class UserOutput
{
    private static Scanner input = new Scanner(System.in);

    // Introduction
    public static void displayWelcome()
    {
        System.out.println("\n======");
        System.out.println("REALMS");
        System.out.println("======\n");
        System.out.print("Welcome to REALMS! A text-based adventure RPG made by Daniel Duque. If you're ready to embark on this journey, press Enter... ");
        // awaits for user to hit Enter before continuing
        input.nextLine();

        System.out.println(". . .");
        System.out.println("...And so your journey begins. Although, no journey can begin without a name for the bards to sing of...\n");
    }

    public static void displayArchetypeSelection()
    {
        System.out.println("\nThe vaunted heroes of eld came in many Archetypes: some were knights of furious sword and stalwart shield, others were clever mages weaving destruction incarnate, and then there were the unseen rogues who struck from the shadows!");
        System.out.println("Tell me, were you a [1] Knight, a [2] Mage, or a [3] Rogue? (Enter a number: ");
    }

   public static void displayIntroduction()
   {
       System.out.println("\nHere is where the stage will be set. The setting of the story shall be introduced and the player will be immersed into the world.");
       input.nextLine();
   }


}
