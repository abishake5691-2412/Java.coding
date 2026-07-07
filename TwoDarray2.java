import java.util.Scanner;

public class TwoDarray2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[][]arr={
            {1,2},
            {4,5},
            {7,8}
        };
        for (int j=0;j<arr[0].length;j++){
            int columnSum=0;
            for(int i=0;i<arr.length;i++){
                columnSum+=arr[i][j];
            }
            System.out.println(columnSum);
        }
    }
    
}
