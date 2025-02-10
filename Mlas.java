
import java.util.Scanner;
import java.util.ArrayList;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class Mlas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Politician p = new Politician("Diana", "Riggs", "Spence", "NDP");
        CabinetMinister m = new CabinetMinister("Soloman", "Kanu", "Osborn", "TORY", "Health");
        Premier pm = new Premier("Winston", "Churchill", "Riverview", "WHIG", 45.3);
        
        // Politician p = new Politician("Diana", "Riggs", "Spence", "NDP");
        // CabinetMinister m = new CabinetMinister("Soloman", "Kanu", "Osborn", "Tory", "Health");
        // Premier pm = new Premier("Winston", "Churchill", "Riverview", "Whig", 45.3);
        
        ArrayList<Politician> politicians = new ArrayList();
        
        politicians.add(p);
        politicians.add(m);
        politicians.add(pm);
        
        System.out.println("Politicians");
        
        for(Politician pol : politicians){
            System.out.println(pol.getName());
        }
        
        System.out.println();
        System.out.println("Positions");
        for(Politician mla : politicians){
            String type = "Backbencher";
            
            System.out.print(mla + " ");
                
            if(mla instanceof CabinetMinister)
                type = "Minister";
                
            if(mla instanceof Premier)
                type = "Premier";
                
            System.out.println(type);
        }

        System.out.println("\nend of program");
    }
}

