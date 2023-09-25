import java.util.Scanner;
public class PemilihanPercobaan103 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input03.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka "+angka+" bilangan genap");
        } else {
            System.out.println("Angka "+angka+" bilangan ganjil");
        }



    } 
}