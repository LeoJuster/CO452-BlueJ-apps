import java.util.Scanner;

/**
 * InputReader reads the text that is typed in the standard text terminal. 
 * Then the text that is typed by a user is returned.
 * 
 * @author Leo Juster
 * @version    0.1 (2016.02.29)
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public String getInput()
    {
        System.out.print("> ");         // this is a print prompt
        String inputLine = reader.nextLine();
        inputLine = inputLine.toLowerCase();
        
        return inputLine;
    }
}