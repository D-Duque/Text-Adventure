package com.github.dduque.IO.scenes;

import java.util.Scanner;

public class SceneOne
{
    private static Scanner input = new Scanner(System.in);
    private static String sceneDesc;
    private static String question;
    private static String choice1;
    private static String choice2;
    private static String choice3;

    public static void SceneOneMain()
    {
        // TODO: Migrate text into text files to load from
        sceneDesc = "\nHere is where the text of Scene One will go, marking the beginning of the player's journey into the medieval world where they find themselves at the base of a mountain on their way to slay a dragon.";
        question = "What would you like to do?";
        choice1 = "[Explore] the base.";
        choice2 = "[Climb] the mountain.";
        choice3 = "[Third] option"; // TODO: add 3rd option

        System.out.println(sceneDesc);
        System.out.println(question);
        System.out.println(choice1);
        System.out.println(choice2);
        String answer = input.nextLine().toLowerCase().trim();

        validateChoice(answer,choice1, choice2, choice3);

    }

    public static void SceneOneA()
    {
        sceneDesc = "This is where the text for scene 1-A would go.";
        question = "What next?";
        choice1 = "[Do] first thing";
        choice2 = "[Second] thing";
        choice3 = "[Climb] mountain";
        System.out.println(sceneDesc);
        System.out.println(question);
        System.out.println(choice1);
        System.out.println(choice2);

        String answer = input.nextLine();

        validateChoice(answer, choice1, choice2, choice3);
    }

    public static void validateChoice(String answer, String choice1, String choice2, String choice3)
    {
        boolean isAnswerValid = false;

        choice1 = choice1.substring(1, choice1.indexOf(']'));
        choice2 = choice2.substring(1, choice2.indexOf(']'));
        choice3 = choice3.substring(1, choice3.indexOf(']'));

        do {
            if (!answer.equalsIgnoreCase(choice1) && !answer.equalsIgnoreCase(choice2))
            {
                System.out.println("not a valid input. Try again: ");
                answer = input.nextLine();
            }
            else
            {
                if (answer.equalsIgnoreCase(choice1))
                {
                    // Link to Scene One-A
                    //TODO: Make this part modular if possible
                    SceneOneA();
                    isAnswerValid = true;

                }
                else
                {
                    // Link to Scene One-B
                    System.out.println("This is what the results of choosing to climb the mountain would be.");
                    isAnswerValid = true;
                }
            }
            // TODO: Add code for 3rd option
        } while (!isAnswerValid);

    }
}
