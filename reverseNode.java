// Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

// k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

// You may not alter the values in the list's nodes, only nodes themselves may be changed.
public class reverseNode{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static void main(String args[]){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        Node temp=reverseKGroup(head,2);
        System.out.print("-> "+temp.val);
        while(temp.next!=null){
            System.out.print("-> "+temp.next.val);
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node reverseKGroup(Node head, int k){
        Node prev=head;Node curr=head.next;Node Next=curr.next;
        for(int i=0;i<k-1;i++){
            curr.next=prev;
            prev=curr;
            curr=Next;
            Next=Next.next;
        }
        head.next=curr;
        head=prev;
        return head;
        while(;;){
            for()
        }
        
    }
}