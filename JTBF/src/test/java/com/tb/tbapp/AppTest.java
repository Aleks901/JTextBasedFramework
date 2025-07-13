package test.java.com.tb.tbapp;

import static org.junit.jupiter.api.Assertions.*;

import main.java.com.tb.tbApp.models.item.Item;
import main.java.com.tb.tbApp.models.item.ItemType;
import org.junit.jupiter.api.Test;


public class AppTest
{

    private final Item item = new Item("TestItem", ItemType.ARMOR);

    @Test
    void IsArmor_NewItemObject_ReturnsTrue()
        {
            assertEquals(ItemType.ARMOR, item.getItemType());
        }

}
