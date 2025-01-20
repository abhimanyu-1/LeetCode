class Solution {
    public boolean isPalindrome(String s) 
    {
        int left = 0;
        int right = s.length()-1;
        String m = s.toLowerCase();

        while (left < right) 
        {
            while (left < right && !Character.isLetterOrDigit(m.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(m.charAt(right))) {
                right--;
            }

            if (m.charAt(left) != m.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}