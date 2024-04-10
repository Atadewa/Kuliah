import java.util.Scanner;
public class MainKamera {

    static void tampilTabel (Kamera cameras[]) {

        System.out.println("SISTEM PERSEWAAN KAMERA");
        System.out.println("=======================================================");
        System.out.printf("| No | %-8s | %-15s | Stok | Harga/hari |\n", "Merk", "Type");
        System.out.println("=======================================================");
        for (int i = 0; i < cameras.length; i++) {
            System.out.printf("| %-2d ", (i+1));
            cameras[i].tampilInformasi();
        }
        System.out.println("=======================================================");
    }

    static void sewaKamera (int jml, int harga[], Kamera cameras[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < harga.length; i++) {
            while (true) {
                System.out.print("\nMasukkan pilihan kamera ke-" + (i+1) + " (nomor): ");
                int pilihan = sc.nextInt()-1;
                if (cameras[pilihan].stok > 0) {
                    System.out.print("Masukkan lama hari menyewa: ");
                    int lamaHari = sc.nextInt();
                    harga[i] = cameras[pilihan].hitungHargaSewa(lamaHari);
                    cameras[pilihan].kurangiStok();

                    System.out.printf("Harga = %d * %d = %d\n", cameras[pilihan].hargaSewa, lamaHari, harga[i]);
                    break;
                } else {
                    System.out.println("Stok habis. Silahkan mengisi kembali\n");
                }
            }
        }
    }
    
    static void tampilTotalHarga(int harga[]) {
        int totalHarga = 0;
    
        System.out.println("\n================================");
        System.out.print("Total Harga = ");
        for (int i = 0; i < harga.length; i++) {
            totalHarga += harga[i];
            if (i != harga.length-1) {
                System.out.print(harga[i] + " + ");
            } else {
                System.out.print(harga[i] + " = ");
            }
        }
        System.out.print(totalHarga);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Kamera cameras[] = {
            new Kamera("Canon", "DSLR 1300D",3 , 100000),
            new Kamera("Canon", "DSLR 60D",4 , 125000),
            new Kamera("Sony", "Alpha A5000",2, 100000),
            new Kamera("Sony", "Alpha A6300",2, 150000),
            new Kamera("Fujifilm", "X-A3 Mirrorless",1, 110000)
        };

        //Menampilkan tabel dengan method tampilTabel()
        tampilTabel(cameras);

        System.out.print("\nMasukkan banyaknya menyewa kamera: ");
        int jml = sc.nextInt();
        int harga[] = new int[jml];

        //Proses sewa kamera dengan method sewaKamera()
        sewaKamera(jml, harga, cameras);

        //Tampil perhitungan total harga dengan method tampilTotalHarga();
        tampilTotalHarga(harga);
    }
}
