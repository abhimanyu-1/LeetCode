class Solution {
    public int romanToInt(String s)
    {
       Map<Character,Integer> list = new HashMap<>();
        list.put('I',1);
        list.put('V',5);
        list.put('X',10);
        list.put('L',50);
        list.put('C',100);
        list.put('D',500);
        list.put('M',1000);

        char[] c = s.toCharArray();
        int i,result=0;

        for ( i = 0; i < c.length; i++)
        {
            if (i < c.length - 1 && list.get(c[i]) < list.get(c[i + 1]))
            {
                result -= list.get(c[i]);
            } 
            else 
            {
                result += list.get(c[i]);
            }
        }
        return result;
    }
}