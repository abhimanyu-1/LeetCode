import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int countPalindromicSubsequence(String s) {
        // Edge case: If the string is too short, no palindromes of length 3 are possible
        if (s == null || s.length() < 3) {
            return 0;
        }

        int n = s.length();
        // Arrays to track prefix and suffix occurrences of characters
        boolean[][] prefix = new boolean[26][n];
        boolean[][] suffix = new boolean[26][n];

        // Fill prefix array: Tracks if a character exists before a given index
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                for (int j = 0; j < 26; j++) {
                    prefix[j][i] = prefix[j][i - 1];
                }
            }
            prefix[s.charAt(i) - 'a'][i] = true;
        }

        // Fill suffix array: Tracks if a character exists after a given index
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1) {
                for (int j = 0; j < 26; j++) {
                    suffix[j][i] = suffix[j][i + 1];
                }
            }
            suffix[s.charAt(i) - 'a'][i] = true;
        }

        // Set to store unique palindromic subsequences
        Set<String> uniquePalindromes = new HashSet<>();

        // Iterate over the string to find "axa" patterns
        for (int i = 1; i < n - 1; i++) {
            char middle = s.charAt(i);
            for (int j = 0; j < 26; j++) {
                char outer = (char) (j + 'a');
                // Check if 'outer' exists before and after the current middle character
                if (prefix[j][i - 1] && suffix[j][i + 1]) {
                    uniquePalindromes.add("" + outer + middle + outer);
                }
            }
        }

        // Return the count of unique palindromes
        return uniquePalindromes.size();
    }
}
