package Day35;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        
        System.out.print("Masukan nilai anda\t: ");
        
        int nilai = ky.nextInt();
        int KKM = 75;
        
        String hasil = nilai >= KKM? "\tLULUS":" TIDAK LULUS ";
        System.out.println("\t<<------------------------->>");
        System.out.println("\tKeterangan anda :" + hasil);
        
        
    }
}
