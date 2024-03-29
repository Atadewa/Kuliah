import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan panjang array : ");
        int jml = sc.nextInt();
        
        PersegiPanjang[] ppArray = new PersegiPanjang[jml];
        
        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("\nPersegi panjang ke-" + (i+1));
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        System.out.println("\n=======================");

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("\nPersegi Panjang ke-" + (i+1));
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}