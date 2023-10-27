package hari19.Kalku;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner rizz = new Scanner(System.in);
        
        float angka1,angka2, hasil;
        char operator;
            
        System.out.print(" Angka1   : ");
        angka1 = rizz.nextFloat();
        
        System.out.print(" Operator : ");
        operator = rizz.next().charAt(0);
        
        System.out.print(" Angka2   : ");
        angka2 = rizz.nextFloat();
        
        switch(operator){
            case '+':
                System.out.print(" Hasil = " + (angka1 + angka2));
                break;
                
            case'-':
                System.out.print(" Hasil =  " + (angka1 - angka2));
                break;
              
            case'*':
                System.out.print(" Hasil =  " + (angka1 * angka2));
                break;
            
            case'/':
                System.out.print(" Hasil =  " + (angka1 / angka2));
                break;
            
            case'%':
                System.out.print(" Modulusnya adalah =" + (angka1 % angka2));
                break;
            
        }     
    }
}
