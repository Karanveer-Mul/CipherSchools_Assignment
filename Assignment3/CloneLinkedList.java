package Assignment3;

class CloneLinkedList
{ 

    static class Node 
    { 
        int data; 
        Node next,random; 
        Node(int x) 
        { 
            data = x; 
            next = random = null; 
        } 
    } 

    static void print(Node start) 
    { 
        Node ptr = start; 
        while (ptr != null) 
        { 
            System.out.println("Data = " + ptr.data + 
                        ", Random = "+ptr.random.data); 
            ptr = ptr.next; 
        } 
    } 

    static Node clone(Node start) 
    { 
        Node curr = start, temp = null; 
        while (curr != null) 
        { 
            temp = curr.next; 

            curr.next = new Node(curr.data); 
            curr.next.next = temp; 
            curr = temp; 
        } 
        curr = start; 

        while (curr != null) 
        { 
            if(curr.next != null) 
                curr.next.random = (curr.random != null) 
                        ? curr.random.next : curr.random; 

            curr = (curr.next != null) ? curr.next.next 
                            : curr.next; 
        } 

        Node original = start, copy = start.next; 

        temp = copy; 

        while (original != null && copy != null) 
        { 
            original.next = (original.next != null)? 
                        original.next.next : original.next; 

            copy.next = (copy.next != null) ? copy.next.next 
                                                : copy.next; 
            original = original.next; 
            copy = copy.next; 
        } 
        return temp; 
    } 
    public static void main(String[] args) 
    { 
        Node start = new Node(1); 
        start.next = new Node(2); 
        start.next.next = new Node(3); 
        start.next.next.next = new Node(4); 
        start.next.next.next.next = new Node(5); 

        start.random = start.next.next; 

        start.next.random = start; 

        start.next.next.random = start.next.next.next.next; 
        start.next.next.next.random = start.next.next.next.next; 

        start.next.next.next.next.random = start.next; 

        Node cloned_list = clone(start); 
        print(cloned_list); 

    } 
} 
