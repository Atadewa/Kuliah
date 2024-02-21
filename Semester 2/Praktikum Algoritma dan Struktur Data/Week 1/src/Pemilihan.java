import java.util.Scanner;
public class Pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int nilaiTugas, nilaiKuis, nilaiUts, nilaiUas;
        float nilaiAkhir;
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas\t: ");
        nilaiTugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis\t: ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS\t: ");
        nilaiUts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS\t: ");
        nilaiUas = sc.nextInt();
        System.out.println("==============================\n");
        
        if ((nilaiTugas < 0 || nilaiTugas > 100) || (nilaiKuis < 0 || nilaiKuis > 100) || (nilaiUts < 0 || nilaiUts> 100) || (nilaiUas < 0 || nilaiUas > 100))  {
            System.out.println("==============================");
            System.out.println("Nilai Tidak Valid");
            System.out.println("==============================");
        } else {
            nilaiAkhir = ((0.2f * nilaiTugas) + (0.2f * nilaiKuis) + (0.3f * nilaiUts) + (0.3f * nilaiUas))  ;
            
            nilaiHuruf =  nilaiAkhir <= 39 ? "E" :
                          nilaiAkhir <= 50 ? "D" :
                          nilaiAkhir <= 60 ? "C" :
                          nilaiAkhir <= 65 ? "C+" :
                          nilaiAkhir <= 73 ? "B" :
                          nilaiAkhir <= 80 ? "B+" : "A";
                        
            System.out.println("==============================");
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==============================\n");

            if (nilaiHuruf == "D" || nilaiHuruf == "E") {
                System.out.println("MAAF, ANDA TIDAK LULUS");
            } else {
                System.out.println("SELAMAT ANDA LULUS");
            }
        }
    }
}