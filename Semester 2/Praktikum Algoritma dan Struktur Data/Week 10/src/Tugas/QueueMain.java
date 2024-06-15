package Tugas;
import java.util.Scanner;

public class QueueMain {
    
    public static void menu(){
        System.out.println("\nPilih menu: ");
        System.out.println("1. Pembeli baru");
        System.out.println("2. Pembeli keluar");
        System.out.println("3. Cek Pembeli terdepan");
        System.out.println("4. Cek Pembeli terbelakang");
        System.out.println("5. Cek Semua Pembeli");
        System.out.println("6. Cari Pembeli");
        System.out.println("----------------------------");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue antrian = new Queue(jumlah);
        int pilih;
        
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------------------");
            
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("No HP: ");
                    int noHP = sc.nextInt();
                    Pembeli baru = new Pembeli(nama, noHP);
                    sc.nextLine();
                    antrian.Enqueue(baru);
                    break;
            
                case 2:
                    Pembeli data = antrian.Dequeue();
                    if (data.nama != null){
                        System.out.println("Pembeli keluar antrian : " + data.nama + " " + data.noHP);
                    }
                    break;
            
                case 3:
                    antrian.peek();
                    break;
            
                case 4:
                    antrian.peekRear();
                    break;

                case 5:
                    antrian.daftarPembeli();
                    break;

                case 6:
                    System.out.print("Masukkan nama yang dicari: ");
                    String namaDicari = sc.nextLine();
                    antrian.peekPosition(namaDicari);
                    break;
            }
        } while (pilih > 0 && pilih < 7);
    }
}
