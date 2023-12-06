package Day59;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        String[][] input = new String[2][2];
        for(int i = 0; i < input.length; i++){
            for(int r = 0; r < input[i].length; r++){
                System.out.print("Masukkan sesuatu : ");
                input[i][r] = ky.next();
            }
        }
        
    }
}
