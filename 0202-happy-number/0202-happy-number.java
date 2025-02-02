class Solution {
    public boolean isHappy(int n) 
    {
        //if(n <10) return false;
		int sum = 0;
		for(int i=0; i<n;i++)
		{
			sum = 0;
			while(n>0)
			{
				int rem = n %10;
				sum +=  rem*rem;
				n /= 10;
			}
			n = sum;
		}
        if(sum == 1) {return true;}
        else {return false;}
    }
}