package TestSearching;

public class PencarianBuku03 {
    Buku03 listBk[] = new Buku03[5];
    int idx;

    void tambah(Buku03 m){
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku03 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch (int cari){
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public Buku03 FindBuku (int x) {
        int posisi = FindSeqSearch(x);
        if (posisi != -1) {
            return listBk[posisi];
        } else {
            return new Buku03(0, null, 0, null, 0);
        }
    }

    public void TampilPosisi (int x, int pos){
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }
    
    public void TampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("Kode buku\t: " + x);
            System.out.println("Judul buku\t: " + listBk[pos].judulBuku);
            System.out.println("Tahun terbit\t: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t: " + listBk[pos].pengarang);
            System.out.println("Stock\t\t: " + listBk[pos].stock);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    public int FindBinarySearch (int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left+right) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return mid;
            } else if (listBk[mid].kodeBuku < cari) {
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
}
