package Day90;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] angka = {21, 32, 12, 42, 2, 38};
        int jml = angka.length;
        int min = 50;
        for(int i = 0; i < jml; i++){
            if(angka[i] < min){
                min = angka[i];
            }
        }
        System.out.println("Min : "+min);
    }
}
