package Day40;
public class Main {
    public static void main (String args[]) {
        
        int[] R = {7, 18, 46, 33, 21, 39, 40} ;
        int jumlah_index = R.length;
        int max = R[0] ;
        for(int y = 0; y < jumlah_index; y++) {
            if(R[y] > max ) {
                max = R[y];
            }
        }
        System.out.print("Max  = "+max);
        
        
    }
}
