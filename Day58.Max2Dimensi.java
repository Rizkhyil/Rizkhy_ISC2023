package Day58;
public class Main {

    public static void main(String[] args) {
        int[][] data = {
            {53, 70, 34, 89},
            {86, 92, 35, 77},
            {12, 24, 36, 41}
        };
        int max = 0;
        int min = 999;
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                if(max < data[i][j]){
                   max = data[i][j];
                }
                if(min > data[i][j]){
                    min = data[i][j];
                }
            }
        }
        System.out.println("Max : "+ max);
        System.out.println("Min : "+ min);
    }
}
