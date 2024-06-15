package Tugas2;
import java.util.Scanner;

public class DoubleLinkedListsMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        DoubleLinkedLists dllFilm = new DoubleLinkedLists();
        
        int pilihan;
        do {
            System.out.println("\n===================================");
            System.out.println("        DATA FILM LAYAR LEBAR");
            System.out.println("===================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Pada Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film - desc");
            System.out.println("10. Keluar");
            System.out.println("===================================\n");

            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();

            int id, index;
            String judul;
            double rating;
            Film baru, delete;
            System.out.println();
            switch (pilihan) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.println("-----------------------------");
                    System.out.print("ID Film\t\t: ");
                    id = sc.nextInt();
                    System.out.print("Judul Film\t: ");
                    judul = sc2.nextLine();
                    System.out.print("Rating Film\t: ");
                    rating = sc.nextDouble();

                    baru = new Film(id, judul, rating);
                    dllFilm.addFirst(baru);
                    break;
                    
                case 2:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.println("-----------------------------");
                    System.out.print("ID Film\t\t: ");
                    id = sc.nextInt();
                    System.out.print("Judul Film\t: ");
                    judul = sc2.nextLine();
                    System.out.print("Rating Film\t: ");
                    rating = sc.nextDouble();

                    baru = new Film(id, judul, rating);
                    dllFilm.addLast(baru);
                    break;
                    
                case 3:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Film");
                    System.out.println("-----------------------------");
                    System.out.print("ID Film\t\t: ");
                    id = sc.nextInt();
                    System.out.print("Judul Film\t: ");
                    judul = sc2.nextLine();
                    System.out.print("Rating Film\t: ");
                    rating = sc.nextDouble();
                    System.out.print("Data Film ini masuk indeks ke: ");
                    index = sc.nextInt();
                    
                    baru = new Film(id, judul, rating);
                    dllFilm.add(baru, index);
                    break;
                    
                    case 4:
                    delete = dllFilm.removeFirst();
                    if (delete.judul != null) {
                        System.out.println("---------------------------------");
                        System.out.println("ID Film\t\t: " + delete.id);
                        System.out.println("Judul Film\t: " + delete.judul);
                        System.out.println("Rating Film\t: " + delete.rating);
                        System.out.println("---------------------------------");
                        System.out.println("Film tersebut berhasil dihapus");
                    }
                    break;
                    
                    case 5:
                    delete = dllFilm.removeLast();
                    if (delete.judul != null) {
                        System.out.println("---------------------------------");
                        System.out.println("ID Film\t\t: " + delete.id);
                        System.out.println("Judul Film\t: " + delete.judul);
                        System.out.println("Rating Film\t: " + delete.rating);
                        System.out.println("---------------------------------");
                        System.out.println("Film tersebut berhasil dihapus");
                    }
                    break;
                    
                    case 6:
                    System.out.print("Index film yang ingin dihapus: ");
                    index = sc.nextInt();

                    delete = dllFilm.remove(index);
                    if (delete.judul != null) {
                        System.out.println("---------------------------------");
                        System.out.println("ID Film\t\t: " + delete.id);
                        System.out.println("Judul Film\t: " + delete.judul);
                        System.out.println("Rating Film\t: " + delete.rating);
                        System.out.println("---------------------------------");
                        System.out.println("Film tersebut berhasil dihapus");
                    }
                    break;
                    
                    case 7:
                    dllFilm.print();
                    break;
            
                case 8:
                    System.out.print("Masukkan ID Film yang dicari: ");
                    id = sc.nextInt();
                    System.out.println("-------------------------------------");
                    dllFilm.findFilm(id);
                    break;
            
                case 9:
                    dllFilm.sort();
                    dllFilm.print();
                    break;
            
                case 10:
                    System.out.println("Terimakasih!");
                    break;
            
                default:
                    System.out.println("Pilihan Tidak Valid!");
                    break;
            }
        } while (pilihan != 10);
    }
}
