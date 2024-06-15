public class LayananBengkel03 {
    NodeLayanan03 head03;
    int size03;
    int totalPemasukan03;

    public LayananBengkel03(){
        head03 = null;
        size03 = 0;
        totalPemasukan03 = 0;
    }

    public boolean isEmpty(){
        return head03 == null;
    }

    public void tambah (Layanan03 baru03){
        if (isEmpty()) {
            head03 = new NodeLayanan03(null, baru03, null);
        } else {
            NodeLayanan03 temp = head03;
            while (temp.next03 != null) {
                temp = temp.next03;
            }
            NodeLayanan03 newNode = new NodeLayanan03 (temp, baru03, null);
            temp.next03 = newNode;
        }
        size03++;
    }
    
    public void cetak(){
        if (!isEmpty()) {
            sort();
            System.out.println("-------------------------------------");
            System.out.printf("| Kode | %-15s | %-8s |\n", "Nama Layanan", "Harga");
            System.out.println("-------------------------------------");
            NodeLayanan03 temp = head03;
            int totalPemasukan03 = 0;
            while (temp != null) {
                System.out.printf("| %-4d | %-15s | %-8s |\n", temp.service03.kodeLayanan03, temp.service03.namaLayanan03, temp.service03.harga03);
                temp = temp.next03;
            }
            System.out.println("-------------------------------------");
        } else {
            System.out.println("Belum Ada Layanan.");
        }
    }

    public void sort (){
        if (isEmpty()) {
            System.out.println("Linked Lists Kosong");
        } else {
            NodeLayanan03 temp03 = head03;
            while (temp03 != null) {
                NodeLayanan03 idx03 = temp03.next03;
                while (idx03 != null) {
                    if (temp03.service03.harga03 < idx03.service03.harga03) {
                        Layanan03 temp = temp03.service03;
                        temp03.service03 = idx03.service03;
                        idx03.service03 = temp;
                    }
                    idx03 = idx03.next03;
                }
                temp03 = temp03.next03;
            }
        }
    }

    public void tambahPemasukan(Layanan03 baru03){
        totalPemasukan03 += baru03.harga03;
    }
}
