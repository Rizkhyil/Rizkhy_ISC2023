package Method;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        int x,y;
        x = 5;
        y = (x + 2) * x;
        System.out.println("X = "+x+"   ,  Y = "+y);
        
        x = 10;
        y = (x + 2) * x;
        System.out.println("X = "+x+"  ,  Y = "+y);
        
        x = 15;
        y = (x + 2) * x;
        System.out.println("X = "+x+"  ,  Y = "+y);
    }   
    private static int hitung(int ky){
        int hasil = ky * ky;
        return hasil;
    }
}
