package Day71;
public class Main{

    public static void main(String[] args) {
        int[] data  = {50, 44, 29, 18, 32, 8};
        int jml = 0;
        for(int i = 0; i < data.length; i++){
            jml += data[i];
        }
        System.out.print(jml);
    }   
}
