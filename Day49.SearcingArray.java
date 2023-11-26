package Day49;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        System.out.println("~~Aneka makanan penghasil tenaga wo~~");
        String[] R = {
            "Tahu",
            "Tempe",
            "Telur",
            "Protein",
            "Creatin"
        };
        int detect = 0;
        String cari;
        for(int y = 0; y < R.length ; y++){
            System.out.println((y + 1)+ ". "+R[y]);
        }
        System.out.println("");
        System.out.println("~~~~~kolom pencarian~~~~~~");
        System.out.println("");
        System.out.print("Cari  : ");
        cari = ky.nextLine();
        for(int y = 0; y < R.length; y++){
            if(cari.equalsIgnoreCase(R[y])){
                System.out.println("Nomor : "+(y + 1));
                detect++;
            }
        }
        if(detect == 0){
            System.out.println("Pilihan tidak ada ");
        }
    }
}
