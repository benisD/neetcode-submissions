class Solution {
  public boolean checkInclusion(String s1, String s2) {
    int distinctCharsNeeded = 0;
    int[] charFrequency = new int[26];

    for(char c: s1.toCharArray()) {
      int index = c - 'a';
      charFrequency[index]++;

      if(charFrequency[index] == 1) {
        distinctCharsNeeded++;
      }
    }

    int patternLength = s1.length();
    int textLenght = s2.length();

    for(int i = 0; i < textLenght; i++) {
      int currentCharIndex = s2.charAt(i) - 'a';
      charFrequency[currentCharIndex]--;
      if(charFrequency[currentCharIndex] == 0) {
        distinctCharsNeeded--;
      }

      if(i >= patternLength) {
        int leftCharIndex = s2.charAt(i - patternLength) - 'a';
        charFrequency[leftCharIndex]++;
        if(charFrequency[leftCharIndex] == 1) {
          distinctCharsNeeded++;
        }
      }
      if(distinctCharsNeeded == 0) {
        return true;
      }
    }
    return false;
  }
}