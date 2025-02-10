
/**
 * Enumeration class Party - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Party
{
    WHIG("Whig"), TORY("Tory"), NDP("NDP");
    
    String friendlyName;
    
    private Party(String friendlyName){
        this.friendlyName = friendlyName;
    }// end constructor
    
    public String getFriendlyName(){
        return friendlyName;
    }
    
    @Override
    public String toString(){
        return friendlyName;
    }
}
