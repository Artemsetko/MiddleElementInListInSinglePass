package com.artem;

public class LinkedListTest {
    public static void main(String args[]) {
        //creating LinkedList with 15 elements including head
        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = linkedList.head();
        linkedList.add(new LinkedList.Node("1"));
        linkedList.add(new LinkedList.Node("2"));
        linkedList.add(new LinkedList.Node("3"));
        linkedList.add(new LinkedList.Node("4"));
        linkedList.add(new LinkedList.Node("5"));
        linkedList.add( new LinkedList.Node("6"));
        linkedList.add( new LinkedList.Node("7"));
        linkedList.add( new LinkedList.Node("8"));
        linkedList.add( new LinkedList.Node("9"));
        linkedList.add( new LinkedList.Node("10"));
        linkedList.add( new LinkedList.Node("11"));
        linkedList.add( new LinkedList.Node("12"));
        linkedList.add( new LinkedList.Node("13"));
        linkedList.add( new LinkedList.Node("14"));
        linkedList.add( new LinkedList.Node("15"));

        //finding middle element of LinkedList in single pass
        LinkedList.Node current = head;
        int length = 0;
        LinkedList.Node middle = head;

        while (current.next() != null) {
            length++;
            if (length % 2 == 0) {
                middle = middle.next();
            }
            current = current.next();
        }
        if (length % 2 == 1) {
            middle = middle.next();
        }

        System.out.println("length of LinkedList: " + length);
        System.out.println("middle element of LinkedList : " + middle);

    }

}

class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = new Node("head");
        tail = head;
    }

    public Node head() {
        return head;
    }

    public void add(Node node) {
        tail.next = node;
        tail = node;
    }

    public static class Node {
        private Node next;
        private String data;

        public Node(String data) {
            this.data = data;
        }

        public String data() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public String toString() {
            return this.data;
        }
    }
}

/*„то если этот список зациклен?
≈сли каждый указатель который мы поддерживаем будет указывать на одну и туже ноду,
то это означает что данный список зациклен.

 ак найти 3-й элемент с конца в св€занном списке за один проход
ќтвет тот же, только второй указатель должен указывать на 3й элемент от первого*/

