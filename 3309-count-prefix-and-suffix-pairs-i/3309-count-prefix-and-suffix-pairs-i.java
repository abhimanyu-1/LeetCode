class Solution {
    public int countPrefixSuffixPairs(String[] words)
    {
        int count = 0;
        for (int i = 0; i < words.length; i++) 
        {
            for (int j = i+1; j < words.length; j++) 
            {
                if ( words[i].length() <= words[j].length())
                {
                    if(isPrefixOrSuffix(words[i], words[j]))
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static boolean isPrefixOrSuffix(String a, String b) 
    {
        return b.startsWith(a) && b.endsWith(a);
    }
}