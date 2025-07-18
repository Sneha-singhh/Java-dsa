import java.util.*;
public class max_1s{
    static int rowWithMax1s(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        
        for(int col = 0; col<m; col++){
            for(int row = 0; row<n; row++){
                if(arr[row][col] == 1)
                    return row;
            }
        }
            return -1;
        }
    public static void main(String[] args){
        int [][] arr = {
            {0,1,1,1},
            {0,0,1,1},
            {1,1,1,1},
            {0,0,0,0}
        };
        int ans = rowWithMax1s(arr);
        System.out.print(ans);
    }
}