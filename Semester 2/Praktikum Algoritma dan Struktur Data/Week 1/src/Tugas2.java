import java.util.Scanner;
public class Tugas2 {

    static Scanner sc = new Scanner (System.in);
    
    static int pilihMenu () {
        System.out.println("============================");
        System.out.println("            MENU    ");
        System.out.println("============================");
        System.out.println("1. Perhitungan Kecepatan");
        System.out.println("2. Perhitungan Jarak");
        System.out.println("3. Perhitungan Waktu");
        System.out.println("============================");
        System.out.print("\nPilih Menu : ");
        int menu = sc.nextInt();
        
        return menu;
    }
    
    static void hitungKecepatan () {
        System.out.println("\n============================");
        System.out.print("Masukkan nilai jarak (km)  : ");
        float jarak = sc.nextFloat();
        System.out.print("Masukkan nilai waktu (jam) : ");
        float waktu = sc.nextFloat();
        System.out.println("============================");
        
        float kecepatan = jarak/waktu;
        System.out.println("Kecepatan : " + kecepatan + " km/jam");
    }

    static void hitungJarak () {
        System.out.println("\n============================");
        System.out.print("Masukkan nilai kecepatan (km/jam) : ");
        float kecepatan = sc.nextFloat();
        System.out.print("Masukkan nilai waktu (jam)\t  : ");
        float waktu = sc.nextFloat();
        System.out.println("============================");
        
        float jarak = kecepatan*waktu;
        System.out.println("Jarak : " + jarak + " km");
    }
    
    static void hitungWaktu () {
        System.out.println("\n============================");
        System.out.print("Masukkan nilai jarak (km)\t  : ");
        float jarak = sc.nextFloat();
        System.out.print("Masukkan nilai kecepatan (km/jam) : ");
        float kecepatan = sc.nextFloat();
        System.out.println("============================");
        
        float waktu = jarak/kecepatan;
        System.out.println("Waktu : " + waktu + " jam");
    }
    public static void main(String[] args) {

        int menu = pilihMenu();
        
        switch (menu) {
            case 1:
                    hitungKecepatan();
                break;
            case 2:
                    hitungJarak();
                break;
            case 3:
                    hitungWaktu();
                break;
            default:
                System.out.println("Pilihan Menu Tidak Valid");
                break;
        }
    }
}
