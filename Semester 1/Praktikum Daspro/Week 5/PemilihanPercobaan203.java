import java.util.Scanner;
public class PemilihanPercobaan203 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner (System.in);

        System.out.print("Nilai uas    : ");
        float uas = input03.nextFloat();
        System.out.print("Nilai uts    : ");
        float uts = input03.nextFloat();
        System.out.print("Nilai kuis   : ");
        float kuis = input03.nextFloat();
        System.out.print("Nilai tugas  : ");
        float tugas = input03.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String nilaiHuruf = null, kualifikasi = null; 

        if (total <= 39) {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        } else if (total <= 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else if (total <= 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (total <= 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (total <= 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (total <= 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (total <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        }
        
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        
        System.out.println("\nNilai akhir\t= "+total);
        System.out.println("Nilai huruf\t= "+nilaiHuruf);
        System.out.println("Kualifikasi \t= "+kualifikasi);
        System.out.println("Hasil\t\t= "+message);
    } 
    
}