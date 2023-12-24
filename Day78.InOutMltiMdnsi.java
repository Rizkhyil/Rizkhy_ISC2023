package Day78;
import java.util.*;
import java.util.Arrays;
public class Main{

    public static void main(String[] args) {
        String[][] nama = new String[2][3];
        Scanner rk = new Scanner(System.in);
        for(int i = 0; i < nama.length; i++){
            for(int j = 0; j < nama[i].length; j++){
                System.out.print("Masukkan nilai "+i+","+j+" : ");
                nama[i][j] = rk.next();
            }
        }
        System.out.print(Arrays.deepToString(nama));
    }
}
 
