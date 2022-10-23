//-------------------------------------------------------------------------
/**
 *  This is an interface of GameElement that writes methods
 *  that other classes implement.
 *
 *  @author Nana Yaw Barimah Oteng
 *  @version (2022.03.20)
 */
public interface GameElement
{
    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Get this GameElement's name.
     *
     * @return This object's name as a string.
     */
    public String getName();
    
    /**
     * Get this GameElement's cost in points.
     *
     * @return The number of points for this object.
     */
    public int getPoints();
}
