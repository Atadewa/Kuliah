public class DoubleLinkedLists03 {
    Node03 head;
    int size;

    public DoubleLinkedLists03(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst (int item, int jarak){
        if (isEmpty()) {
            head = new Node03(null, item, jarak, null);
        } else {
            Node03 newNode = new Node03(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void add (int item, int jarak, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node03 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node03 newNode = new Node03 (null, item, jarak, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node03 newNode = new Node03 (current.prev, item, jarak, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void print(){
        if (!isEmpty()) {
            Node03 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void remove (int index) {
        Node03 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                } 
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node03 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getJarak (int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node03 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void updateJarak(int idx, int jarak) {
        Node03 current = head;
        for (int i = 0; i < idx; i++) {
            current = current.next;
        }
        if (current != null) {
            current.jarak = jarak;
        }
    }    
    
}