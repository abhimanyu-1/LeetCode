class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        if(s.length() != t.length())return false;

        Map<Character,Character> setST = new HashMap<>();
        Map<Character,Character> setTS = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char Smap = s.charAt(i);
            char Tmap = t.charAt(i);

            if(setST.containsKey(Smap))
            {
                if(setST.get(Smap)!=Tmap){return false;}
            }
            else
            {
                if(setTS.containsKey(Tmap)){return false;}
                setST.put(Smap,Tmap);
                setTS.put(Tmap,Smap);
            }
        }
        return true;
    }
}