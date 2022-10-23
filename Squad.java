import java.util.*;
//-------------------------------------------------------------------------
/**
 *  This is a special kind of Unit that contains
 *  other Units.
 *
 *  @author Nana Yaw Barimah Oteng 
 *  @version (2022.03.20)
 */
public class Squad 
    extends EnhancedUnit
{
    //~ Fields ................................................................
    private List<Unit> units;



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Squad object.
     * @param name1 is the name of the Squad.
     */
    public Squad(String name1)
    {
        super(name1, 0);
        units = new ArrayList<Unit>();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * Get this unit's Squad's list of Units and return them.
     * @return returns the list of units.
     */
    public List<Unit> getUnits()
    {
        return this.units;
    }
    
    /**
     * Add an Unit to the existing list of units.
     * @param newUnit is a new unit added to a Squad's 
     * exisiting list of units.
     */
    public void addUnit(Unit newUnit)
    {
        units.add(newUnit);
    }
    
    /**
     * If a Unit is present in the list, remove it.
     * @param newUnit is a new Unit removed from a Squad's
     * list of units.
     */
    public void removeUnit(Unit newUnit)
    {
        for (int x = 0; x < units.size(); x++)
        {
            if (units.get(x).getName().equals(newUnit.getName()))
            {
                units.remove(newUnit);     
            }
        }
    }
    
    /**
     * Returns the sum of the points of all units in the squad
     * and the sum of any upgrades that the squad has.
     * @return the number of points for this unit.
     */
    @Override 
    public int getPoints()
    {
        int unitPoints = 0;
        int upgradePoints = 0;
        List<Upgrade> upgradeList = this.getUpgrades();
        for (int x = 0; x < units.size(); x++)
        {
            unitPoints = unitPoints + units.get(x).getPoints();
        }
        for (int x = 0; x < upgradeList.size(); x++)
        {
            upgradePoints = upgradePoints + upgradeList.get(x).getPoints();
        }
        return unitPoints + upgradePoints;
    }
    
    /**
     * Overrides the toString() method and 
     * Returns the name, points, quality and defense of a Unit 
     * as well as upgrades special rules,and the list of units.
     */
    @Override
    public String toString()
    {
        return super.toString() + " units:" + units.toString();
    }    
}
