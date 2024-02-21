import java.util.Scanner;
public class Perulangan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long nim, n;

        System.out.print("Masukkan NIM : ");
        nim = sc.nextLong();
         
        n = nim % 100;
        if (n < 10) {
            n += 10;
        }

        System.out.println("=========================");
        System.out.println("n : " + n);
        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                if (i%2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }
            }
        }
    }
}
