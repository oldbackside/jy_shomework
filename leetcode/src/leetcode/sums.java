package leetcode;

import java.util.HashMap;
import java.util.Map;

public class sums {
    public int[] twoSum(int[] nums,int target) {
    	Map<Integer,Integer> map=new HashMap<>(); 
    	for(int i=0;i<nums.length;i++) {
    		map.put(nums[i],i);
    	}
    	for(int i=0;i<nums.length;i++) {
    		int tem=target-nums[i];
    		if(map.containsKey(tem)&&map.get(tem)!=i) {
    			return new int[] {i,map.get(tem)};
    		}
    	}
    	throw new IllegalArgumentException("no tow sum solution");
    }
	
}
