class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> result = new HashSet<>();
    for(int i = 0; i < nums.length; i++) {
      Set<Integer> hs = new HashSet<>();
      for(int j = i + 1; j < nums.length; j++) {
        int k = -(nums[i] + nums[j]);
        List<Integer> list = new ArrayList<>();
        if(hs.contains(k)) {
          list.add(nums[i]);
          list.add(nums[j]);
          list.add(k);
          Collections.sort(list);
          result.add(list);
        }
        hs.add(nums[j]);
      }
    }
    List<List<Integer>> Final = new ArrayList<>(result);
    return Final;
  }
}