/**
 * Solution包含LeetCode上的problem的解决方法
 * 
 * @author wanbeila
 *
 */
public class Solution {
	/**
	 * Definition for singly-linked list. public class ListNode { int val;
	 * ListNode next; ListNode(int x) { val = x; } } 用于根据传入的数据来初始化链表结构
	 */
	public static ListNode initList(String val) {
		int len = val.length();
		ListNode head = new ListNode(Integer.parseInt(val.charAt(0) + ""));
		ListNode p = head;
		for (int i = 1; i < len; i++) {
			ListNode node = new ListNode(Integer.parseInt(val.charAt(i) + ""));
			p.next = node;
			p = p.next;
		}
		return head;
	}

	/**
	 * You are given two non-empty linked lists representing two non-negative
	 * integers. The digits are stored in reverse order and each of their nodes
	 * contain a single digit. Add the two numbers and return it as a linked
	 * list. You may assume the two numbers do not contain any leading zero,
	 * except the number 0 itself.
	 * 
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// 返回节点
		ListNode result = new ListNode(0);
		// 返回节点游标
		ListNode p_r = result;
		int data1 = 0;
		int data2 = 0;
		// 进位标识
		int carry = 0;
		while (l1 != null || l2 != null || carry != 0) {
			if (l1 != null) {
				data1 = l1.val;
				l1 = l1.next;
			} else {
				data1 = 0;
			}
			if (l2 != null) {
				data2 = l2.val;
				l2 = l2.next;
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
	 * Given an array of integers, return indices of the two numbers such that
	 * they add up to a specific target. You may assume that each input would
	 * have exactly one solution, and you may not use the same element twice.
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		int temp = 0;
		// 1.通过遍历数组元素，用target减去后去匹配剩余元素
		for (int i = 0; i < nums.length; i++) {
			temp = target - nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (temp == nums[j]) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		// 2.通过先将target与数组中每个元素的差值计算好，然后
		return null;
	}

	/**
	 * Given a string, find the length of the longest substring without
	 * repeating characters. 优化办法，判断当前子串与剩余子串的总长度，如果大于，则可以直接跳出循环
	 * 
	 * @param s
	 * @return
	 */
	public static int lengthOfLongestSubstring(String s) {
		int result = 0; // 最长子序列的长度值
		String subStr = ""; // 活动子序列\
		for (int pos = 0; pos < s.length(); pos++) {
			String c = s.charAt(pos) + "";
			// 如果已经满足最大子串条件则直接跳出循环
			if ((subStr.length() + s.substring(s.indexOf(c), s.length()).length()) < result) {
				break;
			}
			if (!subStr.contains(c)) {
				// 如果子串中不包含下一个字符，则直接将该字符添加到子串中
				subStr += c;
			} else if (subStr.contains(c)) {
				// 如果子串中包含有下一个位置的字符
				// 先记录下当前的最大长度
				// 然后需要对子串进行截取，截取从不含该字符开始一直到结尾
				if (subStr.length() > result) {
					result = subStr.length();
				}
				// 判断当前重复元素在子串中的位置,如果是在最后一位则直接清空并跳出循环
				// 否则获得从重复元素后一直到子串末尾的新的子串
				if (subStr.indexOf(c) == (subStr.length() - 1)) {
					subStr = "";
				} else {
					subStr = subStr.substring(subStr.indexOf(c) + 1, subStr.length());
				}
				subStr += c;

			}
		}
		if (subStr.length() > result)
			result = subStr.length();
		return result;
	}

	/**
	 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
	 * 
	 * Find the median of the two sorted arrays. The overall run time complexity
	 * should be O(log (m+n)).
	 * 
	 * You may assume nums1 and nums2 cannot be both empty.
	 * 
	 * Example 1:
	 * 
	 * nums1 = [1, 3] nums2 = [2]
	 * 
	 * The median is 2.0
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		// 获取两个数组的长度
		int size_1 = nums1.length;
		int size_2 = nums2.length;
		if ((size_1 + size_2) % 2 == 0) {
			// 偶数长度

		} else {
			// 奇数长度
		}
		return 0;
	}

	/**
	 * Given a string s, find the longest palindromic substring in s. You may
	 * assume that the maximum length of s is 1000.
	 * 
	 * Example 1:
	 * 
	 * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
	 * 
	 * 从头开始来一次匹配
	 * @param s
	 * @return
	 */
	public String longestPalindrome(String s) {
		for (int i = 0;i < s.length();i ++) {
			
		}
		return s;
	}
	
	private boolean isPalindrome(String sub, int start, int end) {
		int pre = start,former = end;
		while (sub.charAt(pre) == sub.charAt(end)) {
			
		}
		return false;
	}
}
