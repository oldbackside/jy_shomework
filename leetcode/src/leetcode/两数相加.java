package leetcode;

import java.util.ArrayList;

public class 两数相加 {
	 public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		 }
		
		    public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		    	ListNode  l=new ListNode(0);
		        ListNode  tem=l;
		        int m=0;
		        ListNode x=l1;
		        ListNode y=l2;
		        while(x!=null&&y!=null){
		            tem.next=new ListNode((x.val+y.val+m)%10);
		            m=(x.val+y.val)/10;
		            x=x.next;
		            y=y.next;
		            tem=tem.next;
		        }
		        if(x!=null) {
		        	while(x!=null) {
		        		tem.next=new ListNode((x.val+m)%10);
		        		m=0;
		        		x=x.next;
		        		tem=tem.next;
		        	}
		        }
		        if(y!=null) {
		        	while(y!=null) {
		        		tem.next=new ListNode((y.val+m)%10);
		        		m=0;
		        		y=y.next;
		        		tem=tem.next;
		        	}
		        }
		        if(m!=0) {
		        	tem.next=new ListNode(m);
		        }
		        
		        return l.next;
		    }
		    public static void main(String[] args) {
				ListNode l10=new ListNode(6);
				ListNode l11=new ListNode(9);
				ListNode l12=new ListNode(9);
				ListNode l20=new ListNode(5);
				ListNode l21=new ListNode(6);
				ListNode l22=new ListNode(4);
				l10.next=l11;
				l11.next=l12;
				l20.next=l21;
				l21.next=l22;
				ListNode an=addTwoNumbers(l10,l20);
				ListNode ann=an;
				for(int i=0;i<4;i++) {
				
				System.out.println(ann.val);
					
				ann=ann.next;
				}
			}
		
}
