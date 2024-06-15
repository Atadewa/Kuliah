package Tugas2;

public class Queue03 {
    Node03 head, tail;

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if (!isEmpty()) {
            Node03 temp = head;
            System.out.print("Isi Antrian:\t");
            while (temp != null) {
                System.out.print(temp.data.nama + " " + temp.data.NIM + "     ");
                temp = temp.next;                
            }
            System.out.println();
        } else {
            System.out.println("Antrian Kosong");
        }
    }

    void enqueue(Mahasiswa03 input){
        Node03 ndInput = new Node03(input, null);
        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }
    
    Mahasiswa03 dequeue(){
        Node03 temp = head;
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong");
            return null;
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        return temp.data;
    }

    void peek(){
        if (!isEmpty()) {
            System.out.println("Nama\t: " + head.data.nama);
            System.out.println("NIM\t: " + head.data.NIM);            
        } else {
            System.out.println("Antrian Kosong");
        }
    }
    
    void clear(){
        if (!isEmpty()) {
            head = tail = null;
        } else {
            System.out.println("Antrian Masih Kosong");
        }
    }
}
