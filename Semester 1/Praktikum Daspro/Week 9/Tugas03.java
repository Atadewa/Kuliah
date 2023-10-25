import java.util.Scanner;
public class Tugas03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah nilai : ");
        int jml = sc.nextInt();

        int nilai[] = new int [jml];
        int total = 0, nilaiMaks =0, nilaiMin = 100;
        double rata2;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-"+(i+1)+" : ");
            nilai[i] = sc.nextInt();
            total += nilai[i];

            if (nilai[i] > nilaiMaks) {
                nilaiMaks = nilai[i];
            }
            
            if (nilai[i] < nilaiMin) {
                nilaiMin = nilai[i];
            }
        }

        rata2 = total/jml;
        System.out.println("\nNilai tertinggi\t: "+nilaiMaks);
        System.out.println("Nilai terendah\t: "+nilaiMin);
        System.out.println("Rata-rata nilai\t: "+rata2);
    }
}
