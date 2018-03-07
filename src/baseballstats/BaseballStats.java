package baseballstats;
 import java.util.Scanner;
 import java.text.DecimalFormat;
/**
 *
 * @author Axel Castro
 */
public class BaseballStats {

    
    public static void main(String[] args) {
        
        Scanner user_input = new Scanner (System.in);
        String first_name; 
        System.out.print("Enter Player Name: ");
        first_name = user_input.next(); 
        
        String family_name; 
        System.out.print("Enter The Player Last Name: ");
        family_name = user_input.next(); 
        
        String Atbat; 
        System.out.print("How Many At Bat: ");
        Atbat = user_input.next();
        
        String Hits; 
        System.out.print("How Many Hits: ");
        Hits = user_input.next();
        
        float Hit = Float.parseFloat(Hits);
        float Bats = Float.parseFloat(Atbat);
        float AVG = Hit/Bats;
        
        DecimalFormat df2 = new DecimalFormat (".000"); 
        
        String BB; 
        System.out.print("How Many BB: ");
        BB = user_input.next();
        
        String HBP; 
        System.out.print("How Many HBP: ");
        HBP = user_input.next();
        
        String Double; 
        System.out.print("How Many 2B: ");
        Double = user_input.next();
        
        String Triple; 
        System.out.print("How Many 3B"
                + ": ");
        Triple = user_input.next();
        
        String HR; 
        System.out.print("How Many HR: ");
        HR = user_input.next();
        
        String SF; 
        System.out.print("How Many Sacrifice Fly: ");
        SF = user_input.next();
        
        float B = Float.parseFloat(BB);
        float HB = Float.parseFloat(HBP);
        float Dou = Float.parseFloat(Double);
        float Tri = Float.parseFloat(Triple);
        float HRR = Float.parseFloat(HR);
        float SFF = Float.parseFloat(SF);        
        float First = Hit - Tri - HRR - Dou;
        float TRI = Tri * 3;
        float HRRR = HRR * 4;
        float DOU = Dou * 2; 
        float TotalBases = TRI + HRRR + First + DOU;
        float SLG = TotalBases/Bats;
        float OBP = (Hit + B + HB)/(Bats + B + HB + SFF );
        
        String full_name; 
        full_name = first_name + " " + family_name; 
        System.out.println("The Baseball Player " + full_name + " has given " + Hits + " hits (H)" + " in " + Atbat + " at-bats (AB), for a batting average (AVG) of: " 
                + df2.format(AVG) + " with a (SLG) of: " + df2.format(SLG) + " with (OBP) of: " + df2.format(OBP));
        
    }
    
}
