package Day77;
import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        int cari,non = 0;
        int [] R ={7, 77, 777, 7777, 2, 22, 222, 2222};
        System.out.print("Derat angka : ");
        for(int i = 0; i < R.length; i++){
            System.out.print(R[i]+ " ");
        }
        System.out.println();
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.print("Searcing angka: ");
        cari = ky.nextInt();
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~Out Put~~~~~~~~~~~~");
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
 
