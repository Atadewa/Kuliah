import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("========================================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();
        
        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("\nMasukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat: ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }
        
        System.out.println("\n=====================");
        System.out.println("    MENU ALGORITMA ");
        System.out.println("=====================");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide Conquer");
        System.out.println("=====================");
        
        System.out.print("\nMasukkan pilihan algoritma: ");
        int pilihan = sc.nextInt();
        
        System.out.println("\n========================================");
        switch (pilihan) {
            case 1:
            System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
        
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;

            default:
                System.out.println("Pilihan Tidak Valid!");
                break;
        }
    }
}
