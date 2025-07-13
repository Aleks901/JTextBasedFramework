package main.java.com.tb.tbApp.models.item;

public class Item
{

    private String name;

    private ItemType itemType;

    private WepType wepType;

    private GearType gearType;

    private Rarity rarity;

    /*
    For making gear items
     */
    public Item(String name, ItemType itemType, GearType gearType, Rarity rarity)
    {
        this.name = name;
        this.itemType = itemType;
        this.gearType = gearType;
        this.rarity = rarity;
    }

    /*
    For making weapon items
     */
    public Item(String name, ItemType itemType, WepType wepType, Rarity rarity)
    {
        this.name = name;
        this.itemType = itemType;
        this.wepType = wepType;
        this.rarity = rarity;
    }

    /*
    For making misc items
     */
    public Item(String name, ItemType itemType, Rarity rarity) {
        this.name = name;
        this.itemType = itemType;
        this.rarity = rarity;
    }

    /*
    For making currency or misc items without rarity
     */
    public Item(String name, ItemType itemType) {
        this.name = name;
        this.itemType = itemType;
    }

    @Override
    public String toString() {

        if (rarity == null && gearType == null && wepType == null)
        {
            return "Item:{" +
                    "name='" + name + '\'' +
                    ", itemType=" + itemType +
                    '}';
        }

        if (wepType == null && gearType == null)
        {
            return "Item:{" +
                    "name='" + name + '\'' +
                    ", itemType=" + itemType +
                    ", rarity=" + rarity +
                    '}';
        }

        if (wepType == null)
        {
            return "Item:{" +
                    "name='" + name + '\'' +
                    ", itemType=" + itemType +
                    ", gearType=" + gearType +
                    ", rarity=" + rarity +
                    '}';
        }

        if (gearType == null)
        {
            return "Item:{" +
                    "name='" + name + '\'' +
                    ", itemType=" + itemType +
                    ", wepType=" + wepType +
                    ", rarity=" + rarity +
                    '}';
        }


        return "Item:" +
                "name='" + name + '\'' +
                ", itemType=" + itemType +
                ", wepType=" + wepType +
                ", gearType=" + gearType +
                ", rarity=" + rarity +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public WepType getWepType() {
        return wepType;
    }

    public void setWepType(WepType wepType) {
        this.wepType = wepType;
    }

    public GearType getGearType() {
        return gearType;
    }

    public void setGearType(GearType gearType) {
        this.gearType = gearType;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }
}
