package Day39;
import java.util.*;
public class Main{
    
    public static void main(String[] args) {
        
        Scanner ky = new Scanner(System.in);
        System.out.print("Masukkan jumlah indeks : ");
        int jumlah = ky.nextInt();
        System.out.println("<<--------Input---------->>");
        int [] R = new int[jumlah];
        for(int y = 0; y < jumlah; y++){
            System.out.print("indeks ke "+y+" : ");
            R[y] = ky.nextInt();
        }
        System.out.println("");
        System.out.println("<<--------Out put-------->>");
        for(int y = 0; y < jumlah; y++){
            System.out.print(R[y]+" ");
        }
        
    }
 
        
}   
