package Day55;
public class Main {

    public static void main(String[] args) {
        
        String[][] nama = {
            {" Aril", "\t (Mamasa)"},
            {" Kholil", "\t (Tinambung)"},
            {" Jai", "\t ( Pasangkayu)"}
        };
        System.out.println("~~~~~~~OutPut~~~~~~~~");
        for(int y = 0; y < nama.length; y++){
            for(int j = 0; j < nama[y].length; j++){
                System.out.print(nama[y][j]);
            }
            System.out.println("");
        }
    }
}
