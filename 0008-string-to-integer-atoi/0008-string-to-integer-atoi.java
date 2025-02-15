import java.util.*;

class Solution {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        s = s.trim(); // Store the trimmed string back
        StringBuffer str = new StringBuffer();
        int ans = 0, sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Handle sign at the first position
            if (i == 0 && (ch == '-' || ch == '+')) {
                if (ch == '-') sign = -1;
                continue; // Skip to the next character
            }

            if (Character.isDigit(ch)) {
                str.append(ch); // Append the character as it is
            } else {
                break; // Stop at the first non-digit character
            }
        }

        // Handle empty case before conversion
        if (str.length() == 0) return 0;

        try {
            ans = Integer.parseInt(str.toString()) * sign;
        } catch (NumberFormatException e) {
            // Handle integer overflow cases
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return ans;
    }
}
