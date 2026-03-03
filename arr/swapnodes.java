class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode first = head;
        
        // Move to kth node from start
        for(int i = 1; i < k; i++){
            first = first.next;
        }
        
        ListNode temp = first;
        ListNode second = head;
        
        // Find kth node from end
        while(temp.next != null){
            temp = temp.next;
            second = second.next;
        }
        
        // Swap values
        int val = first.val;
        first.val = second.val;
        second.val = val;
        
        return head;
    }
}