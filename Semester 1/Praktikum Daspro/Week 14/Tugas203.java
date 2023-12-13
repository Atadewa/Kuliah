import java.util.Scanner;
public class Tugas203 {

    static int penjumlahanRekursif (int x, int bil) {
        if (x == bil) {
            System.out.print(bil + " = ");
            return bil;
        } else {
            System.out.print(x + "+");
            return (x + penjumlahanRekursif(x + 1, bil));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int angka;

        System.out.print("Masukkan angka : ");
        angka = sc.nextInt();
        
        System.out.println(penjumlahanRekursif(1, angka));
    }

}
