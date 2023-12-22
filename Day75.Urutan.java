package Day75;
import java.util.Arrays;
public class Main{

    public static void main(String[] args) {
        int [] no = {1,3,4,0,2};
        System.out.print("Urutan asli       : ");
        for (int i = 0; i < no.length; i++){
            System.out.print(no[i]+" ");
        }System.out.println("   ");
        Arrays.sort(no);
        System.out.print("Urutan yang benar : ");
        System.out.println(Arrays.toString(no));
    }
}
