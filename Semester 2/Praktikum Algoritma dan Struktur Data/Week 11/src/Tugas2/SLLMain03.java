package Tugas2;
import java.util.Scanner;

public class SLLMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue03 Mahasiswa = new Queue03();

        int pilih;
        do {
            System.out.println("\n==============================");
            System.out.println("            MENU");
            System.out.println("==============================");
            System.out.println("1. Mahasiswa masuk");
            System.out.println("2. Mahasiswa keluar");
            System.out.println("3. Cek Mahasiswa terdepan");
            System.out.println("4. Tampilkan Semua Mahasiswa");
            System.out.println("5. Hapus Daftar Mahasiswa");
            System.out.println("6. Keluar");
            System.out.println("==============================\n");

            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println();
                    System.out.print("Masukkan Nama Mahasiswa : ");
                    String nama = sc.next();
                    System.out.print("Masukkan NIM Mahasiswa  : ");
                    int NIM = sc.nextInt();

                    Mahasiswa03 temp = new Mahasiswa03(nama, NIM);
                    Mahasiswa.enqueue(temp);
                    break;
            
                case 2:
                    Mahasiswa03 delete = Mahasiswa.dequeue();
                    if (delete != null) {
                        System.out.println("\nMahasiswa Keluar");
                        System.out.println("Nama\t: " + delete.nama);
                        System.out.println("NIM\t: " + delete.NIM);   
                    }
                    break;
            
                case 3:
                    Mahasiswa.peek();
                    break;
            
                case 4:
                    Mahasiswa.print();
                    break;
            
                case 5:
                    Mahasiswa.clear();
                    break;
            
                case 6:
                    System.out.println("Terimakasih");
                    break;
            
                default:
                    System.out.println("Input Invalid!");
                    break;
            }
            
        } while (pilih != 6);
    }    
}
