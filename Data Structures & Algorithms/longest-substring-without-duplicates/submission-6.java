class Solution {
  public int lengthOfLongestSubstring(String s) {
    int l = 0, r = 0, max_winSize = 0, winSize = 0;
    char[] arr = s.toCharArray();
    HashSet<Character> substr = new HashSet<Character>();
    while(r < s.length()) {
      if(!substr.contains(arr[r])) {
        substr.add(arr[r]);
        r++;
        winSize = r - l;
      } else {
        substr.remove(arr[l]);
        l++;
      }
      if(winSize > max_winSize) max_winSize = winSize;
    }
    return max_winSize;
  }
}