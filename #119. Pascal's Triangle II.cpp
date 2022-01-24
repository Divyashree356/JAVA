                #EASY

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]

class Solution {
public:
   
    
    vector<int> getRow(int rowIndex) {
      vector<int> ans(rowIndex+1);
        long ncr=1;
        for(int i=0;i<=rowIndex;i++)
        {
          ans[i] = (int)ncr;
            ncr=ncr*(rowIndex-i)/(i+1);
        }
        return ans;
    }
};
