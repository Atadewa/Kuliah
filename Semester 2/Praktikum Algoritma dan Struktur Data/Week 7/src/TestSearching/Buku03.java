package TestSearching;

public class Buku03 {
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;
    
    public Buku03 (String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku(){
        System.out.println("==========================");
        System.out.println("Kode buku\t: " + kodeBuku);
        System.out.println("Judul buku\t: " + judulBuku);
        System.out.println("Tahun terbit\t: " + tahunTerbit);
        System.out.println("Pengarang\t: " + pengarang);
        System.out.println("Stock\t\t: " + stock);
    }
}