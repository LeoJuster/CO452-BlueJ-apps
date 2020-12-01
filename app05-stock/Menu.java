/**
 * Write a description of class Menu here.
 *
 * @author Leo Juster
 * @version (a version number or a date)
 */
public class Menu
{
    private InputReader reader;
  
    public String getMenuChoice(String [] choices)
    {
       boolean finished = false;
       String choice = null;
       
       while(!finished)
      {
        
            printChoices(choices);

            choice = reader.getInput();
            choice = choice.toLowerCase();
            
            //TODO check that the choice is valid
            
      }
      return choice;
    }    
    
    private boolean checkIsValid(String []choices, String choice)
    {
        return false;
    }    
    
    private void printChoices(String [] choices)
    {
        System.out.println("Your choice are: \n");
        for(String choice: choices)
        {
            System.out.println(choice);
        }    
    }    
    
}    