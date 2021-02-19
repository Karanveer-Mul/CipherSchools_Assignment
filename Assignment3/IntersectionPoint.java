package Assignment3;

public class IntersectionPoint {
    
    static Node head1, head2;
 
    static class Node {
 
        int value;
        Node next;
 
        Node(int val)
        {
            value = val;
            next = null;
        }
    }

    Node reverse(Node root) {
        Node cur = root;
        Node prev = null;
        Node next;
        while(cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    void intersectionPoint(Node A, Node B) {
        
        A = reverse(A);
        B = reverse(B);
        
        Node prev = null;

        while(A != null && B != null) {
            prev = A;
            A = A.next;
            B = B.next;
            if(A.value != B.value) {
                break;
            }
        }

        System.out.println(prev.value);
    }
    
    public static void main(String[] args) {
        IntersectionPoint list = new IntersectionPoint();
 
        list.head1 = new Node(3);
        list.head1.next = new Node(6);
        list.head1.next.next = new Node(10);
        list.head1.next.next.next = new Node(15);
        list.head1.next.next.next.next = new Node(30);
        
        list.head2 = new Node(7);
        list.head2.next = new Node(10);
        list.head2.next.next = new Node(15);
        list.head2.next.next.next = new Node(30);

        list.intersectionPoint(head1, head2);
    }
}
