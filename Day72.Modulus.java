package Day72;
import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner rk = new Scanner(System.in);
        System.out.println("~~~~Nilai Modulus~~~~");
        System.out.print("Masukkan nilai : ");
        int n = rk.nextInt();
        System.out.print("");
        if(n % 3 == 0 && n % 5 != 0){
            System.out.print("Pride of 3");
        }else if(n % 5 == 0 && n % 3 != 0){
            System.out.print("Pride of 5");
        }else if(n % 3 == 0 && n % 5 == 0){
            System.out.print("Master class");
        }
    }
}
