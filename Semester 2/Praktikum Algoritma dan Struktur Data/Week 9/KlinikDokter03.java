import java.util.Scanner;
public class KlinikDokter03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataPasien03 data03 = new DataPasien03();
        Pasien03 pasien1 = new Pasien03("Slamet", 78,"IX755");
        Pasien03 pasien2 = new Pasien03("Juwita", 33, "IX134");
        Pasien03 pasien3 = new Pasien03("Riris", 19,"IX322");
        Pasien03 pasien4 = new Pasien03("Roy Silva", 3,"IX777");
        Pasien03 pasien5 = new Pasien03("Nadia", 15,"IX177");

        data03.tambahPasien(pasien1);
        data03.tambahPasien(pasien2);
        data03.tambahPasien(pasien3);
        data03.tambahPasien(pasien4);
        data03.tambahPasien(pasien5);
        
        System.out.println("SELAMAT DATANG DI KLINIK DOKTER YUDI\n");
        System.out.println("Daftar Pasien: ");
        data03.tampilDataPasien();
        
        int pilihan;
        do {
            System.out.println("\n===========================================================");
            System.out.println("                         M E N U");
            System.out.println("===========================================================");
            System.out.println("1. Lihat Daftar Pasien dari Umur terendah hingga tertinggi");
            System.out.println("2. Cari pasien berdasarkan ID");
            System.out.println("3. Keluar");
            System.out.println("===========================================================");
            System.out.print("\nMasukkan pilihan: ");
            pilihan = sc.nextInt();
            System.out.println();
    
            switch (pilihan) {
                case 1:
                    data03.sortUmurPasien();
                    data03.tampilDataPasien();
                    break;
            
                case 2:
                    System.out.print("Masukkan ID Pasien yang dicari: ");
                    String idDicari = sc.next();
                    Pasien03 pasienDicari = data03.searchIdPasien(idDicari);
                    if (pasienDicari != null) {
                        System.out.println("Pasien Ditemukan!\n");
                        System.out.println("Nama Pasien\t: " + pasienDicari.nama03);
                        System.out.println("Umur Pasien\t: " + pasienDicari.umur03 + " tahun");
                        System.out.println("ID Pasien\t: " + pasienDicari.idPasien03);
                    } else {
                        System.out.println("Pasien Tidak Ditemukan!");
                    }
                    break;
            
                case 3:
                    System.out.println("Terimakasih!");
                    break;
            
                default:
                    System.out.println("Pilihan Invalid!");
                    break;
            }
            
        } while (pilihan != 3);

    }
}