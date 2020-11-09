import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket
{
    // Journey destination
    private String destination;
    
    //This is the price of the ticket in pence.
    private int price;
    
    //The date and time the ticket was issued
    private Date timeStamp;
    /**
     * Constructor for objects of class Ticket will 
     */
    public Ticket(String destination, int price)
    {
       timeStamp = new Date();
       this.destination = destination;
       this.price = price;
    }
    
    /**
     * Returns the tickets destination as a string.
     */
    public String getDestination()
    {
        return destination;
    }
    /**
     * 
     */
    public void print()
    {
        System.out.print("Ticket to" +destination);
        System.out.println(" Cost:" +price+"p");
        System.out.println("Issued:" +timeStamp);
    }
}
