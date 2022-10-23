import java.util.*;
//-------------------------------------------------------------------------
/**
 *  This class represents any playable unit in
 *  the game. 
 *
 *  @author Nana Yaw Barimah Oteng
 *  @version (2022.03.20)
 */
public class Unit implements GameElement
{
    //~ Fields ................................................................
    private int points;
    private String name;
    private int quality;
    private int defense;
    private List<Upgrade> upgrades;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Unit object.
     * @param name1 represents the Unit's name.
     * @param value reprents the unit's point value.
     */
    public Unit(String name1, int value)
    {
        super();
        this.name = name1;
        this.points = value;
        this.quality = 2;
        this.defense = 2;
        upgrades = new ArrayList<Upgrade>();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................

    /**
     * Set this unit's cost in points.
     * @param value is the new value of the unit's cost
     * in points.
     *
     */
    public void setPoints(int value)
    {
        this.points = value;
    }
    
    /**
     * Get this unit's cost in points and 
     * return the number of points for this unit.
     * @return the number of points for this unit.
     */
    public int getPoints()
    {
        int upgradePoints = 0;
        for (int x = 0; x < upgrades.size(); x++)
        {
            upgradePoints = upgradePoints + upgrades.get(x).getPoints();
        }
        return this.points + upgradePoints;
    }

    /**
     * Set this unit's name.
     * @param unitName is the new name of the unit.
     *
     */
    public void setName(String unitName)
    {
        this.name = unitName;
    }
    
    /**
     * Get this unit's name and return the name.
     * @return returns the name of this unit.
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Set this unit's quality(its strength or capability).
     * @param value is the new value of the unit's quality.
     */
    public void setQuality(int value)
    {
        this.quality = value;
    } 
    
    /**
     * Get this unit's quality and return the quality.
     * @return returns the quality of this unit.
     */
    public int getQuality()
    {
        return this.quality;
    }
    
    /**
     * Set this unit's defense(how well it can resist damage).
     * @param value is the new value of the unit's defense.
     */
    public void setDefense(int value)
    {
        this.defense = value;
    }
    
    /**
     * Get this unit's defense and return the defense.
     * @return returns the defense of this unit.
     */
    public int getDefense()
    {
        return this.defense;
    }
    
    /**
     * Get this unit's upgrades and return the upgrades.
     * @return returns the list of upgrades of this unit.
     */
    public List<Upgrade> getUpgrades()
    {
        return this.upgrades;
    }
    
    /**
     * Add an upgrade to the existing list of upgrades.
     * @param newUpgrade is a new upgrade added to a Unit's 
     * exisiting list of upgrades.
     */
    public void addUpgrade(Upgrade newUpgrade)
    {
        upgrades.add(newUpgrade);
    }
    
    /**
     * If an upgrade is present in a list, remove it.
     * @param newUpgrade is a new upgrade removed from a Unit's
     * list of upgrades.
     */
    public void removeUpgrade(Upgrade newUpgrade)
    {
        for (int x = 0; x < upgrades.size(); x++)
        {
            if (upgrades.get(x).getName().equals(newUpgrade.getName()))
            {
                upgrades.remove(newUpgrade);     
            }
        }
    }
    
    /**
     * Overrides the toString method and 
     * Returns the name, points, quality and defense of a Unit 
     * as well as upgrades.
     */
    @Override
    public String toString()
    {
        if (upgrades.size() > 0)
        {
            return getName() + " (" + getPoints() + ", " + getQuality() + ", " 
                   + getDefense() + ") " + "upgrades:" 
                   + this.getUpgrades().toString();
        }
        return getName() + " (" + getPoints() + ", " + getQuality() + ", " 
                   + getDefense() + ")";
    }
}
