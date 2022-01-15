//Sample Input
pepCODinG

//Sample Output
p-11e11p-45C12O-11D37i5n-39G


import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		StringBuilder ans=new StringBuilder();
		ans.append(str.charAt(0));
	
		int i=1;
		while(i<str.length())
		{
		   char ch1=str.charAt(i);
		   char ch2=str.charAt(i-1);
		    
		  int  d=ch1-ch2;
		  ans.append(d);
		  ans.append(ch1);
		  
		  
		  i++;
		    
		}
		

		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
