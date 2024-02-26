public class Buku03 {
    
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku03() {
        
    }

    public Buku03(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi () {
        System.out.println("\nJudul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Harga Total Buku: Rp " + hitungHargaBayar() );
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(){
        return this.harga*this.stok;
    }

    int hitungDiskon(){
        int diskon = 0;
        if (hitungHargaTotal() > 150000) {
            diskon = 12;
        } else if (hitungHargaTotal() > 75000) {
            diskon = 5;
        }    
        return diskon;
    }
    
    int hitungHargaBayar() {
        int hargaTot = hitungHargaTotal();
        int dis = hitungDiskon();
        hargaTot -= hargaTot*dis/100; 
        return hargaTot;
    }
}