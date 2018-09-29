import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		/*用链表来计算两个数的和
		System.out.println("input two numbers");
		String a = read.next();
		String b = read.next();
		
		ListNode head_a = Solution.initList(a);
		ListNode head_b = Solution.initList(b);
	
		ListNode node = new Solution().addTwoNumbers(head_a, head_b);
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}*/
		
		int[] nums = new int[] {2,7,11,5};
		int target = 9;
		System.out.println(Solution.twoSum(nums,  target)[0] + " " + Solution.twoSum(nums,  target)[1]);
	}

}
