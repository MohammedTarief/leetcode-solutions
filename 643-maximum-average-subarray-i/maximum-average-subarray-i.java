class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int mWin=0;
        for(int i=0;i<k;i++){
            mWin +=nums[i];
        }
        int Max=mWin;
        for(int i=k;i<nums.length;i++){
            mWin =mWin - nums[i-k] + nums[i];
            Max=Math.max(Max,mWin);
        }
        return (double) Max/k;
    }
}