public class sortLinkedList{
    
  
  static class ListNode {
      int val;
      ListNode next;
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans=null;
        ListNode root=new ListNode(-1);//create a initial node to point a valid Node
        ListNode temp=root;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                ans=list1;
                list1=list1.next;
            }
            else{
                ans=list2;
                list2=list2.next;
            }
            temp.next=ans;
            temp=ans;
        }
        if(list1!=null){
            temp.next=list1;
        }
        if(list2!=null){
            temp.next=list2;
        }
        return root.next;
    }

    public static void main(String args[])
    {
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(2);
        list1.next.next=new ListNode(4);
         ListNode list2=new ListNode(1);
         list2.next=new ListNode(3);
         list2.next.next=new ListNode(4);
        ListNode root=mergeTwoLists(list1,list2);
        while(root!=null)
        {
            System.out.print(root.val+" ");
            root=root.next;
        }

    }
}