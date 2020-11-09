
/**
 * This is the course class were you can enroll student tomdules that have been created.
 *
 * @author (Leo Juster)
 * @version (26.10.2020)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String codeNo;
    private String title;

    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;

    private int finalMark;
    private Grades finalGrade;
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;

        module1 = new Module("Programming Concepts", "CO452");
        module2 = new Module("Web Development", "CO456");
        module3 = new Module("Computer Architectures", "CO450");
        module4 = new Module("Digital Technologies", "CO454");
    }

    public void addMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardGrade(mark);
        }
    }

    /**
     * Prints out the details of a course
     */
    public void print()
    {
        // put your code here
        System.out.println("Course " + codeNo + " - " + title);
    }

    public Grades convertToGrade(int mark)
    {
        if((mark >= 0) && (mark < 39))
        {
            System.out.println("F");
        }
        if ((mark >= 40) && (mark < 49))
            {
                System.out.println("D");
            }
        if ((mark >= 50) && (mark < 59))
        {
            System.out.println("C");
        }
        if ((mark >= 60) && (mark < 69))
        {
            System.out.println("B");
        }
        if ((mark>=70) && (mark <=100))
        {
            System.out.println("A");
        }
        return Grades. X;
    }
}
