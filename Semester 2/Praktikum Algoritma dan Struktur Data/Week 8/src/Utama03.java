import java.util.Scanner;
public class Utama03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitas = sc.nextInt();
        Gudang03 gudang = new Gudang03(kapasitas);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat Barang Teratas");
            System.out.println("5. Lihat Barang Terbawah");
            System.out.println("6. Cari Barang");
            System.out.println("7. Keluar\n");

            System.out.print("Pilih operasi: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang\t: ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan nama barang\t: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan nama kategori\t: ");
                    String kategori = sc.nextLine();
                
                    Barang03 barangBaru = new Barang03(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                    
                case 2:
                    gudang.ambilBarang();
                    break;
            
                case 3:
                    gudang.tampilkanBarang();
                    break;
            
                case 4:
                    gudang.lihatBarangTeratas();
                    break;

                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                    
                case 6:
                    System.out.print("\nMasukkan kode barang yang dicari: ");
                    int kodeCari = sc.nextInt();
                    Barang03 barangDicari = gudang.cariBarang(kodeCari);
                    if (barangDicari != null) {
                        System.out.println("Barang ada di dalam gudang.");
                        System.out.println("Kode barang : " + barangDicari.kode);
                        System.out.println("Nama barang : " + barangDicari.nama);
                        System.out.println("Kategori    : " + barangDicari.kategori);
                    } else {
                        System.out.println("Barang tidak ada di dalam gudang.");
                    }
                    break;

                case 7:
                    return;
            
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
                    break;
            }
        }
    }
}
