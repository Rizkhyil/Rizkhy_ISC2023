package Day73;
import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner rk = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~CODDING WARR~~~~~~~~~~~~~~~~");
        System.out.print("Angka 1 : ");
        int a1 = rk.nextInt();
        System.out.print("Angka 2 : ");
        int a2 = rk.nextInt();
        
        int hasil = 0;
        
        hasil = a1 + a2;
        System.out.println("hasil   : "+hasil);
        System.out.println("--------------------Syarat--------------------");
        
        
        if (hasil % 2 == 0){
            System.out.println("(Genap ditambah 1 ). Maka totalnya = "+(hasil+1));
            
        }else if (hasil % 2 == 1){
            System.out.println("(Ganjil ditambah  2). Maka totalnya = "+(hasil+2));
        }
        
    }
}
