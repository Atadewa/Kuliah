public class BukuMain03 {
    public static void main(String[] args) {
        Buku03 bk1 = new Buku03();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku03 bk2 = new Buku03("Self Reward", "Maheera Ayehsa", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku03 bukuAditya = new Buku03 ("Laskar Pelangi", "Andrea Hirata", 529, 32, 85000);
        bukuAditya.tampilInformasi();
    }
}
