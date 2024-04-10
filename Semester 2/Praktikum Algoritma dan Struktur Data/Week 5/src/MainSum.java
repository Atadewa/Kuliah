import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("=============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");

        System.out.print("Masukkan banyak perusahaan : ");
        int jml = sc.nextInt();
        Sum perusahaan[] = new Sum[jml];

        for (int i = 0; i < perusahaan.length; i++) {
            System.out.print("\nMasukkan jumlah bulan perusahaan ke-" +(i+1)+ " : ");
            int elm = sc.nextInt();
            
            perusahaan[i] = new Sum (elm);
            System.out.println("=============================================================");
            for (int j = 0; j < perusahaan[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j+1) + " = ");
                perusahaan[i].keuntungan[j] = sc.nextDouble();
            } 
        }
        
        System.out.println("\nAlgoritma Brute Force");
        System.out.println("=============================================================");
        for (int i = 0; i < perusahaan.length; i++) {
            System.out.println("Total keuntungan perusahaan ke-" + (i+1) + " selama " + perusahaan[i].elemen + " bulan adalah = " + perusahaan[i].totalBF(perusahaan[i].keuntungan));
        }
        System.out.println("\nAlgoritma Divide Conquer");
        System.out.println("=============================================================");
        for (int i = 0; i < perusahaan.length; i++) {
            System.out.println("Total keuntungan perusahaan ke-" + (i+1) + " selama " + perusahaan[i].elemen + " bulan adalah = " + perusahaan[i].totalDC(perusahaan[i].keuntungan, 0, perusahaan[i].elemen-1));
        }
    }
}
