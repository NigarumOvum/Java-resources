class LinkedList {
    Node head; 
    int total;

    LinkedList(){
        this.head = null;
        this.total = 0;
    }

    public void add(int data){

        Node newNode = new Node(data);
        newNode.next = null;

        if (this.head == null) {
            // no elements in the Linked List
            head = newNode;
        } else {
            //  elements in the Linked List
            Node last = getLastNode();
            last.next = newNode;
        }
        this.total++;
    }

    public Node getLastNode(){
        if (this.head == null) return null;

        Node last = this.head;
        Node control = this.head;

        while(control != null){
            last = control;
            control = last.next;
        }
        return last;
    }

    public Node getNodeAt(int pos){
        if(this.head == null || (this.total -1) < pos) return null;

        Node control = this.head;
        int x = 0;

        while(control != null){
            if(x == pos) break;
            x++;
            control = control.next;
        }
        return control;
    }

    public void append(Node node, int data){
        if(this.head == null || node == null) return;

        Node newNode = new Node(data);

        Node prev = node;
        Node next = node.next;
        this.total++
    }

    public void delete(Node node, int data) {
        Node control = this.head;
        Node temp = null;

        if (node == head) {
        // eliminate initial Node
        temp = this.head;
        this.head - this.head.next;

        temp = nul;
        } else {
        // eliminite the other node
        while(control.next != node){
            control = control.next;
            }
            temp = control.next;
            control.next = temp.next;
            temp = null;
        }
        this.total--;
    }

    public void removeDuplicated(){
        HashSet<Integer> set = new HeadSet<Integer>();
        Node node = this.head;
        Node prev = this.head;

        while (node != null){
            if(set.contains(node.data)){
                prev.next = node.next;
            } else {
                set.add(node.data);
                prev = node;
            }
            node = node.next;
        }
    }

    public void print(){
        Node node = this.head;

        while(node != null){
            System.out.printIn("*" + node.data);
            node = node.next;
        }
    }

    public class Node {
        int data;
        Node next;

        Node(int data){
        }
    }
}

class Program {
    public static void main (String[] args){
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        // list.append(node, data);
        list.append(list.getNodeAt(1), 30);
        list.delete(list.getNodeAt(4));
        list.removeDuplicated();
        list.print();
    }
}