package LINKEDLIST;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public Node get(int index){
        Node temp = head;
        for(int i =0 ; i<index;i++){
            temp = temp.next ;
        }
        return temp ;
    }

    public void insertfirst(int value) {

        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void insertlast(int value) {
        Node node = new Node(value);
        if (tail == null) {
            insertfirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index) {

        if (index == 0) {
            insertfirst(value);
            return;
        }
        if (index == size) {
            insertlast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;

        size++;

    }
    public int deletefirst(){

        int val = head.value;

        head=head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deletelast(){
            if (size<=1){
                return deletefirst();
            }

            Node secondlast = get(size-2);
            int val = tail.value;
            tail = secondlast;
            secondlast.next=null;
            size--;
            return val;

    }
    public int  delete(int index){

        //delete first


        if(index == 0){
            return deletefirst();

        }

        //Delete Last


        if (index == size-1){
            return deletelast();
        }

        //Delete any part

        Node prev = get(index -1);
        int val = prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
    }


    static void main(String[] args) {

        LL list = new LL();

        //INSERT

        list.insertfirst(4);
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(1);
        list.insertlast(5);
        list.insert(7, 3);

        //DELETE

        list.display();
        System.out.println();

        System.out.println(list.deletefirst());
        list.display();

        System.out.println();

        System.out.println(list.deletelast());
        list.display();

        System.out.println();

        System.out.println(list.delete(2));
        list.display();
        
    }


}
