package com.github.dduque.application;

import com.github.dduque.IO.UserOutput;
import com.github.dduque.IO.scenes.SceneOne;
import com.github.dduque.models.Player;

public class Game
{
    public static void main(String[] args)
    {
        // game welcome
        UserOutput.displayWelcome();

        // character creator
        Player.createCharacter();

        // Story intro
        UserOutput.displayIntroduction();
        // First Scene
        SceneOne.SceneOneMain();
        // Second Scene

        // Third Scene

    }
}
