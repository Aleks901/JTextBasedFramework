package main.java.com.tb.tbApp.models.player;

import main.java.com.tb.tbApp.models.item.Item;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Player
{
    private String name;

    private int level;

    private int experience;

    public ArrayList<Item> inventory = new ArrayList<>();

    public ArrayList<Item> equippedItems = new ArrayList<>();

    public Player(String name,
                  int level,
                  int experience)
    {
        this.name = name;
        this.level = level;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    /*
    Purely for debugging purposes.
     */
    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    /*
    Purely for debugging purposes.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", experience=" + experience +
                ", inventory=" + inventory +
                ", equippedItems=" + equippedItems +
                '}';
    }

    public static Player createCharacter()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name your character: ");
        String name = scanner.nextLine();
        scanner.close();

        Player playerCharacter = new Player(name, 1, 1);
        return playerCharacter;
    }

    public void equipItem(Item item)
    {
        if (equippedItems.size() < 5)
        {
            equippedItems.add(item);
        }
        else
        {
            System.out.println("You waste a lot of energy trying to force another item onto your body, " +
                    "however you're already fully equipped. Perhaps you should unequip something first..");
        }
    }
}
