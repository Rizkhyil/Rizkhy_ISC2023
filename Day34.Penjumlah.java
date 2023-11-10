package Day34;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        
        System.out.print("Masukkan angka = ");
        int angka = ky.nextInt();
        int hasil = angka;
        
        System.out.println("-------------------------------------------- ");
        
        for (int w = 1; w <= angka; w++) {
            System.out.print(w);
            if(w!=angka){
                System.out.print(" + ");
                
            }
            if(angka != w){
             hasil += w;    
            }
             
        }
        System.out.println(" = "+ hasil);
        System.out.println("");
    }
    
}
