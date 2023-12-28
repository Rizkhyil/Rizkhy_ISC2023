package prosedur_fungsi;
public class Main{
    public static void putra(){
        String nama = "Ilman";
        int tahun_lahir = 2004;
        System.out.println(nama+" ~ lahir pada tahun "+tahun_lahir+".");
    }
    public static String putri(){
        String nama = "Salsa";
        int tahun_lahir = 2002;
        return nama+"  ~ lahir pada tahun "+tahun_lahir+".";
    }
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~OutPut~~~~~~~~~~~~");
        putra();
        System.out.println(putri());
    }   
}
