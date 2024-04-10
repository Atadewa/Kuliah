package latihanPraktikum;
import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        Hotel hotel1 = new Hotel ("Malang Hotels", "Malang", 750000, (byte) 3);
        Hotel hotel2 = new Hotel("Pacifista", "Bali", 1200000, (byte) 5);
        Hotel hotel3 = new Hotel("Skyline Hotel", "Surabaya", 350000, (byte) 2);
        Hotel hotel4 = new Hotel ("Starlight", "Jakarta", 1350000, (byte) 5);
        Hotel hotel5 = new Hotel("Adi Hotel", "Lombok", 380000, (byte) 1);
        Hotel hotel6 = new Hotel("Valley", "Bandung", 700000, (byte) 4);
        Hotel hotel7 = new Hotel("Superman", "Yogyakarta", 550000, (byte) 3);
        
        HotelService listHotel = new HotelService();
        listHotel.tambah(hotel1);
        listHotel.tambah(hotel2);
        listHotel.tambah(hotel3);
        listHotel.tambah(hotel4);
        listHotel.tambah(hotel5);
        listHotel.tambah(hotel6);
        listHotel.tambah(hotel7);
        
        listHotel.tampilAll();
        
        do {
            System.out.println("-------------------------------------------------------------");
            System.out.println("                            MENU                            ");
            System.out.println("-------------------------------------------------------------");
            System.out.println("1. Melihat hotel dari harga termurah ke harga termahal");
            System.out.println("2. Melihat rating bintang hotel dari tertinggi ke terendah");
            System.out.println("3. Keluar program");
            System.out.println("-------------------------------------------------------------");

            System.out.print("\nMasukkan pilihan menu : ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    listHotel.bubbleSort();
                    listHotel.tampilAll();
                    break;

                case 2:
                    listHotel.selectionSort();
                    listHotel.tampilAll();
                    break;

                case 3:
                    System.out.println("Terimakasih");
                    break;
            
                default:
                    System.out.println("Pilihan Invalid!\n");
                    break;
            }
        } while (pilihan != 3);
    }
}
