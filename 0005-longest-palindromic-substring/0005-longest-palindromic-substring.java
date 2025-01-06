class Solution {
    public String longestPalindrome(String s) 
    {
          if (s == null || s.length() < 1) return "";
        
        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindrome (single character center)
            String palindrome1 = expandAroundCenter(s, i, i);
            // Even-length palindrome (two-character center)
            String palindrome2 = expandAroundCenter(s, i, i + 1);
            
            // Update longest if a longer palindrome is found
            if (palindrome1.length() > longest.length()) {
                longest = palindrome1;
            }
            if (palindrome2.length() > longest.length()) {
                longest = palindrome2;
            }
        }
        
        return longest;
    }
     private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the longest palindrome found in this range
        return s.substring(left + 1, right);
    }
}