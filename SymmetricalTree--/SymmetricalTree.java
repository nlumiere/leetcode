/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Node{
    int val;
    Node next;
    
    public Node(){
        val = 0;
        next = null;
    }
    
    public Node(int value){
        val = value;
        next = null;
    }
}

class LinkyListy{
    Node head;
    
    public LinkyListy(){
        head = null;
    }
    
    public void addNode(int x){
        Node n = new Node(x);
        if(head == null){
            head = n;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = n;
    }
    
    public int pop(){
        int i = head.val;
        head = head.next;
        return i;
    }
}

class SymmetricalTree {

    public static void main(String[] args){
       LinkyListy ll = new LinkyListy();
       ll.addNode(1);
       System.out.println(ll.head);
    }
    
//     public boolean isSymmetric(TreeNode root) {
//         return traversal(root, 0);
//     }
    
//     public void traversal(TreeNode node){
//         if(node.left != null){
//             traversal(node.left);
//         }
//         ll.addNode(node.val);
//         if(node.right != null){
//             traversal(node.right);
//         }
//     }
    
//     public boolean back_traversal(TreeNode node){
        
//     }
}