/**
 * Solution包含LeetCode上的problem的解决方法
 * @author wanbeila
 *
 */
public class Solution {
	/**
	 * Definition for singly-linked list. 
	 * public class ListNode { 
	 * int val; 
	 * ListNode next; 
	 * ListNode(int x) { val = x; } 
	 * }
	 * 用于根据传入的数据来初始化链表结构
	 */
	public static ListNode initList(String val) {
		int len = val.length();
		ListNode head = new ListNode(Integer.parseInt(val.charAt(0) + ""));
		ListNode p = head;
		for (int i = 1;i < len;i ++) {
			ListNode node = new ListNode(Integer.parseInt(val.charAt(i) + ""));
			p.next = node;
			p = p.next;
		}
		return head;
	}
	/**
	 * You are given two non-empty linked lists representing two non-negative integers. 
	 * The digits are stored in reverse order and each of their nodes contain a single digit. 
	 * Add the two numbers and return it as a linked list.
	 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		//建立两个游标
		ListNode p1 = l1;
		ListNode p2 = l2;
		//返回节点
		ListNode result = new ListNode(0);
		//返回节点游标
		ListNode p_r = result;
		int data1 = 0;
		int data2 = 0;
		//进位标识
		int carry = 0;
		while (p1 != null || p2!= null || carry != 0) {
			if (p1 != null) {
				data1 = p1.val;
				p1 = p1.next;
			} else {
				data1 = 0;
			}
			if (p2 != null) {
				data2 = p2.val;
				p2 = p2.next;
			} else {
				data2 = 0;
			}
			ListNode node = new ListNode((data1 + data2 + carry) % 10);
			carry = (data1 + data2 + carry) / 10;
			p_r.next = node;
			p_r = p_r.next;
		}
		return result;
	}
	
	/**
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		int temp = 0;
		//通过遍历数组元素，用target减去后去匹配剩余元素
		for (int i = 0;i < nums.length;i ++) {
			temp = target - nums[i];
			for (int j = i + 1;j < nums.length;j ++) {
				if (temp == nums[j]) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return null;
    }

}
