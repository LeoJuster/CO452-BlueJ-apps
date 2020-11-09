
/**
 * In This class you are able to insert the module title and number.
 *
 * @author (Leo Juster)
 * @version (26.10.2020)
 */
public class Module
{
    private String title;

    private String codeNo;

    private int mark;

    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        this. mark = mark;
        this.title = title;
        this.codeNo = codeNo;
    }

    public void awardGrade(int mark)
    {
        if((mark >= 0) && (mark <= 100))
        {
            this.mark = mark;
        }
        else
        {
            System.out.print("Invalid mark!!!");
        }
    }

    public void print()
    {
        System.out.println("Module: " + codeNo +
            " " + title + " Mark = " + mark);
    }

}