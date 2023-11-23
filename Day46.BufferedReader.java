package Day46;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
     static void main (String args[]) {
        BufferedReader ky = new BufferedReader(new InputStreamReader(System.in));
        
        String nama, alamat, email;
        System.out.println("~~~~~~~~~~~Masukkan Data Diri Anda~~~~~~~~~~~~");
        System.out.println("                    [isi dengan huruf kapital]");
        System.out.println("");
        
        try {
            System.out.print("Masukkan nama anda   : ");
            nama = ky.readLine();
            System.out.print("Tempat tinggal anda  : ");
            alamat = ky.readLine();
            System.out.print("Masukkan email anda  : ");
            email = ky.readLine();
            
            System.out.println();
            
            System.out.println("<<----------------------------------------->>");
            System.out.println("Nama anda "+nama+" dengan tempat tinggal sementara berlokasi di "+alamat+". ");
            System.out.println("Email aktif anda =c "+email);
        }catch(IOException eox)
        
        {
            System.out.println(eox);
        }
    }
}
