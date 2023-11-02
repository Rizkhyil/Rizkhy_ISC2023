package day25.pangkat;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner rizz = new Scanner(System.in);
        int bil, pangkat, hasil;
        System.out.print(" Bilangan :");
        bil = rizz.nextInt();
        System.out.print(" Pangkat  :");
        pangkat = rizz.nextInt();
        System.out.println("<<---------------------->>");
        System.out.println(" Hasil  :");
        hasil = bil;
        for(int i = 1; i < pangkat; i++) {
            hasil *= bil;   
        }
        System.out.println(hasil);
    }
    
    
}
