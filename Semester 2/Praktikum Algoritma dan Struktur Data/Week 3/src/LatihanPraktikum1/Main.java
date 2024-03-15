package LatihanPraktikum1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, jml;
        
        System.out.println("================================ ");
        System.out.println("              MENU               ");
        System.out.println("================================ ");
        System.out.println("1. Kerucut                       ");
        System.out.println("2. Limas Segi Empat Sama Sisi    ");
        System.out.println("3. Bola                          ");
        System.out.println("================================ ");

        System.out.print("\nPilih Menu : ");
        menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.print("\nMasukkan jumlah Kerucut : ");
                jml = sc.nextInt();
                Kerucut arrayKerucut[] = new Kerucut[jml];
                for (int i = 0; i < arrayKerucut.length; i++) {
                    arrayKerucut[i] = new Kerucut();
                    System.out.println("\nKerucut ke-" + (i+1));
                    System.out.print("Masukkan panjang jari-jari   : ");
                    arrayKerucut[i].jariJari = sc.nextDouble();
                    System.out.print("Masukkan panjang sisi miring : ");
                    arrayKerucut[i].sisiMiring = sc.nextDouble();
                    
                    System.out.printf("\nLuas Permukaan\t: %.1f\n", arrayKerucut[i].hitungLp());
                    System.out.printf("Volume\t\t: %.1f\n", arrayKerucut[i].hitungVolume());
                }
                break;
                
                case 2:
                System.out.print("\nMasukkan jumlah Limas : ");
                jml = sc.nextInt();
                Limas arrayLimas[] = new Limas[jml];
                for (int i = 0; i < arrayLimas.length; i++) {
                    arrayLimas[i] = new Limas();
                    System.out.println("\nLimas ke-" + (i+1));
                    System.out.print("Masukkan panjang sisi alas    : ");
                    arrayLimas[i].sisiAlas = sc.nextDouble();
                    System.out.print("Masukkan panjang tinggi limas : ");
                    arrayLimas[i].tinggiLimas = sc.nextDouble();
                    
                    System.out.printf("\nLuas Permukaan\t: %.1f\n", arrayLimas[i].hitungLp());
                    System.out.printf("Volume\t\t: %.1f\n", arrayLimas[i].hitungVolume());
                }
                break;
                
                case 3:
                System.out.print("\nMasukkan jumlah Bola : ");
                jml = sc.nextInt();
                Bola arrayBola[] = new Bola[jml];
                for (int i = 0; i < arrayBola.length; i++) {
                    arrayBola[i] = new Bola();
                    System.out.println("\nBola ke-" + (i+1));
                    System.out.print("Masukkan panjang jari-jari : ");
                    arrayBola[i].jariJari = sc.nextDouble();

                    System.out.printf("\nLuas Permukaan\t: %.1f\n", arrayBola[i].hitungLp());
                    System.out.printf("Volume\t\t: %.1f\n", arrayBola[i].hitungVolume());
                }
                break;

            default:
                System.out.println("Pilihan Tidak Valid!");
                break;
        }
        
    }
}
