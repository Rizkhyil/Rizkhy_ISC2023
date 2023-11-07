package Day30.MaksNilai;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        int jumlah, angka, maks = 0, min = 100;
        
        System.out.print(" Masukan nilai  :");
        jumlah = ky.nextInt();
        System.out.println("---------------------->>");
        for(int i = 1; i <= jumlah; i++) {
            System.out.print(" Nilai ke "+i+"  = ");
            angka = ky.nextInt();
            if(angka > maks) {
                maks = angka;
                
            }
            if(angka < min) {
                min = angka;
            }
        }
        System.out.println("---------------------->>");
        System.out.println(" Nilai maks  ="+ maks);
        System.out.println(" Nilai min   ="+ min);
    }
    
}
