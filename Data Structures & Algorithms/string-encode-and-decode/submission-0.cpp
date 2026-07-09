class Solution {
public:

    string encode(vector<string>& strs) {
        vector<int> sizes;
        for(string& str: strs) {
            sizes.push_back(str.size());
        }

        string result;
        for(auto& sze: sizes) {
            result += to_string(sze);
            result.push_back('#');
            result += strs.front();
            strs.erase(strs.begin());
        }
        return result;
    }

    vector<string> decode(string s) {
        vector<string> result = {};
        int i = 0;
        int j = 0;
        size_t sze;
        while(i < s.size()) {
            j = i;
            while(s.at(j) != '#') {
                j++;
            }
            sze = stoi(s.substr(i, j - i));
            result.push_back(s.substr(j + 1, sze));
            i = j + sze + 1; 
        }
        return result;
    }
};
