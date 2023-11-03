package day26;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner rizz = new Scanner(System.in);
        System.out.print(" Masukkan harga :");
        int total = rizz.nextInt();
        
        System.out.println(" Belanja = Rp."+ total);
        if(total >= 600000){
            System.out.println(" diskon = 30");
            int diskon = 30 * total / 100; 
            
        }else if(total >= 300000){
            System.out.println(" diskon = 20%");
            int diskon = 20 * total / 100;
            total -= diskon;          
            
        } else if(total >= 120000){
            System.out.println(" diskon = 15%");
            int diskon = 15 * total / 100;
            total -= diskon;
            
        } 
        else{
            System.out.println(" tidak dapat diskon");
        }
        System.out.println("<<--------------------------->>");
        System.out.println(" Biaya keseluruhan = Rp."+ total);
    }
    
    
}
