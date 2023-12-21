package Day74;
import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner rk = new Scanner(System.in);
        double  a = 55000;
        double hasil = 0;
        System.out.println("----------Karyawan kantor---------");
        System.out.print("Masukan gaji anda   : ");
        int  g = rk.nextInt();
        System.out.print("Masukan lama lembur : ");
        int  l = rk.nextInt();
        System.out.println("~~~~~~~~~~~~~~Out Put~~~~~~~~~~~~~");
        System.out.println("");
        hasil = (l * a)+g;
        System.out.print("hasil : "+hasil);
        
    }
}
