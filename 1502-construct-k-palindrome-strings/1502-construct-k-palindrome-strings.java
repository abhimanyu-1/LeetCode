class Solution {
    public boolean canConstruct(String s, int k)
    {
        if(s.length()<k){return false;}
        Map<Character,Integer> freequency = new HashMap<>();
        HashSet<Character> unq = new HashSet<>();
        int oddCount = 0 ;
        int evenCount = 0;
        char[] chars = s.toCharArray();

        for(char c:chars)
        {
            unq.add(c);
            freequency.put(c,freequency.getOrDefault(c,0)+1);
        }
        for(char c:unq)
        {
            if(freequency.get(c)%2 != 0)
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