package Day45;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
       Scanner ky = new Scanner (System.in);
        
       System.out.print("Masukkan jumlah : ");
       int jumlah = ky.nextInt();
       System.out.println("");
       System.out.println("~~~~~~~~~~~~~~~~~~~~Out put~~~~~~~~~~~~~~~~~~~");
        for(int i = 1; i <= jumlah; i++ ) {
            for(int j = 1; j < i; j++) {
                System.out.print("®  ");
            }
            System.out.println("®");
        }
        
    }
}
