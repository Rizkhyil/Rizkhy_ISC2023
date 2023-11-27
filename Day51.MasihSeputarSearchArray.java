package Day51;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        String[] r = {
            "Aril",
            "kholil",
            "gedry",
            "rian",
            "jainuddin",
            "Hera",
        };
        int deteksi = 0;
        String cari;
        for(int y = 0; y < r.length; y++) {
            System.out.println((y + 1)+". "+r[y]);
            
        }
        System.out.println("<<<>>><<<>>><<<>>><<<>>><<<>>><<<>>><<<>>>");
        System.out.print("Searh          : ");
        cari = ky.nextLine();
        System.out.println("");
        for(int y = 0; y < r.length; y++){
            if(cari.equalsIgnoreCase(r[y])){
                System.out.println("Nama index nya : "+r[y]);
                System.out.println("Nomor "+(y+1));
                deteksi++;
            }
        }
        if(deteksi ==  0){
            System.out.println("Tidak ada data tentang dia!");
        }
        
    }
}
