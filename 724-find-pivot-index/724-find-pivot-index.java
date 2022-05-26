class Solution {
    public int pivotIndex(int[] nums)
    {
        if(nums.length<1)
            return -1;
        int rsum=0, lsum=0;
        for(int x:nums)    //calculating sum of the array
            rsum+=x;
        for(int x=0; x<nums.length; x++)
        {
            rsum-=nums[x];
            if(rsum==lsum)
                return x;
            lsum+=nums[x];
        }
        return -1;
    }
}