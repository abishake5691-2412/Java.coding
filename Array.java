import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] arr1=new int[5];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=in.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
        System.out.print(arr1[i]+" ");
        }
    }
    
}
