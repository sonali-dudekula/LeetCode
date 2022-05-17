class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int first = firstOcc(nums,target);
        int last = lastOcc(nums,target);
        res[0] = first;
        res[1] = last;
        return res;
    }
    static int firstOcc(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] > target)
                end = mid-1;
            else if (nums[mid] < target)
                start = mid+1;
            else {
                if (mid==0 || nums[mid] != nums[mid-1])
                    return mid;
                else
                    end = mid-1;
            }
        } 
        return -1;
    }
    static int lastOcc(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] > target)
                end = mid-1;
            else if (nums[mid] < target)
                start = mid+1;
            else {
                if (mid==nums.length-1 || nums[mid] != nums[mid+1])
                    return mid;
                else
                    start = mid+1;
            }
        }
        return -1;
    }
}