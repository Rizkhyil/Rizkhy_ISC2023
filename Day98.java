package Day98;
import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner ry = new Scanner(System.in);
        int bonus=100000;
        System.out.print("Gol Karyawan : ");
        int a=ry.nextInt();
        if(a==1){
            System.out.println("Pendapatan "+(a=4000000));
        }else if(a==2){
            System.out.println("Pendapatan "+(a=7000000));
        }else if(a==3){
            System.out.println("Pendapatan "+(a=10000000));
        }else{
            System.out.println("Tidak ada golongan");
        }
        System.out.print("Lama kerja : ");
        int b=ry.nextInt();
        if(b>=5){
            System.out.println("Mendapatkan bonus");
        }else{
            System.out.println("Tidak ada bonus");
        }
        int c=b*bonus;
        int d=c+a;
        System.out.println("Total gaji yang didapatkan = "+d);
    }
}
 
