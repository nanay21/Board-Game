//-------------------------------------------------------------------------
/**
 *  A Hero is a subclass of EnhancedUnit that is extra durable and capable,
 *  often modifying nearby units.
 *
 *  @author Nana Yaw Barimah Oteng
 *  @version (2022.03.20)
 */
public class Hero 
    extends EnhancedUnit
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Hero object.
     * @param name1 represents the Unit's name.
     * @param value reprents the unit's point value.
     */
    public Hero(String name1, int value)
    {
        super(name1, value);
        this.setQuality(5);
        this.setDefense(5);     
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................


}
