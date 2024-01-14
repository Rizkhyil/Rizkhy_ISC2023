package Day97;
import java.util.*;
public class Main{

    public static void main(String[] args) {
        int [] a = {10, 20, 30, 40, 50, 55, 67, 77, 80};
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan index : ");
        int index = input.nextInt();
        
        try {
            System.out.printf("Index ke %d adalah %d\n\n",index,a[index]);
        } catch (Exception e) {
            System.err.println("Index yang anda input tidak ada");
        } finally {
            System.out.println("Program selesai\n");
            
        }
        
    }
    
}
