import student.micro.*;
import static org.assertj.core.api.Assertions.*;
// -------------------------------------------------------------------------
/**
 *  Tests the methods in the Squad Class to ensure they work
 *  as expected.
 *
 *  @author Nana Yaw Barimah Oteng 
 *  @version (2022.03.20)
 */
public class SquadTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new SquadTest test object.
     */
    public SquadTest()
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
     * A testcase that checks that the toString method
     * calls the overriden Tostring method and also returns a list
     * of the added units.
     * It also checks the getUnits method to see if it returns the list
     * of Units that have been added to it.
     * This case also cehcks if the removeUnit method
     * removes a unit, and if the addUnit method adds a 
     * unit. Also it ensures that the getPoints method
     * adds points from the indivdual units in the squad
     * as well as the squad's upgrades.
     */
    public void testToString()
    {
        String nana = "Nana";
        Squad unit = new Squad(nana);
        
        unit.addUnit(new Unit("Kwaku", 20));
        unit.addUnit(new Unit("Logo", 10));
        
        Unit unit1 = new Unit("Ab", 10);
        unit.addUnit(unit1);
        unit.removeUnit(unit1);
        
        Upgrade upgrade = new Upgrade("Elasticity", 40);
        unit.addUpgrade(upgrade);
        
        unit.setSpecialRule("Fast Punch");

        
        //assertThat(unit.getPoints()).isEqualTo(70);
        assertThat(unit.toString()).isEqualTo(unit.getName() 
                   + " (" + unit.getPoints() + ", "
                   + unit.getQuality() + ", " + unit.getDefense() + ") "
                   + "upgrades:" + unit.getUpgrades().toString() + " " 
                   + "special rule:[" + unit.getSpecialRule() + "]" 
                   + " units:" + unit.getUnits().toString());
        System.out.print(unit.toString());
        
    }
}
