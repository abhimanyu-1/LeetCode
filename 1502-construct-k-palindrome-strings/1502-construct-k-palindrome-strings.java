class Solution {
    public boolean canConstruct(String s, int k)
    {
        if(s.length()<k){return false;}
        Map<Character,Integer> freequency = new HashMap<>();
        int oddCount = 0 ;
        char[] chars = s.toCharArray();

        for(char c:chars)
        {
            freequency.put(c,freequency.getOrDefault(c,0)+1);
        }
        for(int c:freequency.values())
        {
            if(c%2 != 0)
            {
                oddCount++;
            }
        }
        if(oddCount > k)
        {
            return false;
        }
        else 
        {
            return true;
        }
    }
}