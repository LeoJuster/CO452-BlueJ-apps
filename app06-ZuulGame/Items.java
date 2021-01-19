/**
 * Static class Items that creates all items in the game.
 */
public class Items
{
    private Item Laptop;
    private Item Water;
    private Item Keys;
    private Item treasureBox;

    public Items() 
    {
        Laptop = new Item("Laptop","Pick up the laptop to increase your score");
        Water = new Item("Water","Pick up the water to increaste your score");
        Keys = new Item("Keys","Pick up the Keys to increse your score and open the locked door");
        treasureBox = new Item("Treasure-Box","Please pick up the treasure box to win the game");
    }

    public Item getLaptop() {
        return Laptop;
    }

    public Item getWater() {
        return Water;
    }

    public Item getKeys() {
        return Keys;
    }

    public Item getTreasure() {
        return treasureBox;
    }
}