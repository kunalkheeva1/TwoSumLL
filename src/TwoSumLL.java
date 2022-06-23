public class TwoSumLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node twoSumLL(Node l1, Node l2){
        Node head = new Node(0);
        Node tail = head;
        int carry =0;
        int a= 0;
        int b=0;
        while(l1!=null || l2!=null || carry>0 ){
            if(l1!=null){
                l1.data= a;
                l1=l1.next;
            }
            if(l2!=null){
             l2.data=b;
             l2 = l2.next;
            }
            int sum = (a+b+carry);
            carry = sum/10;
            Node temp = new Node(sum%10);

            tail.next =temp;
            tail = tail.next;
        }
        return head.next;
    }

    public static void main(String[] args) {

    }
}
