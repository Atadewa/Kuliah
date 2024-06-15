package Tugas1;

public class SLL03 {
    Node03 head, tail;

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if (!isEmpty()) {
            Node03 temp = head;
            System.out.print("Isi Linked List:\t");
            while (temp != null) {
                System.out.print(temp.data.nama + " " + temp.data.NIM + "\t");
                temp = temp.next;                
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(Mahasiswa03 input){
        Node03 ndInput = new Node03(input, null);
        if (!isEmpty()) {
            ndInput.next = head;
            head = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void addLast(Mahasiswa03 input){
        Node03 ndInput = new Node03(input, null);
        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(Mahasiswa03 key, Mahasiswa03 input){
        Node03 ndInput = new Node03(input, null);
        Node03 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, Mahasiswa03 input) {
        if (index < 0) {
            System.out.println("Indeks tidak valid!");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node03 temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = new Node03(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
