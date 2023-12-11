package prosedur_fungsi;
public class Main{
    
    // prosedur!!
    public static void putra(){
        String nama = "Rizkhy";
        int umur = 19;
        System.out.println(nama+" ~ "+umur+" Thn.");
    }
    
    // Fungsi!!
    public static String putri(){
        String nama = "Salsa";
        int umur = 21;
        return nama+"  ~ "+umur+" Thn.";
    }
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~OutPut~~~~~~~~~~~~");
        putra();
        System.out.println(putri());
    }   
}
