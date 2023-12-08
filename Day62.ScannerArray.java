package rain;
import java.util.*;
public class DRain {
    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        String[][] nama = new String[2][2];
        for (int i = 0; i < nama.length; i++) {
            for (int j = 0; j < nama[i].length; j++) {
                System.out.print("Masukkan sesuatu : ");
                nama[i][j] = ky.next();
            }
        }
        
    }
}
