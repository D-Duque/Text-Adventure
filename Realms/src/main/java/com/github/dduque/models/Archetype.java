package com.github.dduque.models;

public class Archetype
{
    private String archetype;
//TODO: future functionality where each archetype has unique properties

//    private int healthBonus;
//    private int armorBonus;
//    private int damageBonus;
//    private int charismaBonus;
//    private int stealthBonus;

    public Archetype()
    {

    }
    public Archetype(String archetype)
    {
        this.archetype = archetype;
    }

    public String getArchetype()
    {
        return archetype;
    }

    public void setArchetype(String archetype)
    {
        this.archetype = archetype;
    }
}
