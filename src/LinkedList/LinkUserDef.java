package LinkedList;

import java.util.Scanner;

public class LinkUserDef {
    Node head, tail;
    int size;

    public LinkUserDef() {
        head = tail = null;
        size = 0;
    }

    class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    public void addFirst(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head = n;
        }
        size++;
    }

    public void addLast(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print("|" + current.data + "| -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Link2 list = new Link2();

        while (true) {
            System.out.println("\n==== Linked List Menu ====");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Print List");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert at beginning: ");
                    int first = scanner.nextInt();
                    list.addFirst(first);
                    break;
                case 2:
                    System.out.print("Enter element to insert at end: ");
                    int last = scanner.nextInt();
                    list.addLast(last);
                    break;
                case 3:
                    System.out.println("Linked List Elements:");
                    list.printList(list.head);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
