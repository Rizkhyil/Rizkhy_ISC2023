package Day48;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        System.out.println("~~~~~~~~Masukkan nilai dan pangkatnya~~~~~~~~~");
        System.out.println("");
        int bil, pangkat, hasil;
        System.out.print("Bilangan : ");
        bil = ky.nextInt();
        System.out.print("Pangkat  : ");
        pangkat = ky.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Hasil  : ");
        hasil = bil;
        for(int i = 1; i < pangkat; i++) {
            hasil *= bil;   
        }
        System.out.println(hasil);
    }
    
    
}
