public class Node {
    TransaksiRental data;
    Node prev, next;

    Node(Node prev, TransaksiRental data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}