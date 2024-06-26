package TestSearching;
import java.util.Scanner;

public class BukuMain03 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Scanner s1 = new Scanner (System.in);

        PencarianBuku03 data = new PencarianBuku03();
        int jumBuku = 5;

        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan Data Buku secara Urut dari Kode Buku Terkecil");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("---------------------");
            System.out.print("Kode Buku\t : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku\t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun terbit\t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang\t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock\t\t : ");
            int stock = s.nextInt();
            
            Buku03 m = new Buku03(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        
        data.sort();
        System.out.println("-------------------------------------------------------");
        System.out.println("\nData keseluruhan Buku : ");
        data.tampil();
        
        // System.out.println("\n_____________________________________");
        // System.out.println("_____________________________________");
        // System.out.println("Pencarian Data :");
        // System.out.println("Masukkan Kode Buku yang dicari :");
        // System.out.print("Kode Buku : ");
        // String cari = s.next();
        
        // System.out.println("\nMenggunakan Sequential Search");
        // int posisi = data.FindSeqSearch(cari);
        // data.TampilPosisi(cari, posisi);
        // data.TampilData(cari, posisi);
        
        // // Buku03 dataBuku = data.FindBuku(cari);
        // // dataBuku.tampilDataBuku();
        
        // System.out.println("\n===============================");
        // System.out.println("Menggunakan Binary Search");
        // posisi = data.FindBinarySearch(cari, 0, jumBuku-1);
        // data.TampilPosisi(cari, posisi);
        // data.TampilData(cari, posisi);

        System.out.println("\n_____________________________________");
        System.out.println("_____________________________________");
        System.out.println("Pencarian Judul Buku");
        System.out.println("Masukkan Judul Buku yang dicari :");
        System.out.print("Judul Buku : ");
        String cariJudul = s1.nextLine();

        System.out.println("\nMenggunakan Sequential Search");
        int idx = data.cariJudulSequential(cariJudul);
        data.TampilPosisi(cariJudul, idx);
        data.TampilData(cariJudul, idx);
        
        System.out.println("\n===============================");
        System.out.println("Menggunakan Binary Search");
        idx = data.cariJudulBinary(cariJudul, 0, jumBuku-1);
        data.TampilPosisi(cariJudul, idx);
        data.TampilData(cariJudul, idx);
    }
}
