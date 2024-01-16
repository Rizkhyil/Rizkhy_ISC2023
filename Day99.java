package Day99;
import java.util.Arrays;
public class Main{

    public static void main(String[] args) {
        int [] no = {1,3,4,0,2};
        System.out.print("---- UrutanAsli ----");
        System.out.println("  ");
        for (int i = 0; i < no.length; i++){
            System.out.print(no[i]+" ");
        }System.out.println("   ");
        Arrays.sort(no);
        System.out.print("---- UrutanYangBenar ----");
        System.out.println("  ");
        System.out.println(Arrays.toString(no));
    }
}
