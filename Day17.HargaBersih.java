package Day17.HargaBersih;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner rizz = new Scanner(System.in);
        
        int Panjang_tanah,Lebar_tanah, HargaPerMeter;
        int Luas_tanah, Harga_jual;
        
        System.out.print(" Panjang tanah : ");
        Panjang_tanah = rizz.nextInt();
        
        System.out.print(" Lebar tanah   : ");
        Lebar_tanah = rizz.nextInt();
        
        HargaPerMeter = 300000;
        
        System.out.println("_______________________________");
        
        Luas_tanah = Panjang_tanah*Lebar_tanah;
        System.out.print(" Luas tanah adalah\t: " + Luas_tanah+ " m² \n");
        
        Harga_jual = HargaPerMeter*Luas_tanah;
        System.out.print(" Harga jual senilai\t: "+Harga_jual);
        
        if(Harga_jual<50000000){
            System.out.print("\n Harga tanah di kenakan pajak sebesar 1% ");
            System.out.print("\n Jadi harga bersih penjualan tanah senilai \n :Rp " + (Harga_jual-(Harga_jual*0.01)));
            
        }else if (Harga_jual>=50000000 && Harga_jual<=100000000){
            System.out.print("\n Harga tanah dikenakan pajak sebesar 3% ");
            System.out.print("\n Jadi harga bersih penjualan tanah senilai \n :Rp " + (Harga_jual-(Harga_jual*0.03)));
            
        }else if (Harga_jual >100000000){
            System.out.print("\n Harga tanah dikenakan pajak sebesar 5% ");
        System.out.print("\n Jadi hasil bersih penjualan tanah senilai \n :Rp " + (Harga_jual-(Harga_jual*0.05)));
        }
    }
}
