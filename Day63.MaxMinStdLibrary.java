package Day63;
import java.util.Arrays;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
        Integer[] r = {11, 22, 33, 44, 55, 66, 77, 88, 99,};
        int maks = Collections.max(Arrays.asList(r));
        int mint = Collections.min(Arrays.asList(r));
        System.out.print("Deretan angka index : ");
        for(int i = 0; i < r.length; i++){
            System.out.print(r[i]+" ");
        }
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~OutPut~~~~~~~~~~~~~~~~");
        System.out.println("Nilai tertinggi : "+maks);
        System.out.println("Nilai terendah  : "+mint);
    }
}
