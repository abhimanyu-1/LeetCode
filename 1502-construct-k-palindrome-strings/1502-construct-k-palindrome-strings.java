class Solution {
    public boolean canConstruct(String s, int k)
    {
        if(s.length()<k){return false;}
        Map<Character,Integer> freequency = new HashMap<>();
        int oddCount = 0 ;

        for(char c : s.toCharArray())
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
        
        return oddCount<=k;
    }
}