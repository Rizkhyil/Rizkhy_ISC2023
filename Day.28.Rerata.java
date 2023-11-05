package Day28.RerataNilai;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        
        System.out.print(" Mau berapa kolom :");
        int ikky = ky.nextInt();
        double nilai, total = 0, rerata;
        for(int i = 1; i <= ikky; i++) {
            System.out.print(" Nilai ke "+i+" = ");
            nilai = ky.nextDouble();
            total += nilai;
        }
        rerata = total / ikky;
        System.out.println(" Total   = "+ total);
        System.out.println(" Rerata  = "+ rerata);
    }
    
}
