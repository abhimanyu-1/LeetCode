class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int number =0;
        for(int x:nums)
        {
            if(x!=val)
            {
                nums[number++]=x;
            }
        }
        return number;
    }
}