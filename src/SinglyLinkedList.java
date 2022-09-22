
public class SinglyLinkedList {

	static private ListNode head;

	static class ListNode {

		private int data;
		private ListNode next;

		ListNode(int data) {

			this.data = data;
			this.next = null;

		}

	}

	public void print(ListNode current) {
		

		while (current != null) {
			System.out.print(current.data + "--->");
			current = current.next;

		}
		System.out.println("null");
	}
	
	public int length(ListNode current) {
		
		int count = 0;
		
		while (current != null) {
		
			count ++;
			current = current.next;

		}
		return count;
	}

	public static void main(String[] args) {
		
		SinglyLinkedList sll = new SinglyLinkedList();
		//if the outer class is not static then SinglyLinkedList.ListNode listnode_first = sll.new ListNode(10);
		ListNode listnode_first = new ListNode(10);
		ListNode listnode_second = new ListNode(20);
		ListNode listnode_third = new ListNode(30);
		ListNode listnode_fourth = new ListNode(40);
		sll.head = listnode_first;
		head.next = listnode_first;
		listnode_first.next = listnode_second;
		listnode_second.next = listnode_third;
		listnode_third.next = listnode_fourth;
		
        sll.print(head);
       int count =  sll.length(head);
       System.out.println(count);
	}

}
