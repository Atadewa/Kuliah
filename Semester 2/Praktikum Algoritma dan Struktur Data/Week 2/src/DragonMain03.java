import java.util.Scanner;
public class DragonMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Petunjuk Permainan");
        System.out.println("===================");
        System.out.println("W : atas");
        System.out.println("A : kiri");
        System.out.println("S : bawah");
        System.out.println("D : kanan\n");
        
        System.out.print("Masukkan panjang area : ");
        int height = sc.nextInt();
        System.out.print("Masukkan lebar area   : ");
        int width = sc.nextInt();

        Dragon03 dragon1 = new Dragon03(1, 1, width, height);

        while (true) {
            
            dragon1.printPosition();
            
            System.out.print("\nMasukkan pilihan (W/A/S/D) : ");
            char pilihan = sc.next().charAt(0);

            switch (pilihan) {
                case 'W':
                    dragon1.moveUp();
                    break;

                case 'A':
                    dragon1.moveLeft();
                    break;

                case 'S':
                    dragon1.moveDown();
                    break;

                case 'D':
                    dragon1.moveRight();
                    break;
            
                default:
                    System.out.println("Pilihan Invalid!");
                    break;
            }
        }   
    }
}
    