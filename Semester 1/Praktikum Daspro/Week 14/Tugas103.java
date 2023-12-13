import java.util.Scanner;
public class Tugas103 {

    static void DeretDescendingRekursif (int bil) {
        if (bil == 0) {
            System.out.print(0);
        } else {
            System.out.print(bil);
            DeretDescendingRekursif(bil-1);
        }
    }

    static void DeretDescendingIteratif (int bil) {
        for (int i = bil; i >= 0; i--) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int angka;

        System.out.print("Masukkan angka : ");
        angka = sc.nextInt();

        DeretDescendingRekursif(angka);
        System.out.println();
        DeretDescendingIteratif(angka);
    }

}
