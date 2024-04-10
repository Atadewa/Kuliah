package latihanPraktikum;

public class HotelService {
    Hotel rooms[] = new Hotel[7];
    int jml;

    void tambah(Hotel H){
        if (jml < rooms.length) {
            rooms[jml] = H;
            jml++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampilAll(){
        System.out.println("\nDAFTAR HOTEL");
        System.out.println("=============================================================");
        System.out.printf("| No | %-15s | %-10s | Harga/Malam | Bintang |\n", "Nama Hotel", "Kota");
        System.out.println("=============================================================");
        for (int i = 0; i < rooms.length; i++) {
            System.out.printf("| %-2d | %-15s | %-10s | Rp %-8d | %-7d |\n", (i+1), rooms[i].nama, rooms[i].kota, rooms[i].harga, rooms[i].bintang);
        }
        System.out.println("=============================================================");
    }

    void bubbleSort(){
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length-i; j++) {
                if (rooms[j].harga < rooms[j-1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < rooms.length-1; i++) {
            int indeksMaks = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[indeksMaks].bintang) {
                    indeksMaks = j;
                }
            }
            Hotel temp = rooms[indeksMaks];
            rooms[indeksMaks] = rooms[i];
            rooms[i] = temp;
        }
    }
}
