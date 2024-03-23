//unknown error with these testcases
public class addList{
     static class ListNode {
     int val;
     ListNode next;
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int first=countNum(l1);
        int second=countNum(l2);
        long num=first+second;
        System.out.println(num);
        System.out.println(first);
        System.out.println(second);
        int curr=(int)num%10;
        num/=10;
        ListNode root=new ListNode(curr);
        ListNode temp=root;
        while(num!=0)
        {
            curr=(int)num%10;
            num/=10;
            ListNode newNode=new ListNode(curr);
            temp.next=newNode;
            temp=newNode;
        }
        temp.next=null;
        return root;
    }
    public static int countNum(ListNode ll)
    {   int num=0,i=0;
        while(ll!=null)
        {
            num+=(ll.val*(Math.pow(10,i)));
            i++;
            ll=ll.next;
        }
        return num;
    }

    public static void main(String args[])
    {
        ListNode l1=new ListNode(9);
        ListNode l2=new ListNode(1);
        l2.next=new ListNode(9);
        l2.next.next=new ListNode(9);
        l2.next.next.next=new ListNode(9);
        l2.next.next.next.next=new ListNode(9);
        l2.next.next.next.next.next=new ListNode(9);
        l2.next.next.next.next.next.next=new ListNode(9);
        l2.next.next.next.next.next.next.next=new ListNode(9);
        l2.next.next.next.next.next.next.next.next=new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next=new ListNode(9);
        ListNode root=addTwoNumbers(l1,l2);
        while(root!=null)
        {
            System.out.print(root.val+" ");
            root=root.next;
        }
    }
}