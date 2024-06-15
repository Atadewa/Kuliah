import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        DLLPeminjaman listPeminjaman = new DLLPeminjaman();
        DLLBarang listBarang = new DLLBarang();
        int kode = 1;

        BarangRental br1 = new BarangRental("AG 2020 AOA", "Honda CB150R", "Motor", 2016, 25000);
        BarangRental br2 = new BarangRental("AG 1834 OHJ", "Honda Beat", "Motor", 2018, 25000);
        BarangRental br3 = new BarangRental("N 6721 RUI", "Honda Scoopy", "Motor", 2019, 25000);
        BarangRental br4 = new BarangRental("N 1744 JIJ", "Toyota Inova", "Mobil", 2020, 40000);
        BarangRental br5 = new BarangRental("N 8439 A", "Mitsubishi Pajero", "Mobil", 2024, 40000);

        listBarang.add(br1);
        listBarang.add(br2);
        listBarang.add(br3);
        listBarang.add(br4);
        listBarang.add(br5);

        int pilihan = 0;
        do {
            System.out.println("\n=====================================");
            System.out.println("       MENU RENTAL KENDARAAN");
            System.out.println("=====================================");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi urut no TKB");
            System.out.println("5. Keluar Program");
            System.out.println("=====================================\n");

            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();

            System.out.println();
            switch (pilihan) {
                case 1:
                    listBarang.print();
                    break;

                case 2:
                    System.out.println("-------------------------");
                    System.out.println("Masukkan Data Peminjaman");
                    System.out.println("-------------------------");
                    System.out.print("Masukkan Nama Peminjam\t: ");
                    String peminjam = sc.next();
                    System.out.print("Masukkan Nomor TNKB\t: ");
                    String nopol = sc1.nextLine();
                    System.out.print("Masukkan Lama Pinjam\t: ");
                    int lamaPinjam = sc.nextInt();
                    System.out.print("Apakah Member (ya/tidak) : ");
                    String member = sc.next();
                    
                    System.out.println();
                    BarangRental barang = listBarang.findBarang(nopol);
                    
                    double diskon = 0;
                    int potongan = 0;
                    if (member.equalsIgnoreCase("ya")) {
                        potongan = 25000;
                    }
                    
                    if (lamaPinjam > 78) {
                        diskon = 20;
                    } else if (lamaPinjam > 48) {
                        diskon = 10;
                    }

                    double biaya = barang.biayaSewa*lamaPinjam;
                    biaya = (100-diskon)/100*biaya;
                    biaya-=potongan;
                    
                    if (listPeminjaman.findNopol(nopol)) {
                        System.out.println("Tidak bisa diproses, kendaraan sudah dipinjam orang lain.");
                    } else {
                            System.out.println("Peminjaman Berhasil Diproses");
                            System.out.println("Kode Peminjaman\t: " + kode);
                            System.out.println("Nomor TNKB\t: " + barang.noTNKB);
                            System.out.println("Nama Barang\t: " + barang.namaKendaraan);
                            System.out.println("Nama Peminjam\t: " + peminjam);
                            System.out.println("Lama Pinjam\t: " + lamaPinjam + " jam");
                            System.out.println("Total Biaya\t: " + biaya);
                            TransaksiRental PeminjamanBaru = new TransaksiRental(kode, peminjam, lamaPinjam, biaya, barang);
                            listPeminjaman.add(PeminjamanBaru);
                            kode++;
                    }
                    break;
                            
                 case 3:
                    listPeminjaman.print();
                    break;
                            
                case 4:
                    
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
