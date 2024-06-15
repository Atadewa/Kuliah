package Tugas1;
import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        Queue queue = new Queue();
        
        int pilihan;
        do {
            System.out.println("\n===============================");
            System.out.println("    PENGANTRI VAKSIN BOOSTER");
            System.out.println("===============================");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("===============================\n");

            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();

            System.out.println();
            switch (pilihan) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor Antrian\t: ");
                    int noAntri = sc.nextInt();
                    System.out.print("Nama Penerima\t: ");
                    String nama = sc.next();

                    Pasien baru = new Pasien(nama, noAntri);
                    queue.enqueue(baru);
                    break;
            
                case 2:
                    Pasien delete = queue.dequeue();
                    if (delete.nama != null) {
                        System.out.println(delete.nama + " telah selesai divaksinasi.");
                    }
                    break;
            
                case 3:
                    queue.print();
                    break;
            
                case 4:
                    System.out.println("Terimakasih!");
                    break;
            
                default:
                    System.out.println("Pilihan Tidak Valid!");
                    break;
            }
        } while (pilihan != 4);
    }
}
