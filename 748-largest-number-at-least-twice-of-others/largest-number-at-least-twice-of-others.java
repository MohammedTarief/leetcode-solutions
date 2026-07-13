class Solution {
    public int dominantIndex(int[] nums) {
        int large = Integer.MIN_VALUE;
         int largeindex=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>large){
              large = nums[i];
              largeindex=i;
            }
            }
        for(int i = 0; i < nums.length; i++) {
            if(i == largeindex){
            continue;
            }
            if(large<2*nums[i]){
            return -1;
            }

       }return largeindex;
            
      
    }
}