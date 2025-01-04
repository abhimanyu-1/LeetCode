import java.util.*;
class Solution 
{
    public static int[] twoSum(int[] nums, int target) 
    {
        for(int i=0;i<nums.length;i++)
        {
            int check = 0;
            for(int j=0;j<nums.length;j++)
            {
                check = nums[i]+nums[j];
                if(i!=j && check == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }
}