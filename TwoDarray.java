import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int  n=in.nextInt();//row
        int m=in.nextInt();//column
        int[][] arr=new int[n][m];
        //input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=in.nextInt();
            }
        }
        //print
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }

    
}
