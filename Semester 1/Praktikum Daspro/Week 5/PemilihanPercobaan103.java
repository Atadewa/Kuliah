import java.util.Scanner;
public class PemilihanPercobaan103 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input03.nextInt();

        String hasil = (angka % 2 == 00) ? " bilangan genap" : " bilangan ganjil";
        
        System.out.println("Angka "+angka+hasil);

    } 
}