public class AntrianBengkel03 {
    NodePelanggan03 head03;
    int size03;

    public AntrianBengkel03(){
        head03 = null;
        size03 = 0;
    }

    public boolean isEmpty(){
        return head03 == null;
    }

    public void tambah (Pelanggan03 baru03){
        if (isEmpty()) {
            head03 = new NodePelanggan03(null, baru03, null);
        } else {
            NodePelanggan03 temp = head03;
            while (temp.next03 != null) {
                temp = temp.next03;
            }
            NodePelanggan03 newNode = new NodePelanggan03 (temp, baru03, null);
            temp.next03 = newNode;
        }
        size03++;
    }
    
    public Pelanggan03 kurangi () {
        Pelanggan03 hapus03 = new Pelanggan03(null, null);
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else if (size03 == 1){
            hapus03 = head03.data03;
            head03 = null;
        } else {
            hapus03 = head03.data03;
            head03 = head03.next03;
            head03.prev03 = null;
        }
        size03--;
        return hapus03;
    }
    
    public void cetak(){
        if (!isEmpty()) {
            System.out.println("---------------------------------------------");
            System.out.printf("| No. | %-20s | %-12s |\n", "Nama Pelanggan", "Nomor HP");
            System.out.println("---------------------------------------------");
            NodePelanggan03 temp = head03;
            int i = 1;
            while (temp != null) {
                System.out.printf("| %-3d | %-20s | %-12s |\n", i, temp.data03.namaPelanggan03, temp.data03.noHP03);
                temp = temp.next03;
                i++;
            }
            System.out.println("---------------------------------------------");
        } else {
            System.out.println("Antrian Kosong");
        }
    }
}
