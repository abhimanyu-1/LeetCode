class Solution {
    public boolean canBeValid(String s, String locked) 
    {
        if (s.length() % 2 != 0) {
            return false; // Odd-length strings cannot be valid
        }

        int openMin = 0; // Minimum open parentheses count
        int openMax = 0; // Maximum open parentheses count

        // Left-to-right check
        for (int i = 0; i < s.length(); i++) {
            if (locked.charAt(i) == '1') {
                // Use the locked character
                if (s.charAt(i) == '(') {
                    openMin++;
                    openMax++;
                } else {
                    openMin--;
                    openMax--;
                }
            } else {
                // Use flexibility
                openMin--; // Assume this position is ')'
                openMax++; // Assume this position is '('
            }

            // If openMax goes negative, it's invalid
            if (openMax < 0) {
                return false;
            }

            // Ensure openMin is not negative (at least 0 opens)
            openMin = Math.max(openMin, 0);
        }

        // openMin must be 0 for the string to be valid
        if (openMin != 0) {
            return false;
        }

        // Right-to-left check
        openMin = 0;
        openMax = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (locked.charAt(i) == '1') {
                // Use the locked character
                if (s.charAt(i) == ')') {
                    openMin++;
                    openMax++;
                } else {
                    openMin--;
                    openMax--;
                }
            } else {
                // Use flexibility
                openMin--; // Assume this position is '('
                openMax++; // Assume this position is ')'
            }

            // If openMax goes negative, it's invalid
            if (openMax < 0) {
                return false;
            }

            // Ensure openMin is not negative (at least 0 closes)
            openMin = Math.max(openMin, 0);
        }

        // openMin must be 0 for the string to be valid
        return openMin == 0;
    }
}