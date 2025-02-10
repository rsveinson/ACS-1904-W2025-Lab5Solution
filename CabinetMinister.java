import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
 */

public class CabinetMinister extends Politician{

    private String cabinetPost;

    public CabinetMinister(String fn, String ln, String r, String p,
    String cp){
        super(fn,ln, r, p);
        cabinetPost = cp;
    }

    // getters
    public String getCabinetPost(){
        return cabinetPost;
    }

    // utilities
    @Override
    public String getName(){
        StringBuilder st = new StringBuilder();

        st.append(lastName).append(": ").append(party);
        st.append(": ").append(cabinetPost);

        return st.toString();
    }// end to string

}

/*****************************************
 * Description: brief description of the methods purpose
 * 
 * @param        each parameter of the method should be listed with an @param
 * @param        parametername description of parameter
 * 
 * @return       any return value will be noted here
 * ****************************************/
