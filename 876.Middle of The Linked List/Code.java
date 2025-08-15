import java.util.ArrayList;

class Solution {
  public ListNode midlleNode(ListNode head) {
    ArrayList<ListNode> array = new ArrayList<>();
    int length = 0;
    while (head != null) {
      array.add(head);
      head = head.next;
      length++;
    }
    return array.get(length / 2);
    // Time complexity = O(n)
    // Space complexity = O(n)
  }

  public ListNode midlleNodeBetter(ListNode head) {
    ListNode middle = head;
    ListNode end = head;

    while(middle.next != null && end.next.next != null){
      middle = middle.next;
      end = end.next.next;
    }
    return middle;
    // Time complexity = O(n)
    // Space complexity = O(1)
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(12);
    head.next.next.next.next.next.next = new ListNode(15);
    Solution solution = new Solution();
    ListNode middle = solution.midlleNode(head);
    System.out.println("Middle node value: " + middle.val);
  }
}

