package Day36;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        
        int angka;
        Scanner ky = new Scanner(System.in);
        
        System.out.print(" Masukkan angka  = ");
        angka =ky.nextInt();
        int hasil = angka;
        System.out.print(angka+ "!  = ");
        for(int y = angka; y > 0; y--) {
            System.out.print(y);
            if(y > 1) {
                System.out.print(" x ");
                
            }
            if(angka != y){
                hasil *= y;
                
            }
            
        }
        System.out.println("");
        System.out.println("    = "+hasil);
        
        
    }
}
