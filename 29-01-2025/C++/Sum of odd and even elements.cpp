class Solution {
  public:
    vector<int> findSum(int n) {
        vector<int>ans;
        int odd=0;
        int even=0;
        for(int i=1;i<=n;i++){
            if(i%2==0)even += i;
            else odd+=i;
        }
        ans.push_back(odd);
        ans.push_back(even);
        return ans;
    }
};
