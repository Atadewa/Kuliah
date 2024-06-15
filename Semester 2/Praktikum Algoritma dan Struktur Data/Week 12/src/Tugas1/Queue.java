package Tugas1;

public class Queue {
    Node head;
    int size;

    public Queue(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void enqueue(Pasien item){
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node (current, item, null);
            current.next = newNode;
        }
        size++;
    }
    
    public Pasien dequeue() throws Exception {
        Pasien delete = new Pasien(null, 0);
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong, tidak dapat dihapus");
        } else if (size == 1){
            delete = head.data;
            head = null;
        } else {
            delete = head.data;
            head = head.next;
            head.prev = null;
        }
        size--;
        return delete;
    }
    
    public void print(){
        if (!isEmpty()) {
            System.out.println("----------------------");
            System.out.printf("| Nomor | %-10s |\n", "Nama");
            System.out.println("----------------------");
            Node tmp = head;
            while (tmp != null) {
                System.out.printf("| %-5d | %-10s |\n", tmp.data.noAntri, tmp.data.nama);
                tmp = tmp.next;
            }
            System.out.println("----------------------");
            System.out.println("Sisa Antrian: " + size);
        } else {
            System.out.println("Antrian Kosong");
        }
    }
}

