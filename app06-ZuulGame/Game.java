/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 * 
 * Modified and extended by Student Name
 */

public class Game 
{
    private Map map;
    private Parser parser;
    private Room currentRoom;
    private Player player;

    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        map = new Map();
        currentRoom = map.getStartRoom();
        player = new Player ("Leo Juster");
        parser = new Parser();
        play();
    }

    public void play() {
        printWelcome();

        // Enter the main command loop. Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;

        while (!finished) {

            if (this.player.findItem("hardrive") != null) {
                return;
            } 
            else {
                Command command = parser.getCommand();
                finished = processCommand(command);
            }
        }

        System.out.println("Thank you for playing.  Good bye.");
    }
    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome!");
        System.out.println("The fate of many students is now in your hands");
        System.out.println("Work your way around the univerity to find the lost");
        System.out.println("hardrive containing the students grades.");
        System.out.println("Type '" + CommandWord.HELP + "' if you need help.");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
    }

     /**
     * Given a command, process (that is: execute) the command.
     *
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) {
        boolean wantToQuit = false;

        CommandWord commandWord = command.getCommandWord();

        switch (commandWord) {

            case HELP:
                printHelp();
                break;

            case GO:
                goRoom(command);
                break;

            case PICK:
                pickItem(command);
                break;

            case QUIT:
                wantToQuit = quit(command);
                break;

            default:

            case UNKNOWN:
                System.out.println("I don't know what you mean...");
                break;
        }
        return wantToQuit;
    }

    private void pickItem(Command command) {
        if (!command.hasSecondWord()) {
            // If the second wor is not there, we don't know where to go...
            System.out.println("What would you like to pick up?");
            return;
        }

        String itemName = command.getSecondWord();
        Item currentRoomItem = currentRoom.getItem();

        if (currentRoomItem.getItemName().equals(itemName)) {
            player.addItem(currentRoomItem);
            player.increaseScore(1);
        } else {
            System.out.println("there is no item in this room.");
        }
    }

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println("Find the hidden items around the university and retrive the hardrive");
        System.out.println();
        System.out.println("Your command words are:");
        parser.showCommands();
    }

    
    /**
     * Try to go in one direction. If there is an exit, enter the new room,
     * otherwise print an error message.
     */
    private void goRoom(Command command) {
        if (!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }
        String direction = command.getSecondWord();
        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no door!");
        } else {
            if (isOffice(nextRoom)) {
                Item keys = player.findItem("keys");
                if (keys == null) {
                    System.out.println("You should find the key to unlock this door");
                } else {
                    currentRoom = nextRoom;
                    System.out.println(currentRoom.getLongDescription());
                }
            } else {
                currentRoom = nextRoom;
                System.out.println(currentRoom.getLongDescription());
                if (currentRoom.getItem() != null) {
                    System.out.println(currentRoom.getItem().getDescription());
                }
            }
        }
    }

    /**
     * "Quit" was entered. Check the rest of the command to see whether we really
     * quit the game.
     * 
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) {
        if (command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        } else {
            return true; // signal that we want to quit
        }
    }

    private boolean isOffice(Room nextRoom) {
        if (nextRoom.getLongDescription().contains("office")) {
            return true;
        }
        return false;
    }
}