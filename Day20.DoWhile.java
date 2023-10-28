package pkg20day;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        String nama, alamat, lopp;
        int umur;
        
        do {
             Scanner rizz = new Scanner(System.in);
            System.out.print(" Nama   :");
            nama = rizz.nextLine();
            System.out.print(" Alamat :");
            alamat = rizz.nextLine();
            System.out.print(" Umur   :");
            umur = rizz.nextInt();
        
            System.out.println("______________________________________________");
            System.out.println(" saya " + nama + " berusia "+ umur + " saya tinggal di "+ alamat);
            System.out.print(" ulang (y/n: ");
            lopp = rizz.next();
        } while(lopp.equalsIgnoreCase("y"));
        System.out.println(" Program selesai ^-^");
        
        
        
    }
    
}
