package Assignment3;

public class MergeKsorted {
    
    static Node head1, head2, head3;
 
    static class Node {
 
        int value;
        Node next;
 
        Node(int val)
        {
            value = val;
            next = null;
        }
    }

    static Node mergeList(Node l1, Node l2) {
        if(l1 == null)  return l2;
        if(l2 == null)  return l1;
        Node p1 = null;
        Node head = l1;
       
        while(l1 != null && l2 != null) {
            if(l1.value <= l2.value) {
                p1 = l1;
                l1 = l1.next;
            } else {
                
                if(p1 != null) {
                    p1.next = l2;
                } else {
                    head = l2;
                }
                Node saveL2Next = l2.next;
                l2.next = l1;
                p1 = l2;
                l2 = saveL2Next;
            }
        }
        if(l1 == null)  p1.next = l2;
        
        return head;
    }

    static void sortedList(Node[] arr, int n) {
        Node A = arr[0];

        for(int i=1; i<n; i++) {
            A = mergeList(A, arr[i]);
        }

        System.out.println();

        while(A != null) {
            System.out.print(A.value + " ");
            A = A.next;
        }
     
    } 

    public static void main(String[] args) {
        MergeKsorted list = new  MergeKsorted();
        list.head1 = new Node(1);
        list.head1.next = new Node(4);
        list.head1.next.next = new Node(6);
        list.head1.next.next.next = new Node(7);
        list.head1.next.next.next.next = new Node(9);
        
        list.head2 = new Node(0);
        list.head2.next = new Node(2);
        list.head2.next.next = new Node(11);
        list.head2.next.next.next = new Node(12);
        
        list.head3 = new Node(3);
        list.head3.next = new Node(5);
        list.head3.next.next = new Node(8);
        list.head3.next.next.next = new Node(10);

        Node[] arr = new Node[3];
        arr[0] = head1;
        arr[1] = head2;
        arr[2] = head3;
        sortedList(arr, arr.length);
       
    }
}
