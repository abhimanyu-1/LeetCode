class Solution {
    public int climbStairs(int n) 
    {
        if(n == 1){return 1;}
        int a = 0;
        int b = 1;
        int c = 0;
        while(n>0)
        {
            c = a+b;
            a=b;b=c;
            n--;
        }
        return c;
    }
}