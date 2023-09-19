import java.util.Scanner;
public class Gaji03 {
    public static void main (String []args) {
        Scanner input = new Scanner (System.in);
        int jmlMasuk, JmlTdkMasuk, TotGaji, gaji, potGaji;
        
        System.out.println("Masukkan Jumlah Gaji Anda Per Hari Masuk Kerja");
        gaji = input.nextInt();
        System.out.println("Masukkan Jumlah Potongan Gaji Anda Per Hari Tidak Masuk Kerja");
        potGaji = input.nextInt();        
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk=input.nextInt();

        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);

        System.out.println("Gaji yang Anda terima adalah "+TotGaji);
    }
}


