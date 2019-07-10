package leetcode;

import java.util.HashSet;
import java.util.Set;

public class 无重复的最长字串 {
    
	public int lengthOfLongestSubstring(String s) {		
		int n=0;
		char[] c=new char[s.length()];
		c=s.toCharArray();
		for(int i=0;i<s.length();i++) {
	        int m=0;
	        int y=0;
			Set<Character> set = new HashSet<>();
			for(int j=i;j<s.length();j++) {	
				
				if(set.contains(c[j])) break;
				set.add(c[j]); 
			    m++;
			}
			if(n>=s.length()-i) break;
			if(m>n) n=m;
		}
		return n;
	}
	public static void main(String[] args) {
		String t="shggujjbnom";
		无重复的最长字串 j=new 无重复的最长字串();
		System.out.println(j.lengthOfLongestSubstring(t));
	}
}
