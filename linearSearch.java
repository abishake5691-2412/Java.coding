import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int target=in.nextInt();
        boolean isFound=false;
        for(int i:arr){
            if(i==target){
                System.out.println("Value found");
                isFound=true;
            }
        }
        if(!isFound){
            System.out.println("Value not found");
        }

        }
    }
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sDigit=0;
        int dDigit=0;
        for(int num:nums){
            if(num<10){
                sDigit+=num;
            }
            else{
                dDigit+=num;
            }
        }
        if(sDigit==dDigit)return false;
        return true;        
    }
}
