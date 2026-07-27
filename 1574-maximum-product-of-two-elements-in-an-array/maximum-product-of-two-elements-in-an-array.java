class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        
        int j= nums.length;
        int pro=(nums[j-1]-1)*(nums[j-2]-1);
        
       return pro; 
    }
}