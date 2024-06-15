package Tugas2;
public class DoubleLinkedLists {
    Node head;
    int size;

    public DoubleLinkedLists(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst (Film item){
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Film item){
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node (current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add (Film item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node (null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node (current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public void print(){
        if (!isEmpty()) {
            System.out.println("=====================================================");
            System.out.printf("| ID Film | %-25s | Rating Film |\n", "Judul Film");
            System.out.println("=====================================================");
            Node tmp = head;
            while (tmp != null) {
                System.out.printf("| %-7d | %-25s | %-11.2f |\n", tmp.data.id, tmp.data.judul, tmp.data.rating);
                tmp = tmp.next;
            }
            System.out.println("=====================================================");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public Film removeFirst() throws Exception {
        Film delete = new Film(0, null, 0);
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
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
    
    public Film removeLast() throws Exception{
        Film delete = new Film(0, null, 0);
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            delete = head.data;
            head = null;
            size--;
            return delete;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        delete = current.next.data;
        current.next = null;
        size--;
        return delete;
    }
    
    public Film remove (int index) throws Exception {
        Film delete = new Film(0, null, 0);
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0){
            delete = head.data;
            head = null;
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            delete = current.data;
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
        return delete;
    }
    
    public void findFilm (int idKey){
        Node tmp = head;
        for (int i = 0; i < size; i++) {
            if (tmp.data.id == idKey) {
                System.out.println("ID Film\t\t: " + tmp.data.id);
                System.out.println("Judul Film\t: " + tmp.data.judul);
                System.out.println("Rating Film\t: " + tmp.data.rating);
                System.out.println("-------------------------------------");
                System.out.println("Film tersebut ditemukan pada node ke-" + (i+1));
                return;
            }
            tmp = tmp.next;
        }
        System.out.println("Film dengan ID " + idKey + " tidak ditemukan");
    }
    
    public void sort (){
        if (isEmpty()) {
            System.out.println("Linked Lists Kosong");
        } else {
            Node current = head;
            while (current != null) {
                Node idx = current.next;
                while (idx != null) {
                    if (current.data.rating < idx.data.rating) {
                        Film temp = current.data;
                        current.data = idx.data;
                        idx.data = temp;
                    }
                    idx = idx.next;
                }
                current = current.next;
            }
        }
    }
}


