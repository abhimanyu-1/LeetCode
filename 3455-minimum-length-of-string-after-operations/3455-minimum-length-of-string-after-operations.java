class Solution {
    public int minimumLength(String s) 
    {
        if(s.length() < 3){return s.length();}
        Map<Character,Integer> freq = new HashMap<>();
        int count =0;

        for(int i=0;i<s.length();i++)
        {
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }

        for(char ch:freq.keySet())
        {
            int value = freq.get(ch);
            if(value %2 ==0)
            {
                count +=2;
            }
            else
            {
                count++;
            }
        }
        return count;

    }
}