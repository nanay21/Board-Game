//-------------------------------------------------------------------------
/**
 *  A Monster is a subclass of EnhancedUnit 
 *  that is extra durable and capable, and strikes
 *  fear.
 *
 *  @author Nana Yaw Barimah Oteng
 *  @version (2022.03.20)
 */
public class Monster extends EnhancedUnit
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Monster object.
     * @param name1 represents the Unit's name.
     * @param value reprents the unit's point value.
     */
    public Monster(String name1, int value)
    {
        super(name1, value);
        this.setQuality(4);
        this.setDefense(4); 
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................

}
