import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  This tests the methods in the Hero class
 *  to ensure they work properly.
 *
 *  @author Nana Yaw Barimah Oteng
 *  @version (2022.03.20)
 */
public class HeroTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new HeroTest test object.
     */
    public HeroTest()
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
     * Hero's quality is set to the preferred quality of 
     * 3.
     */
    public void testQuality()
    {
        String nana = "nana";
        Hero unit = new Hero(nana, 3);

        assertThat(unit.getQuality()).isEqualTo(5);

    }
    
    /**
     * An example test case that tests to see if the 
     * Hero's defense is set to the preferred defense of 5.
     */
    public void testDefense()
    {
        String nana = "nana";
        Hero unit = new Hero(nana, 3);

        assertThat(unit.getDefense()).isEqualTo(5);

    }

}
