import java.util.Scanner;
public class BioskopWithScanner03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int menu, baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        
        while (true) {
            
            System.out.println("---  Menu  ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit\n");

            System.out.print("Pilih menu : ");
            menu = sc.nextInt();

            if (menu==1) {
                while (true) {
                    System.out.print("\nMasukkan nama  : ");
                    sc.nextLine();
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris : ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom : ");
                    kolom = sc.nextInt();
                    
                    if (baris > penonton.length || kolom > penonton[baris-1].length) {
                        System.out.println("Kursi tidak tersedia!");
                        continue;
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                        
                        System.out.print("Input penonton lainnya? (y/n) : ");
                        next = sc.next();
                        
                        if (next.equalsIgnoreCase("n")) {
                            System.out.println("");
                            break;
                        } 
                    }
                }
            }

            if (menu==2) {
                System.out.println("");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("Baris ke-"+(i+1));
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.println("Kolom ke-"+(j+1)+" : "+penonton[i][j] );
                    }
                    System.out.println("");
                }
            }

            if (menu==3) {
                break;
            }
            
        }

    }
}
