class Solution {
    public int characterReplacement(String s, int k) {
        int[] charFrequency = new int[26];
        int left = 0;
        int maxFreq = 0;

        for(int right = 0; right < s.length(); right++) {
            int currentCharIndex = s.charAt(right) - 'A';
            charFrequency[currentCharIndex]++;
            maxFreq = Math.max(maxFreq, charFrequency[currentCharIndex]);
            int windowSize = right - left + 1;
            int charactersToReplace = windowSize - maxFreq;
            if (charactersToReplace > k) {
                int leftCharIndex = s.charAt(left) - 'A';
                charFrequency[leftCharIndex]--;
                left++;
            }
        }
        return s.length() - left;
    }
}
