package day11.quiz2Java;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner riz= new Scanner(System.in);

        System.out.print("Masukkan nilai m:"  );
        int m = riz.nextInt();
        
        System.out.print("Masukkan nilai n: " );
        int n = riz.nextInt();
        

        if (m < n){
         for (int a = m + 2; a < n; a++){
             System.out.print(a);
             
           if(a < n - 1){
               System.out.print(",");  
               
           } 
             
         }   
            
        }
        
     }
    
}
