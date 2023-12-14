package Day67;
import java.util.*;
public class Main{
    
    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        System.out.println("~~~MENU MAKANAN & MINUMAN~~~");
        int pill, porsi, harga=0;
        System.out.println("1. Barbeque\n2. Lemontea\n3. Chicken hot");
        System.out.println("");
        System.out.print("Pilih  : ");
        pill = ky.nextInt();
        System.out.print("Porsi  : ");
        porsi = ky.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        switch(pill){
            case 1:
                System.out.println("Barbeque 5k/porsi = (5k x "+porsi+")");
                harga = 5000 * porsi;
                break;
            case 2:
                System.out.println("Lemontea 6k/porsi = (6k x "+porsi+")");
                harga = 6000 * porsi;
                break;
            case 3:
                System.out.println("Chicken hot 12k/porsi = (12k x "+porsi+")");
                harga = 12000 * porsi;
                break;
            default:
                System.out.println("Pilihan salah!!");
        }
        System.out.println("Total  : Rp."+harga);
    }   
}
