import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
 */

public class Politician{

    protected String firstName;    
    protected String lastName;
    protected String riding;
    protected Party party;
    //protected String party;

    // ** constructors ***
    public Politician(String fn, String ln, String r, String p){
        firstName = fn;
        lastName = ln;
        riding = r;
        party = Party.valueOf(p.toUpperCase());
    }
    
    // public Politician(String fn, String ln, String r, String p){
        // firstName = fn;
        // lastName = ln;
        // riding = r;
        // party = p;
    // }

    // getters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getRiding(){
        return riding;
    }

    public String getParty(){
        return party.getFriendlyName();
    }

    // setters
    public void setFirstName(String n){
        firstName = n;
    }

    public void setLastName(String n){
        lastName = n;
    }

    public void setRiding(String r){
        riding = r;
    }

    public void setParty(String p){
        party = Party.valueOf(p.toUpperCase());
    }
    
    // public void setParty(String p){
        // party = p;
    // }
    
    // public void setParty(String p){
        // party = p;
    // }

    // Utilities
    public String getName(){
        StringBuilder st = new StringBuilder();
        st.append(firstName.charAt(0));
        st.append(". ").append(lastName);
        st.append(": ");
        st.append(party).append(" ");

        return st.toString();
    }// end getName()

    @Override
    public String toString(){
        String st = lastName + ": " + party + ", " + riding;
        return st;
    }

}

/*****************************************
 * Description: brief description of the methods purpose
 * 
 * @param        each parameter of the method should be listed with an @param
 * @param        parametername description of parameter
 * 
 * @return       any return value will be noted here
 * ****************************************/
