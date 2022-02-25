//GFG QUESTION
Example 1:

Input:
N = 3
Output: 5
Explanation: 5 strings are (000,
001, 010, 100, 101).
Example 2:

Input:
N = 2
Output: 3
Explanation: 3 strings are
(00,01,10).
  
// User function Template for Java

class Solution {
    static int mod= (int)1e9+7;
    long countStrings(int n) {
        	
	  long oldzero=1;
	  long oldone= 1;
	  
	  for(int i=2;i<=n;i++)
	  {
	      long newzero = (oldzero+ oldone)%mod;
	      long newone= oldzero;
	      
	      oldzero=newzero;
	      oldone=newone;
	  }
	  return ((oldzero+oldone)%mod);
	}
    }
