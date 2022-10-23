//-------------------------------------------------------------------------
/**
 *  Upgrades boost the unit's abilities in some interesting way.
 *  Each unit is worth a certain number of points, 
 *  and each upgrade usually adds to the point value of a unit
 *  @author Nana Yaw Barimah Oteng 
 *  @version (2022.03.20)
 */
public class Upgrade implements GameElement
{
    //~ Fields ................................................................
    
    private String name;
    private int points;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Upgrade object.
     * @param upgradeName represents the Unit's name.
     * @param upgradePoints reprents the unit's point value.
     */
    public Upgrade(String upgradeName, int upgradePoints)
    {
        super();
        this.name = upgradeName;
        this.points = upgradePoints;
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * Get this upgrade's name and return it.
     * @param newName represents the updated name 
     * of the upgrade.
     */
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    /**
     * Get this upgrade's name and return it.
     * @return returns the name of the upgrade.
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Get this upgrade's name and return it.
     * @param value represents the updated value 
     * of the unit's points value.
     */
    public void setPoints(int value)
    {
        this.points = value;
    }    
    
    /**
     * Get this upgrade's cost in points and return it.
     * @return returns the cost of points of this upgrade.
     */
    public int getPoints()
    {
        return this.points;
    }
    /**
     * Overrides the toString() method and
     * Returns the name and points of a Upgrade.
     */
    @Override
    public String toString()
    {
        return getName() + " (" + getPoints() + ")";
    }
}
