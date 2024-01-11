package Day94;
import java.util.Enumeration;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Enumeration kawan;
        Vector namaKawan = new Vector();

        namaKawan.add("Dika");
        namaKawan.add("Ical");
        namaKawan.add("akbar");
        namaKawan.add("Iwan");
        kawan = namaKawan.elements();
        
        System.out.println("Daftar Nama Kawan :");
        System.out.println("-------------------");
        while (kawan.hasMoreElements()){
            System.out.println(kawan.nextElement());
        }
    }
}
