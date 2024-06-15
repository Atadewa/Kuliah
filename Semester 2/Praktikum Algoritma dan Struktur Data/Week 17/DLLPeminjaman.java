public class DLLPeminjaman {
    Node head;
    int size;

    public DLLPeminjaman(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }
                
    public void add (TransaksiRental tr){
        if (isEmpty()) {
            head = new Node(null, tr, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node (current, tr, null);
            current.next = newNode;
            size++;
        }
    }

    public void print(){
        if (!isEmpty()) {
            int pendapatan = 0;
            Node temp = head;
            System.out.println("====================================================================================");
            System.out.printf("| Kode | Nomor TNKB  | %-15s | Nama Peminjam | Lama Pinjam | Total Biaya |\n", "Nama Barang");
            System.out.println("====================================================================================");
            while (temp != null) {
                System.out.printf("|  %-3d | %-11s | %-15s | %-13s | %-11d | %-11.0f |\n", temp.data.kodeTransaksi, temp.data.br.noTNKB, temp.data.br.namaKendaraan, temp.data.namaPeminjam, temp.data.lamaPinjam, temp.data.totalBiaya);
                pendapatan+=temp.data.totalBiaya;
                temp = temp.next;
                }
            System.out.println("====================================================================================");
            System.out.println("Total Pendapatan : " + pendapatan);
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public boolean findNopol(String nopol){
        Node temp = head;
        while (temp != null) {
            if (nopol.equals(temp.data.br.noTNKB)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

