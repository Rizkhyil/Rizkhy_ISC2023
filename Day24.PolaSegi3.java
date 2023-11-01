package Day24;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
       Scanner rizz = new Scanner (System.in);
        
       System.out.print(" Masukkan angka :");
       int jumlah = rizz.nextInt();
       System.out.println("<<------------------------>>");
       System.out.println(" Output :");
        for(int i = 1; i <= jumlah; i++ ) {
            for(int j = 1; j < i; j++) {
                System.out.print("o  ");
            }
            System.out.println("o");
        }
        
    }
}
