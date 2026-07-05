class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int arr_size = nums.size();
        int sum = 0;
        std::vector<int> return_arr;
        for(int i = 0; i < arr_size; i++) {
            for(int j = i + 1; j < arr_size; j++) {
                sum = nums[i] + nums[j];
                if(sum == target) {
                    return_arr.push_back(i);
                    return_arr.push_back(j);
                }
                sum = 0;
            }
        }
        return return_arr;
    }
};
