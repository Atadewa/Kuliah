import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        while (true) {
            System.out.print("Masukkan angka : ");
            int N = sc.nextInt();
            
            if (N < 3) {
                System.out.println("Input Invalid!");
            } else {
                for (int i = 1; i <= N; i++) {
                    for (int j = 1; j <= N; j++) {
                        if (j == 1 || j == N || i == 1 || i == N) {
                            System.out.print(N + " ");
                        } else if (N > 9) {
                            System.out.print("   ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}
