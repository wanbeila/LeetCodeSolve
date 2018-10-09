/**
 * Solution����LeetCode�ϵ�problem�Ľ������
 * 
 * @author wanbeila
 *
 */
public class Solution {
	/**
	 * Definition for singly-linked list. public class ListNode { int val;
	 * ListNode next; ListNode(int x) { val = x; } } ���ڸ��ݴ������������ʼ������ṹ
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
		// ���ؽڵ�
		ListNode result = new ListNode(0);
		// ���ؽڵ��α�
		ListNode p_r = result;
		int data1 = 0;
		int data2 = 0;
		// ��λ��ʶ
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
		// 1.ͨ����������Ԫ�أ���target��ȥ��ȥƥ��ʣ��Ԫ��
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
		// 2.ͨ���Ƚ�target��������ÿ��Ԫ�صĲ�ֵ����ã�Ȼ��
		return null;
	}

	/**
	 * Given a string, find the length of the longest substring without
	 * repeating characters. �Ż��취���жϵ�ǰ�Ӵ���ʣ���Ӵ����ܳ��ȣ�������ڣ������ֱ������ѭ��
	 * 
	 * @param s
	 * @return
	 */
	public static int lengthOfLongestSubstring(String s) {
		int result = 0; // ������еĳ���ֵ
		String subStr = ""; // �������\
		for (int pos = 0; pos < s.length(); pos++) {
			String c = s.charAt(pos) + "";
			// ����Ѿ���������Ӵ�������ֱ������ѭ��
			if ((subStr.length() + s.substring(s.indexOf(c), s.length()).length()) < result) {
				break;
			}
			if (!subStr.contains(c)) {
				// ����Ӵ��в�������һ���ַ�����ֱ�ӽ����ַ���ӵ��Ӵ���
				subStr += c;
			} else if (subStr.contains(c)) {
				// ����Ӵ��а�������һ��λ�õ��ַ�
				// �ȼ�¼�µ�ǰ����󳤶�
				// Ȼ����Ҫ���Ӵ����н�ȡ����ȡ�Ӳ������ַ���ʼһֱ����β
				if (subStr.length() > result) {
					result = subStr.length();
				}
				// �жϵ�ǰ�ظ�Ԫ�����Ӵ��е�λ��,����������һλ��ֱ����ղ�����ѭ��
				// �����ô��ظ�Ԫ�غ�һֱ���Ӵ�ĩβ���µ��Ӵ�
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
		// ��ȡ��������ĳ���
		int size_1 = nums1.length;
		int size_2 = nums2.length;
		if ((size_1 + size_2) % 2 == 0) {
			// ż������

		} else {
			// ��������
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
	 * ��ͷ��ʼ��һ��ƥ��
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
