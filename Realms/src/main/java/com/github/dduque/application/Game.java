package com.github.dduque.application;

import com.github.dduque.IO.Dialogue;
import com.github.dduque.models.Player;

public class Game
{
    public static void main(String[] args)
    {
        Dialogue.displayIntroduction();
        Player.createCharacter();
    }




}
