package Tugas;

public class Queue {
    Pembeli[] antrian;
    int front;
    int rear;
    int size;
    int max;
    
    public Queue(int n){
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public boolean isFull(){
        return size == max;
    }
    
    public void Enqueue (Pembeli antri) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        }
    }
    
    public Pembeli Dequeue(){
        Pembeli dt = new Pembeli();
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
    
    public void print(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }
    
    public void peek(){
        if (!isEmpty()) {
            System.out.println("Pembeli terdepan: " + antrian[front].nama + " " + antrian[front].noHP);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    
    public void peekRear(){
        if (!isEmpty()) {
            System.out.println("Pembeli terbelakang: " + antrian[rear].nama + " " + antrian[rear].noHP);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    
    public void peekPosition(String nama){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            int counter = 1;
            boolean isTrue = false;
            while (i != rear) {
                if (antrian[i].nama.equals(nama)) {
                    System.out.println("Pembeli ditemukan pada antrian ke-" + counter);
                    System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                    isTrue = true;
                    break;
                }
                counter++;
                i = (i + 1) % max;
            }
            if (!isTrue && antrian[i].nama.equals(nama)) {
                System.out.println("Pembeli ditemukan pada antrian ke-" + counter);
            } else if (!isTrue) {
                System.out.println("Pembeli tidak ditemukan");
            }
        }
    }
    
    public void daftarPembeli(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }
}