package Day18.LoppWhile;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner rizz = new Scanner(System.in);
        
        int awal, akhir, split;
        
        System.out.println(" Bilangan ganjil");
        
        System.out.println("");
        
        System.out.print(" Awal  :");
        awal = rizz.nextInt();
        System.out.print(" Akhir :");
        akhir = rizz.nextInt();
        
        System.out.println("_____________________________________________");
        
        int a = awal;
        split = 1;
        while (a <= akhir) {
            int hasil = a % 2;
            if (hasil == 1) {
                System.out.print(a + " ");
                if(split == 5) {
                    System.out.println("");
                    split = 1;
                }
                split++;
            }
            a++;
    }
        System.out.println(" ");
    }
}
