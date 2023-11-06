package latihan;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        
        System.out.print(" Enter a number from 1/7 to see your lucky day  :");
        int pilihan = ky.nextInt();
        switch(pilihan) {
            case 1:
                System.out.println(" Rabu");
                break;
            case 2:
                System.out.println(" Senin");
                break;
            case 3:
                System.out.println(" jumat");
                break;
            case 4:
                System.out.println(" Selasa ");
                break;
            case 5:
                System.out.println(" Minggu");
                break;
            case 6:
                System.out.println(" Sabtu");
                break;
            case 7:
                System.out.println(" Kamis");
                break;
                
            
        }
        System.out.println(" Congratulation!! your are very lucky >_<");
        
        
    }
    
}
