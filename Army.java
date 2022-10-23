//-------------------------------------------------------------------------
/**
 *  This is a series of squads and larger units.
 *  
 *  @author Nana Yaw Barimah Oteng
 *  @version (2022.03.20)
 */
public class Army 
    extends Squad
{
    //~ Fields ................................................................
    private String playerName;
    private String faction;
    


 
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Army object.
     * @param armyName the name of the Army.
     * @param faction the faction where the army originated.
     * @param playerName the name of the owner of the army.
     * 
     */
    public Army(String armyName, String faction, String playerName)
    {
        super(armyName);
        this.faction = faction;
        this.playerName = playerName;
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
        /**
     * Set the name of the army owner.
     * @param name is the  name of the army owner.
     *
     */
    public void setPlayerName(String name)
    {
        this.playerName = name;
    }
    
    /**
     * Get the name of the army owner and return the name.
     * @return returns the name of the owner of this unit.
     */
    public String getPlayerName()
    {
        return this.playerName;
    }
    
    /**
     * Set this unit's faction().
     * @param origin is the new value of the unit's faction.
     */
    public void setFaction(String origin)
    {
        this.faction = origin;
    } 
    
    /**
     * Get this unit's faction and return the faction.
     * @return returns the faction of this Army..
     */
    public String getFaction()
    {
        return this.faction;
    }
    
    /**
     * Overrides the toString() method and 
     * Returns the name, points, quality and defense of a Unit 
     * as well as upgrades, special rules, the lsit of units, as well 
     * as the name of the army owner and the army faction.
     */
    @Override
    public String toString()
    {
        return "player:" + getPlayerName() + ", faction:"
               + getFaction() + ", army:" + super.toString();
    }  
}
