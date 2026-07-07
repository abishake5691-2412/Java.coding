class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum=0,digitSum=0;
        for(int i:nums){
            elementSum+=i;//elementSum
            int temp=i;
            while(temp>0){//digitSum
                int digit=temp%10;
                digitSum+=digit;
                temp=temp/10;
            }
        }
        return elementSum-digitSum;
    }
}
//leet code program