package Day96;
import java.util.*;
class angka {
    public int angka;
    public angka (int angka){
        this.angka = angka;
    }
    public static int getAngka(int angka){
        return angka;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <angka> angka = new ArrayList<>();
        System.out.print("Masukkan batas inputan : ");
        int batas = input.nextInt();

        for (int i = 0; i < batas; i++) {
            System.out.print("Masukkan angka : ");
            int a = input.nextInt();
            angka.add(new angka(a));
        }

        System.out.println("List Angka : ");
        for (int i = 0; i < angka.size(); i++) {
            System.out.println(angka.get(i).angka);
        }

        angka.remove(2);
        angka.remove(1);
        System.out.println("List angka setelah menghapus 2 elemen : ");
        for (int i = 0; i < angka.size(); i++) {
            System.out.println(angka.get(i).angka);
        }

        System.out.println("Apakah List kosong ?? " + angka.isEmpty());

    }
}
