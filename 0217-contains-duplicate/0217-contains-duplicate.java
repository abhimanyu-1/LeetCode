class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        HashMap<Integer,Integer> set = new HashMap<>();

        for(int x:nums)
        {
            set.put(x,set.getOrDefault(x,0)+1);
        }    
        for(int x:nums)
        {
            if(set.get(x)>1)
            return true;
        }
        return false;
    }
}