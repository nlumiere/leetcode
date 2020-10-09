public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {     
        if(headA == null || headB == null) return null;
        ListNode currA = headA;
        ListNode currB = headB;
        while(currA != null && currB != null){
            currA = currA.next;
            currB = currB.next;
        }
        int diffA = 0;
        int diffB = 0;
        while(currA != null || currB != null){
            if(currA == null){
                diffB++;
                currB = currB.next;
            }
            else{
                diffA++;
                currA = currA.next;
            }
        }
        
        currA = headA;
        currB = headB;
        for(int i = 0; i < diffA; i++){
            currA = currA.next;
        }
        for(int j = 0; j < diffB; j++){
            currB = currB.next;
        }
        
        while(currA != currB){
            currA = currA.next;
            currB = currB.next;
        }
        return currA;
        
    }
}