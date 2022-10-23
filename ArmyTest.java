import student.micro.*;
import static org.assertj.core.api.Assertions.*;
// -------------------------------------------------------------------------
/**
 *  This test class tests the methods in te=he Army class
 *  to ensure they work as expected.
 *
 *  @author Nana Yaw Barimah Oteng
 *  @version (2022.03.20)
 */
public class ArmyTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new ArmyTest test object.
     */
    public ArmyTest()
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
     * calls the overriden Tostring method.
     * It also checks the getPlayerName method to see if it returns 
     * the name of the owner of the army.
     * This case also cehcks if the getFaction method gets the
     * faction of the army.
     */
    public void testToString()
    {
        String armyName = "Legion of Doom";
        Army unit = new Army(armyName, "Faction1", "Stephen Edwards");
        
        unit.addUnit(new Unit("Kwaku", 20));
        unit.addUnit(new Unit("Logo", 10));
        
        Unit unit1 = new Unit("Ab", 10);
        unit.addUnit(unit1);
        unit.removeUnit(unit1);
        
        Upgrade upgrade = new Upgrade("Elasticity", 40);
        unit.addUpgrade(upgrade);
        
        unit.setSpecialRule("Fast Punch");
        
        unit.setPlayerName("Jesus Edwards");
        unit.setFaction("Faction2");


        
        assertThat(unit.getPoints()).isEqualTo(70);
        assertThat(unit.toString()).isEqualTo("player:" 
                   + unit.getPlayerName() + ", faction:"
                   + unit.getFaction() + ", army:" + unit.getName() 
                   + " (" + unit.getPoints() + ", "
                   + unit.getQuality() + ", " + unit.getDefense() + ") "
                   + "upgrades:" + unit.getUpgrades().toString() + " " 
                   + "special rule:[" + unit.getSpecialRule() + "]" 
                   + " units:" + unit.getUnits().toString());
        System.out.print(unit.toString());
        
    }

}
