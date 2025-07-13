package main.java.com.tb.tbApp;
import main.java.com.tb.tbApp.models.item.Item;
import main.java.com.tb.tbApp.models.item.ItemType;
import main.java.com.tb.tbApp.models.item.Rarity;
import main.java.com.tb.tbApp.models.item.WepType;
import main.java.com.tb.tbApp.models.player.Player;

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        Item sword = new Item("Test", ItemType.WEAPON, WepType.SWORD, Rarity.LEGENDARY);
        Item boots = new Item("TestBoots", ItemType.ARMOR, Rarity.LEGENDARY);
        Item chest = new Item("Chest Piece", ItemType.ARMOR, Rarity.LEGENDARY);
        Item legs = new Item("Pants", ItemType.ARMOR, Rarity.LEGENDARY);
        Item shoulders = new Item("Shoulderpad", ItemType.ARMOR, Rarity.LEGENDARY);
        Item anotherpairofBoots = new Item("Poopieboots", ItemType.ARMOR, Rarity.COMMON);

        Player pc = new Player("Aleks", 1, 1);

    }
}
