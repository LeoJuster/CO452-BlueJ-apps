/**
 * Static class Items that creates all items in the game.
 */
public class Items
{
    private Item laptop;
    private Item water;
    private Item keys;
    private Item hardrive;

    public Items() 
    {
        laptop = new Item("Laptop","Pick up the laptop to increase your score");
        water = new Item("Water","Pick up the water to increase your score");
        keys = new Item("Keys","Pick up the Keys to increse your score and open the locked door");
        hardrive = new Item("Hardrive","Pick up the hardrive and win the game");
    }

    public Item getLaptop() {
        return laptop;
    }

    public Item getWater() {
        return water;
    }

    public Item getKeys() {
        return keys;
    }

    public Item getHardrive() {
        return hardrive;
    }
}