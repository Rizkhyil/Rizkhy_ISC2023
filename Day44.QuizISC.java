package Quiz_ISC23;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        int tahun;
        double modal, invest = 0;
        
        System.out.print("Masukan modal\t: ");
        modal = ky.nextDouble();
        System.out.print("Tahun\t\t: ");
        tahun = ky.nextInt();
        System.out.print("");
        
        for (int y = 1; y <= tahun; y++) {
            invest = 0.05 * modal;
            modal += invest;
             System.out.println("Tahun ke "+ y + "\t: "+modal);
        }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
             System.out.println("jadi hasil invest selama "+ tahun+" adalah " + modal);
    }
    
}
