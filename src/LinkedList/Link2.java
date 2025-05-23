package LinkedList;

public class Link2 {
    Node head,tail;
    int size;
    public Link2()
    {
        head = tail = null;
        size = 0;
    }
    class Node{
        int data;
        Node next;
        public Node(int d){
            data = d;
            next = null;
        }
    }

    public void addFirst(int d){
        Node n = new Node(d);
        if(head == null){
            head = tail = n;
        }
        else {
            n.next = head;
            head = n;
        }
        size++;
    }

    public void addLast(int d){
        Node n = new Node(d);
        if(head == null){
            head = tail = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
        size++;
    }

    public void addAtPosition(int d, int position){
        if(position < 1 || position > size + 1){
            System.out.println("Invalid Position..");
            return;
        }

        if(position == 1){
            addFirst(d);
        } else if (position == size) {
            addLast(d);
        } else {
            Node n = new Node(d);
            Node current = head;
            for (int i = 1; i < position; i++) {
                current = current.next;
            }
            n.next = current.next;
            current.next = n;
            size++;
        }
    }

    public int deleteFirst(){
        if(head == null){
            System.out.println("List is empty.");
            return -1;
        }
        int val = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondlast = get(size -2);
        int val = tail.data;
        tail = secondlast;
        tail.next = null;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void printList(Node head){
        while (head != null){
            System.out.print("|" + head.data + "| -> ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Link2 list = new Link2();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(4);
        list.addLast(8);
        list.addLast(32);
        list.addLast(64);
        list.addLast(128);

        list.addAtPosition(16,4);
        //Insert 16 at 4th position...
        list.printList(list.head);
        System.out.println(list.deleteFirst());
        list.printList(list.head);
        System.out.println(list.deleteLast());
        list.printList(list.head);
    }
}
