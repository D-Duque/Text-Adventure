package com.github.dduque.models;

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

}

