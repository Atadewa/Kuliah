import java.util.Scanner;
public class AntrianBengkelMain03 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        AntrianBengkel03 antrian03 = new AntrianBengkel03();
        LayananBengkel03 layanan03 = new LayananBengkel03();

        Layanan03 l1 = new Layanan03(1, "Ganti Oli", 100000);
        Layanan03 l2 = new Layanan03(2, "Tune Up Mesin", 500000);
        Layanan03 l3 = new Layanan03(3, "Ganti Rem", 300000);
        Layanan03 l4 = new Layanan03(4, "Service AC", 400000);

        layanan03.tambah(l1);
        layanan03.tambah(l2);
        layanan03.tambah(l3);
        layanan03.tambah(l4);

        int pilihan;
        do {
            System.out.println("\n=========================================");
            System.out.println("     ANTRIAN PELANGGAN BENGKEL MOBIL");
            System.out.println("=========================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian sekaligus Tambah Layanan");
            System.out.println("4. Laporan Layanan");
            System.out.println("5. Keluar Program");
            System.out.println("=========================================\n");

            System.out.print("Pilihan: ");
            pilihan = sc2.nextInt();

            System.out.println();
            switch (pilihan) {
                case 1:
                    System.out.println("-------------------------");
                    System.out.println("Masukkan Data Pelanggan");
                    System.out.println("-------------------------");
                    System.out.print("Nama Pelanggan\t: ");
                    String namaPelanggan03 = sc1.nextLine();
                    System.out.print("Nomor HP\t: ");
                    String noHP03 = sc2.next();

                    Pelanggan03 baru03 = new Pelanggan03(namaPelanggan03, noHP03);
                    antrian03.tambah(baru03);

                    System.out.println("Pelanggan atas nama " + namaPelanggan03 + " berhasil ditambahkan.");
                    break;
                    
                case 2:
                    antrian03.cetak();
                    break;
            
                case 3:
                    Pelanggan03 hapus03 = antrian03.kurangi();
                    if (hapus03.namaPelanggan03 != null) {
                        System.out.println(hapus03.namaPelanggan03 + " telah keluar dari Antrian.");

                        int kodeLayanan03;
                        Layanan03 layananBaru03;
                        do {
                            System.out.println("Layanan:");
                            layanan03.cetak();
                            System.out.println();
                            System.out.print("Masukkan kode layanan: ");
                            kodeLayanan03 = sc2.nextInt();
                            
                            switch (kodeLayanan03) {
                                case 1:
                                    layanan03.tambahPemasukan(l1);
                                    break;
                                    
                                case 2:
                                    layanan03.tambahPemasukan(l2);
                                    break;
                                    
                                case 3:
                                    layanan03.tambahPemasukan(l3);
                                    break;
                                    
                                    case 4:
                                    layanan03.tambahPemasukan(l4);
                                    break;
                                    
                                default:
                                    System.out.println("Pilihan Invalid!");
                                    break;
                            }
                        } while (kodeLayanan03 < 0 || kodeLayanan03 > 4);
                        
                    }
                    break;

                case 4:
                    System.out.println("Total Pemasukan: " + layanan03.totalPemasukan03);
                    break;

                case 5:
                    System.out.println("Terimakasih!");
                    break;
            
                default:
                    System.out.println("Pilihan Tidak Valid!");
                    break;
            }
        } while (pilihan != 5);
    }
}

