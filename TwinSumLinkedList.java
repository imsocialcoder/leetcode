/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class TwinSumLinkedList {
    public int pairSum(ListNode head) {
        int result = 1;
        //ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int size = list.size();
        for(int i=0; i<size; i++){
            int calculatedValue = list.get(i) + list.get(size-1-i);
            if( calculatedValue > result)
                result = calculatedValue;
        }
        return result;
    }
}
