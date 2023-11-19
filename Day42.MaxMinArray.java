package Day41;
public class Main {
    
    public static void main(String[] args) {
        int[] R = {9, 7, 2, 6, 8, 11, 5};
        int jumlah = R.length;
        int max = R[0], min = R[0];
        System.out.print("Deret bil : "+jumlah);
        for(int y = 0; y < jumlah; y++){
            System.out.print(R[y]+" ");
            if(R[y] > max){
                max = R[y];
            }if(R[y] > min){
                min = R[y];
            }
            
        }
        System.out.println("");
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
    }
}
