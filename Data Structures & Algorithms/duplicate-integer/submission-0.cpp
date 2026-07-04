class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        int array_size = nums.size();
        for(int i = 0; i < array_size; i++) {
            for(int j = i + 1; j < array_size; j++) {
                if(nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
};