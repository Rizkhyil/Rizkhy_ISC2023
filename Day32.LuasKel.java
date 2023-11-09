package Day32.LuasKeliling;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        
        int s, L, K;
        System.out.print(" Masukan s  :");
        s = ky.nextInt();
        L = s * s;
        K = 4 * s;
        
        System.out.println(" L  = s x s");
        System.out.println(" L  = "+s+"  x "+ s);
        System.out.println(" L  = "+L+" cm\n");
        
        System.out.println(" K  = 4 x s ");
        System.out.println(" k  = 4 " + " x "+s);
        System.out.println(" K  = "+ K +"\n");
    }
    
}
