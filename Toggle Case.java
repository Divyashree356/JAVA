//Sample Input
pepCODinG

//Sample Output
PEPcodINg

import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
	    StringBuilder ans=new StringBuilder();
	    int i=0;
	    while(i<str.length())
	    {
	        char ch=str.charAt(i);
	        if(ch>='A' && ch<='Z')
	        {
	           char lc= (char)(ch-'A' +'a');
	           ans.append(lc);
	        }
	        else{
	            char lc= (char)(ch-'a'+'A');
	            ans.append(lc);
	        }
	        i++;
	        
	    }
	    

		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
