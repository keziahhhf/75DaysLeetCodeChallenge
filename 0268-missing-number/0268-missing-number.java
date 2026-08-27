class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int sum1=0;
        for(int num:nums)
        sum+=num;
         sum1=n*(n+1)/2;
        return sum1-sum;
    }
}