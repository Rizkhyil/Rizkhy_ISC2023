package Method;
import java.util.*;
public class Main{
    public static void data(String nama, int umur){
        System.out.println(nama+" berumur "+umur+" thn!");
    }
    
    public static void main(String[] args) {
        String nama;
        int umur;
        Scanner ky = new Scanner(System.in);
        System.out.print("Nama  : ");
        nama = ky.nextLine();
        System.out.print("Umur  : ");
        umur = ky.nextInt();
        System.out.println("~~~~~Out Put~~~~~");
        data(nama,umur);
    }   
}
