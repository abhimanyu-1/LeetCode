class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int count = 0;
        int pos = 0;
        boolean found = false;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == target)
            {
                found = true;
                return i;
            }
        }
        if(!found)
        {
            pos = nums.length;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i] >= target)
                {
                    return i;
                }
            }
        }
        return pos;
    }
}