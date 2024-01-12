package Day95;
import java.util.*;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int [][] data = {
            {0, 5, 10},
            {15, 20, 25}
        };
        int [][] angka = {
            {30, 35, 40},
            {45, 50, 55}
        };
        System.out.println("Matrix data : ");
        printMatrix(data);
        System.out.println("");
        System.out.println("Matrix angka : ");
        printMatrix(angka);
        
        System.out.println("");
        System.out.println("Dijumlahkan : ");
        int [][] hasil = operasiMatrix(data, angka);
        printMatrix (hasil);
    }
    private static int[][] operasiMatrix(int [][] data,int [][] angka ){
        int i = 0;
        int [][]hasil = new int [data.length][angka[i].length];
        for ( i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[i].length; j++) {
               hasil[i][j] = data[i][j]+angka[i][j];
            }
        }
        return hasil;
    }
            
    private static void printMatrix(int [][] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print("[");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]);
                if(j < (data[i].length-1)){
                    System.out.print(", ");                   
                }else{
                    System.out.print("]\n");
                    
                }
            }
        }
    }
    
}
