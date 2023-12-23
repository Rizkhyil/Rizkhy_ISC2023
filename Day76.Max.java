package Day76;
public class Main{

    public static void main(String[] args) {
        int[][] angka = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int max = 0, min = 10;
        for(int i = 0; i < angka.length; i++){
            for(int j = 0; j < angka[i].length; j++){
                if(max < angka[i][j]){
                   max = angka[i][j];
                }
                if(min > angka[i][j]){
                    min = angka[i][j];
                }
            }
        }
        System.out.println("~~~~~~~~Max Min~~~~~~~~");
        System.out.println("Max : "+ max);
        System.out.println("Min : "+ min);
    }
}
 
