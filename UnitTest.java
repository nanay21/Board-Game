import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import java.util.*;
// -------------------------------------------------------------------------
/**
 *  This tests the methods in the Unit class to ensure they work properly.
 *
 *  @author Nana Yaw Barimah Oteng
 *  @version (2022.03.20)
 */
public class UnitTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new UnitTest test object.
     */
    public UnitTest()
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
    /*# Insert your own test methods here */
    /**
     * An example test case that tests to see if the 
     * Unit's points is set to the preferred value of 4,
     * and adds the points from the list of upgrades, to the
     * Unit's total points.
     */
    public void testPoints()
    {
        String nana = "nana";
        Unit unit = new Unit(nana, 3);
        
        unit.addUpgrade(new Upgrade("Super Speed", 10));
        unit.addUpgrade(new Upgrade("Super Strength", 20)); 
        
        
        
        unit.setPoints(4);
        int x = unit.getPoints();

        

        assertThat(x).isEqualTo(34);

    }
    
    /**
     * An example test case that tests to see if the 
     * Unit's name is set to the right name,"nana".
     */
    public void testName()
    {
        String nana = "nana";
        Unit unit = new Unit(nana, 3);
        
        unit.setName("nana");
        String x = unit.getName();

        

        assertThat(x).isEqualTo("nana");

    }
    
    /**
     * An example test case that tests to see if the 
     * Unit's quality is set to the preferred quality of 6.
     */
    public void testQuality()
    {
        String nana = "nana";
        Unit unit = new Unit(nana, 3);
        
        unit.setQuality(6);
        int x = unit.getQuality();

        

        assertThat(x).isEqualTo(6);

    }
    
    /**
     * An example test case that tests to see if the 
     * Unit's defense is set to the preferred defense of 6.
     */
    public void testDefense()
    {
        String nana = "nana";
        Unit unit = new Unit(nana, 3);
        
        unit.setDefense(6);
        int x = unit.getDefense();

        

        assertThat(x).isEqualTo(6);

    }

    /**
     * An example test case that checks if the toString method returns
     * the name and points, defense, quality and upgrades of a unit.
     */
    public void testToStringUpgrades()
    {
        String nana = "nana";
        Unit unit = new Unit(nana, 3);
        
        unit.addUpgrade(new Upgrade("Super Speed", 30));
        unit.addUpgrade(new Upgrade("Super Strength", 20)); 
        Upgrade upgrade3 = new Upgrade("Elasticity", 40); 
        unit.addUpgrade(upgrade3);

        
        unit.setPoints(10);
        unit.removeUpgrade(upgrade3);
        int points = unit.getPoints();
        
        

        assertThat(points).isEqualTo(60);
        assertThat(unit.getName()).isEqualTo(nana);
        System.out.println(unit.toString());
    }
    
    /**
     * An example test case that checks if the toString method returns
     * the name and points, defense, quality, with no upgrades if a unit 
     * has no upgrades.
     */
    public void testToStringNoUpgrades()
    {
        String nana = "nana";
        Unit unit = new Unit(nana, 3);
        
        //unit.addUpgrade(new Upgrade("Super Speed", 30));
        //unit.addUpgrade(new Upgrade("Super Strength", 20)); 
        Upgrade upgrade3 = new Upgrade("Elasticity", 40); 
        unit.addUpgrade(upgrade3);

        
        unit.setPoints(10);
        unit.removeUpgrade(upgrade3);
        int points = unit.getPoints();
        
        

        assertThat(points).isEqualTo(10);
        assertThat(unit.getName()).isEqualTo(nana);
        assertThat(unit.toString()).isEqualTo(unit.getName() + 
                   " (" + unit.getPoints() + ", " + unit.getQuality() + ", " 
                   + unit.getDefense() + ")");
        
        System.out.println(unit.toString());
    }

}
