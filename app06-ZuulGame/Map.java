import java.util.ArrayList;

/**
 * Write a description of class Map here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Map
{
    private Room outside;
    private Room startRoom;
    private Room theater;
    private Room pub;
    private Room lab;
    private Room office;
    private Room gym;
    private Room parkingLot;
    private Room cafeteria;
    private Room hallway;
    private Items items;

    public Map()
    {
        items = new Items();
        createRooms();
        setExits();

    }


    public Room getStartRoom()
    {
        return startRoom;
    }

    private void createRooms()
    {
        outside = new Room("You are currently outside the University",null);
        theater = new Room("You have entered the lecture theater",items.getLaptop());
        pub = new Room("Your in the pub on campus",null);
        lab = new Room("You have entered the computing lab", null);
        office = new Room("You have now entered the Office", null);
        parkingLot = new Room("You are in the Parking lot", null);
        gym = new Room("You are at the university gym", items.getWater());
        cafeteria = new Room("You are now in the cafeteria", items.getKeys());
        hallway = new Room("You are in the university hallway", items.getHardrive());

        startRoom = outside;  // start game outside
    }

    private void setExits() 
    {
        outside.setExit("east", theater);
        outside.setExit("south", lab);
        outside.setExit("west", pub);
        outside.setExit("north", parkingLot);

        theater.setExit("west", outside);

        pub.setExit("east", outside);
        pub.setExit("north", gym);
        pub.setExit("south", cafeteria);

        lab.setExit("north", outside);
        lab.setExit("east", office);
        lab.setExit("west", cafeteria);

        office.setExit("west", lab);
        office.setExit("south", hallway);

        parkingLot.setExit("south", outside);

        gym.setExit("south",pub);

        cafeteria.setExit("north",pub);
        cafeteria.setExit("east",lab);

        hallway.setExit("north",office);
    }
}
