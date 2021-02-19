package Assignment3;

public class AddLinkedList {
    
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

    static Node insert(Node list, int value) {
        Node node = new Node(value);
        node.next = null;

        if(list == null) {
            list = node;
        }
        else {
            Node last = list;
            while(last.next != null) {
                last = last.next;
            }

            last.next = node;
        }

        return list;
    }

    static void addList(Node A, Node B) {
        
        int sumA = 0;
        int sumB = 0;
        
        int multiplier = 1;
        while(A != null ) {
            sumA += A.value*multiplier;
            multiplier *= 10;
            A = A.next;
        }
        
        multiplier = 1;
        while(B != null ) {
            sumB += B.value*multiplier;
            multiplier *= 10;
            B = B.next;
        }
        
        int sumC = sumA + sumB;
        
        Node C = null;

        while(sumC > 0) {
            C = insert(C, sumC % 10);
            sumC = sumC/10;
        }

        printList(C);
    }
    static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println("");
    } 

    public static void main(String[] args) {

        AddLinkedList list = new AddLinkedList();
        list.head1 = new Node(5);
        list.head1.next = new Node(1);
        list.head1.next.next = new Node(4);
        

        list.head2 = new Node(5);
        list.head2.next = new Node(1);
        
        addList(list.head1, list.head2);

        
    }
}
