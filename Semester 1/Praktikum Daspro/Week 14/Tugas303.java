import java.util.Scanner;
public class Tugas303 {

    static boolean cekPrimaRekursif (int bil, int pembagi) {
        if (pembagi == 1) {
            return true;
        } else if (pembagi == 0) {
            return false;
        } else {
            boolean isTrue;
            if (bil % pembagi == 0) {
                isTrue = false;
            } else {
                isTrue = true;
            }
            return (isTrue && cekPrimaRekursif(bil, pembagi-1));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int angka;
        boolean isPrima;

        System.out.print("Masukkan bilangan : ");
        angka = sc.nextInt();

        isPrima = cekPrimaRekursif(angka, angka-1);
        System.out.println(isPrima ? "Bilangan Prima" : "Bukan Bilangan Prima");
    }

}
