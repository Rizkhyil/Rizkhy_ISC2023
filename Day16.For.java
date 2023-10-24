package day16.FOR;
import java.util.Scanner;
public class Main {
    
     public static void main(String[] Rizz) {
        Scanner rizz = new Scanner(System.in);
        
        int awal, akhir;
        
        System.out.println(" Bilangan genap");
        System.out.print(" Awal  :");
        awal = rizz.nextInt();
        System.out.print(" akhir :");
        akhir = rizz.nextInt();
        
        if(awal < akhir) {
            for(int a = awal; a <= akhir; a++) {
                int hasil = a % 2;
                if(hasil == 0) {
                    System.out.print(a +", ");
                    
                }
            }
        }
    }
}
