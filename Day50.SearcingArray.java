package Day50;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        String[] r = {
            "Tahu",
            "Tempe",
            "Telur",
            "Daging"
        };
        String cari;
        for(int y = 0; y < r.length; y++) {
            System.out.println((y + 1)+". "+r[y]);
            
        }
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.print("Cari   : ");
        cari = ky.nextLine();
        for(int y = 0; y < r.length; y++){
            if(cari.equalsIgnoreCase(r[y])){
                System.out.println("Nomor "+(y + 1));
                
            }
        }
        
    }
}
