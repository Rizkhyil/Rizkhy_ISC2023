package Day43;
import java.util.*;
public class Main{
    
    public static void main(String[] args) {
        
        Scanner ky = new Scanner(System.in);
        System.out.println("Masukkan terserah >_<");
        int jml = 6;
        System.out.println("<<-------------------------->>");
        String [] R = new String[jml];
        for(int y = 0; y < jml; y++){
            System.out.print("indeks ke "+y+" : ");
            R[y] = ky.nextLine();
        }
        System.out.println("~~~~~~~~~~Out put~~~~~~~~~~");
        for(int y = 0; y < jml ; y++){
            System.out.print(R[y]+" ");
        }
    }
 }
