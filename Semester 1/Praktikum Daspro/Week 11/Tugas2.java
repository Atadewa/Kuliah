import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        while (true) {
            System.out.print("Masukkan angka : ");
            int N = sc.nextInt();
            
            if (N < 5) {
                System.out.println("Input Invalid!");
            } else {
                int spasi = 0;
                for (int i = 1; i <= N; i++) {
                    for (int j = i; j <= N; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}

