import java.util.Scanner;
public class HargaBayar03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merk;
        int harga, jumlah, jmlHalBuku;
        double dis, total, bayar,jmlDis;
        
        System.out.println("Masukkan merk buku yang dibeli");
        merk=input.nextLine();
        System.out.println("Masukkan jumlah halaman dari buku yang dibeli");
        jmlHalBuku=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli");
        jumlah=input.nextInt();
        System.out.println("Masukkan jumlah diskon");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Merk buku yang Anda beli adalah "+merk);
        System.out.println("Jumlah halaman buku yang Anda beli adalah "+jmlHalBuku);        
        System.out.println("Diskon yang Anda dapatkan adalah "+jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah "+bayar);

    }
}


