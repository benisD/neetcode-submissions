class Solution {
  public int maxArea(int[] heights) {
    int max = 0;
    int area;
    int i = 0;
    int j = heights.length - 1;
    while(i < j) {
      area = (j - i)*Math.min(heights[i], heights[j]);
      if(max < area)  max = area;
      if(heights[i] >= heights[j])  j--;
      else i++;
    }
    return max;
  }
}