package Day47;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner ky = new Scanner (System.in);
        int cari,non = 0;
        int [] R ={17, 47, 27, 7, 37, 77, 777};
        System.out.print("Deratan : ");
        for(int i = 0; i < R.length; i++){
            System.out.print(R[i]+ " ");
        }
        System.out.println();
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.print("Telusuri angka : ");
        cari = ky.nextInt();
        System.out.println();
        System.out.println("~~~~~Hasil pencarian~~~~~");
        for (int i = 0; i < R.length; i ++){
            if (cari == R[i]){
                System.out.print("Merupakan index ke- "+i);
                non++;
            }
        }
        if (non == 0){
        System.out.print("tidak ada hasil ");
        }
        System.out.println("");
    }
    
}
    
