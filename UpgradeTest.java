import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  This tests the methods in the Upgrade class to ensure they work properly.
 *
 *  @author Nana Yaw Barimah Oteng 
 *  @version (2022.03.20)
 */
public class UpgradeTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new UpgradeTest test object.
     */
    public UpgradeTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        /*# Insert your own setup code here */
    }


    // ----------------------------------------------------------
    /**
     * An example test case that tests to see if the 
     * Upgrade's points is set to the preferred value
     * of 4.
     */
    public void testPoints()
    {
        String nana = "nana";
        Upgrade unit = new Upgrade(nana, 3);
        
        unit.setPoints(4);
        int x = unit.getPoints();

        

        assertThat(x).isEqualTo(4);

    }
    
    /**
     * An example test case that tests to see if the 
     * Upgrade's name is set to the right name, "nana".
     */
    public void testName()
    {
        String nana = "nana";
        Upgrade unit = new Upgrade(nana, 3);
        
        unit.setName("nana");
        String x = unit.getName();

        

        assertThat(x).isEqualTo("nana");

    }
    
    /**
     * An example test case that checks if the toString method returns
     * the name and points of a Upgrade.
     */
    public void testToString()
    {
        String nana = "nana";
        Upgrade upgrade = new Upgrade(nana, 3);
        

        
        upgrade.setPoints(10);
        int points = upgrade.getPoints();
        
        

        assertThat(points).isEqualTo(10);
        assertThat(upgrade.getName()).isEqualTo(nana);
        assertThat(upgrade.toString()).isEqualTo(upgrade.getName() 
            + " (" + upgrade.getPoints() + ")");
        System.out.println(upgrade.toString());
    }
}
