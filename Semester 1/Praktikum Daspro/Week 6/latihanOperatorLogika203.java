import java.util.Scanner;
public class latihanOperatorLogika203 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner (System.in);
        String jenisBuku;
        int jmlBuku, diskon;

        System.out.print("Masukkan jenis buku  : ");
        jenisBuku = input03.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jmlBuku = input03.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus") && jmlBuku > 2) {
            diskon = 12;
        } else if (jenisBuku.equalsIgnoreCase("kamus") && jmlBuku <= 2) {
            diskon = 10;
        } else if (jenisBuku.equalsIgnoreCase("novel") && jmlBuku > 3) {
            diskon = 9;
        } else if (jenisBuku.equalsIgnoreCase("novel") && jmlBuku <= 3) {
            diskon = 8;
        } else if (jmlBuku > 3) {
            diskon = 5;
        } else {
            diskon = 0;
        } 
        
        System.out.println("Anda mendapatkan diskon "+diskon+"%");
        
    }
}
