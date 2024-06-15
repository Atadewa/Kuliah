public class DLLBarang {
    NodeBarang head;
    int size;

    public DLLBarang(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }
                
    public void add (BarangRental br){
        if (isEmpty()) {
            head = new NodeBarang(null, br, null);
        } else {
            NodeBarang current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeBarang newNode = new NodeBarang (current, br, null);
            current.next = newNode;
            size++;
        }
    }

    public void print(){
        if (!isEmpty()) {
            NodeBarang temp = head;
            System.out.println("=== Daftar Kendaraan Rental ===");
            System.out.println("==========================================================================");
            System.out.printf("| Nomor TNKB  | %-20s | Jenis | Tahun | Biaya Sewa Perjam |\n", "Nama Kendaraan");
            System.out.println("==========================================================================");
            while (temp != null) {
                System.out.printf("| %-11s | %-20s | %s | %d  | %-17d |\n", temp.data.noTNKB, temp.data.namaKendaraan, temp.data.jenisKendaraan, temp.data.tahun, temp.data.biayaSewa);
                temp = temp.next;
                }
            System.out.println("==========================================================================");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public BarangRental findBarang(String nopol){
        NodeBarang temp = head;
        while (temp != null) {
            if (nopol.equals(temp.data.noTNKB)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }
}

