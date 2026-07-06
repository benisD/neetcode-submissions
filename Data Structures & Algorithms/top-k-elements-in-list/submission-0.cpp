class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        vector<int> result;
        unordered_map<int, int> freq;
        for(int num : nums) {
            freq[num]++;
        }

        vector<pair<int, int>> freqVector;
        for(const auto& entry : freq) {
            freqVector.push_back({entry.first, entry.second});
        }

        sort(freqVector.begin(), freqVector.end(), [](const pair<int, int>& a, const pair<int, int>& b)
        {
        return a.second > b.second;
        });

        for (int i = 0; i < k; i++) {
            result.push_back(freqVector[i].first);
        }
    return result;
    }
};
