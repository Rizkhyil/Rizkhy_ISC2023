package Day14;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        int nilai;
        
        Scanner rizz = new Scanner(System.in);
        System.out.print(" Masukkan nilai :");
        nilai = rizz.nextInt();
        String predikat = null;
        
        if (nilai >100) {
            predikat = " Nilai overload";
            
        }else if(nilai >= 85) {
            predikat = " Sangat baik";
        
        }else if(nilai >= 75) {
            predikat = " Baik";
        
        }else if(nilai >= 60) {
            predikat = "kuramg";
        
        }else if(nilai < 60) {
            predikat = "kurang";{
        }        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("-------- OUTPUT ++++++++++");
        System.out.println(" Nilai \t = "+ nilai);
        System.out.println(" predikat \t = "+ nilai);
            }
    }
}
