package Warung_if;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner pesan = new Scanner(System.in);
        String menu = null;
        int pilihan, harga= 0, porsi=0;
        System.out.println("<=> <=> <=> REVIEW BATAGOR MEN <=> <=> <=>");
        System.out.println("1. Batagor sambal matah \n2. Batagor kacang \n3. Batagor level 7 \n4. Ayam crispy \n5. Nasi ayam campur");
        System.out.print("\nPesanan \t: ");        
        pilihan = pesan.nextInt();
        
        if(pilihan == 1){
            menu = "Batagor sambal matah";
            harga = 6000;
            
       }else if(pilihan == 2){
            menu = "Batagor kacang";
            harga = 7000;
        
       }else if(pilihan == 3){
            menu = "Batagor level 7";
            harga = 8000;
       }else if(pilihan == 4){
            menu = "Ayam crispy";
            harga = 10000;
        
       }else if(pilihan == 5){
            menu = "Nasi ayam campur";
            harga = 15000;
        
       }
        if(menu == null){
            System.out.println("tekan ulang pesanan");
        }else{
        System.out.print("Jumlah porsi \t: ");
        porsi = pesan.nextInt();
            
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            
        System.out.print("pesanan  : ");
        System.out.println(menu+ " Rp." + harga + ("/porsi"));
        harga = harga * porsi;
        System.out.println("Total harga Rp : " + harga );
            
            
            
            
            
            
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("          Thank you for purchasing >-<");
        }
        
    }
    
}
