import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  This tests the methods in the EnhancedUnit class
 *  to ensure they work properly.
 *
 *  @author Nana Yaw Barimah Oteng
 *  @version (2022.03.20)
 */
public class EnhancedUnitTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new EnhancedUnitTest test object.
     */
    public EnhancedUnitTest()
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
     * Unit's special ability is set to the preferred name 
     * "Super Strength".
     */
    public void testSpecialRule()
    {
        String nana = "Super Strength";
        EnhancedUnit unit = new EnhancedUnit(nana, 3);
        
        unit.setSpecialRule("Super Speed");
        String x = unit.getSpecialRule();


        assertThat(x).isEqualTo("Super Speed");

    }
    
    /**
     * A testcase that checks that the toString method
     * only calls the inherited toString method if the 
     * special rule is null.
     */
    public void testToString()
    {
        String nana = "Nana";
        EnhancedUnit eUnit = new EnhancedUnit(nana, 3);
        
        
        
        
        
        assertThat(eUnit.toString()).isEqualTo(eUnit.getName() + " ("
                   + eUnit.getPoints() + ", " + eUnit.getQuality() + ", " 
                   + eUnit.getDefense() + ")");
        System.out.print(eUnit.toString());
        
    }
    
    /**
     * A testcase that checks that the toString method
     * only calls the inherited toString method if the 
     * special rule is null.
     */
    public void testToStringSpecialRule()
    {
        String nana = "Nana";
        EnhancedUnit eUnit = new EnhancedUnit(nana, 3);
        eUnit.setSpecialRule("Fast Punch");
        
        eUnit.addUpgrade(new Upgrade("Super Speed", 30));
        
        
        
        
        
        
        assertThat(eUnit.toString()).isEqualTo(eUnit.getName() + 
                   " (" + eUnit.getPoints() + ", "
                   + eUnit.getQuality() + ", " + eUnit.getDefense() + ") "
                   + "upgrades:" + eUnit.getUpgrades().toString() + " " 
                   + "special rule:[" + eUnit.getSpecialRule() + "]");
        System.out.print(eUnit.toString());
        
    }
}
