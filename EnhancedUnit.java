//-------------------------------------------------------------------------
/**
 *  This class is a type of Unit that 
 *  supports any special abilities that a unit 
 *  might have.
 *
 *  @author Nana Yaw Barimah Oteng 
 *  @version (2022.03.20)
 */
public class EnhancedUnit 
    extends Unit
{
    //~ Fields ................................................................
    private String specialRule;
 

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created EnhancedUnit object.
     * @param name1 represents the Unit's name.
     * @param value reprents the unit's point value.
     */
    public EnhancedUnit(String name1, int value)
    {
        super(name1, value);
        this.specialRule = null;
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................

    /**
     * Set this unit's special ability
     * (this unit's special ability or properties).
     * @param value is the value of the unit's
     *  special ability)
     */
    public void setSpecialRule(String value)
    {
        this.specialRule = value;
    }
    
    /**
     * Get this unit's special ability and return it.
     * @return returns the name of the unit's
     * special ability.
     */
    public String getSpecialRule()
    {
        return this.specialRule;
    }
    
    /**
     * Overrides the toString() method and 
     * Returns the name, points, quality and defense of a Unit 
     * as well as upgrades and special rules
     */
    @Override
    public String toString()
    {
        if (specialRule == null)
        {
            return super.toString();
        }
        return super.toString() + " " + "special rule:[" 
               + this.specialRule + "]";

    }
}
