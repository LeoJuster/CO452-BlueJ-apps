import java.util.Scanner;

/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 * 
 * This parser reads user input and tries to interpret it as an "Adventure"
 * command. Every time it is called it reads a line from the terminal and
 * tries to interpret the line as a two-word command. It returns the command
 * as an object of class Command.
 *
 * The parser has a set of known command words. It checks user input against
 * the known commands, and if the input is not one of the known commands, it
 * returns a command object that is marked as an unknown command.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class Parser 
{
    private CommandWords commands;  // holds all valid command words
    private InputReader reader; // reads user input

    /**
     * Create a parser to read from the terminal window.
     */
    public Parser() 
    {
        commands = new CommandWords();
        reader = new InputReader();
    }

    /**
     * @return The next command from the user.
     */
    public Command getCommand() 
    {
        String inputLine=reader.getString();   // will hold the full input line
        String word1 = null;
        String word2 = null;

        // Find up to two words on the line.
        Scanner words = new Scanner(inputLine);
        
        if(words.hasNext())
        {
            word1 = words.next();      // get first word
        
            if(words.hasNext())
            {
                word2 = words.next();      // get second word
                // note: we just ignore the rest of the input line.
            }
        }

        return new Command(commands.getCommandWord(word1), word2);
    }

    /**
     * Print out a list of valid command words.
     */
    public void showCommands()
    {
        commands.showAll();
    }
}