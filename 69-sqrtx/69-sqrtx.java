class Solution {
    public int mySqrt(int x){
        long start = 0, end = x, ans = -1;
        while (start <= end) {
            long mid = start + (end-start)/2;
            long sqrt = mid * mid;
            if (sqrt == x) {
                return (int)mid;
            }
            if (sqrt > x)
                end = mid-1;
            else {
                start = mid + 1;
                ans = mid;
            }
        }
        return (int)ans;
        
    }
}