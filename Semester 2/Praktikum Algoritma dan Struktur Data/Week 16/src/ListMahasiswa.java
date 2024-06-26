import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus (int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }

    public void tampil(){
        mahasiswas.stream().forEach (mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch (String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch(String nim) {
        sortAsc();
        return Collections.binarySearch(mahasiswas, new Mahasiswa(nim, "", ""), Comparator.comparing(m -> m.nim));
    }

    public void sortAsc() {
        mahasiswas.sort((m1, m2) -> m1.nim.compareTo(m2.nim));
    }
    
    public void sortDesc() {
        mahasiswas.sort((m1, m2) -> m2.nim.compareTo(m1.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");

        // Menambahkan objek Mahasiswa
        lm.tambah(m, m1, m2);

        // Menampilkan list mahasiswa
        lm.tampil();

        // Update Mahasiswa
        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        
        System.out.println();
        lm.tampil();
        
        System.out.println();
        lm.sortDesc();
        lm.tampil();
        
        System.out.println();
        lm.sortAsc();
        lm.tampil();
    }
}
