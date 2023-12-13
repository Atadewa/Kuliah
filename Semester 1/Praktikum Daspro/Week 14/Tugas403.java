import java.util.Scanner;
public class Tugas403 {

    static int fibonacciRekursif (int x) {
        if (x <= 2) {
            return 1;
        } else {
            return fibonacciRekursif (x-1) + fibonacciRekursif(x-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int bulan, jumlahMarmut;
      
        System.out.print("Masukkan jumlah bulan\t: ");
        bulan = sc.nextInt();
    
        jumlahMarmut = fibonacciRekursif(bulan);
        System.out.println("Jumlah pasangan marmut\t: " + jumlahMarmut);
    }
    
}