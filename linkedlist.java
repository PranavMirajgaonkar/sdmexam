import java.util.*;;

class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;

    void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        }
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    void insertion_at_end(int data) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice to insert element at end: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Node node = new Node();
                node.data = data;
                node.next = null;
                if (head = null) {
                head = node;
                } 
                else {
                    Node n = head;
                    while (n.next != null) {
                        n = n.next;
                    }
                    n.next = node;
                }
                break;
            default:
                System.out.println("Invalid Choice.");
        }
    }

    void print() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insertion_at_end(5);
        linkedList.print();
    }
}