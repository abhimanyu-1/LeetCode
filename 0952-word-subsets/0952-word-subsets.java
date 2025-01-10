class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) 
    {
        List<String> result = new ArrayList<>();
        
        // Create a global max frequency array for words2
        int[] maxFreq = new int[26];
        for (String word : words2) {
            int[] freq = getCharFrequency(word);
            for (int i = 0; i < 26; i++) {
                // Take the maximum count of each character across all words in words2
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }
        
        // Check each word in words1
        for (String word : words1) {
            int[] freq = getCharFrequency(word);
            if (isSubset(freq, maxFreq)) {
                result.add(word);
            }
        }
        
        return result;
    }
    
    // Helper method to calculate frequency of each character in a word
    private int[] getCharFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }
    
    // Helper method to check if one frequency array is a subset of another
    private boolean isSubset(int[] wordFreq, int[] maxFreq) {
        for (int i = 0; i < 26; i++) {
            if (wordFreq[i] < maxFreq[i]) {
                return false;
            }
        }
        return true;
    }
}