package Day12.quiz3.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner riz = new Scanner(System.in);
        
        System.out.print("Nilai  m : " );
        int m = riz.nextInt();
        
        System.out.print("Nilai  n : " );
        int n = riz.nextInt();
        
        if (m < n){
            int total = 0;
         for (int a = m + 1; a < n; a++){
             total += a;
             System.out.print(a);
             
           if(a < n - 1){
               System.out.print(" + ");  
           }  
         }   
            
            System.out.println(" = " + total);
        }
        
        System.out.println();
    }
}
