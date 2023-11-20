import java.util.Scanner;
public class Tugas1 {
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
                        if (j <= N-i) {
                            System.out.print(" ");
                        } else {
                            System.out.print(j-(N-i));
                        }
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}
