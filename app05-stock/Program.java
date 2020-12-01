/**
 * This is the class that is charge or the programming
 *
 * @author Leo Juster
 * @version (a version number or a date)
 */
public class Program
{
    private static StockApp app;

    /**
     * This class runs the StockApp class
     * 
     */
    public static void main()
    {
        app = new StockApp();
        app.run();
    }
}