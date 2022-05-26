class Solution {
    public int pivotIndex(int[] nums) {
        int pivot = -1;
        if (nums.length == 0) 
            return pivot;
        int sum_left = 0, sum_right = 0;
        for(int i = 1; i < nums.length; i++) 
            sum_right += nums[i];
        for (int i = 1; i < nums.length; i++) {
            if (sum_left == sum_right) {
                pivot = i-1;
                return pivot;
            }
            
            sum_right -= nums[i];
            sum_left += nums[i-1];
        }
        if(sum_right == sum_left)
            pivot = nums.length - 1;
        return pivot;
    }
}