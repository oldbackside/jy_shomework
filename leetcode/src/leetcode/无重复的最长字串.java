package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ���ظ�����ִ� {
    //�������ڵķ���
	public int lengthOfLongestSubstring(String s) {		
		int start=0;
		int max=0;
		int end=0;
		if(s.length()==0) return 0;
		Map<Character,Integer> map=new HashMap<>();
		for(;end<s.length();) {
			if(map.containsKey(s.charAt(end))) {
				if(map.get(s.charAt(end))<start) {
					map.replace(s.charAt(end), end);
					end++; 
				}
				else {
				max=Math.max(max,end-start);
				if(start!=map.get(s.charAt(end)))
				start=map.get(s.charAt(end))+1;
				else 
					start++;
				map.replace(s.charAt(end), end);
				end++; 
				}
				
			}
			else{
				map.put(s.charAt(end), end); 
				end++;
			}	
		}
		//if(start==0) max=Math.max(max,end-start);
		 max=Math.max(max,end-start);
		return max;
	}
	public int lengthOfLongestSubstring������(String s) {		
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
		String t="hjpjfg";
		���ظ�����ִ� j=new ���ظ�����ִ�();
		System.out.println(j.lengthOfLongestSubstring(t));
	}
}
