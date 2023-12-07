package Day60;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int angka = ky.nextInt();
        int kkm = 79;
        String kondisi_nilainya = angka >= kkm?"Lulus":"Tidak lulus";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nilai yang anda dapatkan  : "+angka);
        System.out.println("Predikat yang di dapatkan : "+kondisi_nilainya);
        
    }
}
