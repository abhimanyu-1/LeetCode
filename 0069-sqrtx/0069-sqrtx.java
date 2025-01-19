class Solution {
    public int mySqrt(int x) 
    {
        int first  = 0;
        int last = x;
        int sqrt = 1;

        while(first <= last)
        {
            long mid = (first+last)/2;
            if(mid*mid <= x)
            {
                sqrt = (int)mid;
                first = (int)mid+1;
            }
            else
            {
                last = (int)mid-1;
            }
        }
        return sqrt;
    }
}