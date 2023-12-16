package Day69;
import java.util.*;
public class Main{
    public static String putra(String nama, int umur){
        return " Nama saya "+nama+". berumur "+umur+" thn. ";
        
    }
    public static void main(String[] args) {
        
        Scanner ky = new Scanner(System.in);
        System.out.print("Nama  : ");
        String saya = ky.nextLine();
        System.out.print("Umur  : ");
        int umr = ky.nextInt();
        System.out.println("~~~~~~~~Output~~~~~~~~");
        System.out.println(putra(saya, umr));
    }   
}
