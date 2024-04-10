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

    public int FindSeqSearch (String cari){
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(cari)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public Buku03 FindBuku (String x) {
        int posisi = FindSeqSearch(x);
        if (posisi != -1) {
            return listBk[posisi];
        } else {
            return new Buku03(null, null, 0, null, 0);
        }
    }

    public void TampilPosisi (String x, int pos){
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }
    
    public void TampilData(String x, int pos){
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

    public int FindBinarySearch (String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left+right) / 2;
            if (cari.equals(listBk[mid].kodeBuku)) {
                return mid;
            } else if (Integer.parseInt(listBk[mid].kodeBuku) > Integer.parseInt(cari)) {
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    
    public int cariJudulSequential(String cariJudul){
        int posisi = -1;
        int jml = 0;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].judulBuku.equals(cariJudul)) {
                posisi = i;
                jml++;
            }
        }

        if (jml > 1) {
            System.out.println("Judul Buku " + cariJudul + "ditemukan sebanyak" + jml + " kali");
        }

        return posisi;
    }

    public void sort(){
        for (int i = 0; i < listBk.length-1; i++) {
            for (int j = 1; j < listBk.length-i; j++) {
                if (listBk[j].judulBuku.compareToIgnoreCase(listBk[j-1].judulBuku) < 0) { 
                    Buku03 temp = listBk[j]; 
                    listBk[j] = listBk[j-1]; 
                    listBk[j-1] = temp; 
                }
            }
        }
    }

    public int cariJudulBinary(String cariJudul, int left, int right) {
        while (left <= right) { 
            int mid = (left + right) / 2; 
            int casting = cariJudul.compareToIgnoreCase(listBk[mid].judulBuku); 
            if (casting == 0) { 
                return mid; 
            } else if (casting > 0) { 
                left = mid + 1; 
            } else { 
                right = mid - 1; 
            } 
        } 
        return -1; 
    }
}
