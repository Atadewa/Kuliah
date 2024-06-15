public class TransaksiRental {
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    BarangRental br;

    TransaksiRental(int kodeTransaksi, String namaPeminjam, int lamaPinjam, double totalBiaya, BarangRental br){
        this.kodeTransaksi = kodeTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.totalBiaya = totalBiaya;
        this.br = br;
    }
}
