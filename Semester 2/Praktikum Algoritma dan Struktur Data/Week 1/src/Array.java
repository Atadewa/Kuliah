import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String matkul [] = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        int sks [] = {2,2,2,3,2,2,3,2};
        int jumlahSks = 0;
        //Perhitungan jumlah SKS ada di bawah
        String nilaiHuruf [] = new String[matkul.length];
        float nilai [][] = new float[2][matkul.length];
        float ipSemester = 0;

        System.out.println("==================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==================================");

        // Input nilai
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("Masukkan nilai Angka untuk MK %-37s : ", matkul[i]);
            nilai [0][i] = sc.nextFloat();
        }
        
        // Konversi
        for (int i = 0; i < matkul.length; i++) {
            if (nilai [0][i] <= 39) {
                nilaiHuruf[i] = "E";
                nilai[1][i] = 0;
            } else if (nilai [0][i] <= 50) {
                nilaiHuruf[i] = "D";
                nilai[1][i] = 1;
            } else if (nilai [0][i] <= 60) {
                nilaiHuruf[i] = "C";
                nilai[1][i] = 2;
            } else if (nilai [0][i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilai[1][i] = 2.5f;
            } else if (nilai [0][i] <= 73) {
                nilaiHuruf[i] = "B";
                nilai[1][i] = 3;
            } else if (nilai [0][i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilai[1][i] = 3.5f;
            } else if (nilai [0][i] <= 100) {
                nilaiHuruf[i] = "A";
                nilai[1][i] = 4;
            }
        }
        
        // Perhitungan Jumlah SKS dan IP Semester
        for (int i = 0; i < sks.length; i++) {
            jumlahSks += sks[i];
        }

        for (int i = 0; i < nilai[1].length; i++) {
            ipSemester += nilai[1][i] * sks[i];
        }
        ipSemester /= jumlahSks;
        
        //Output
        System.out.println("\n==================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==================================");
        
        System.out.printf("%-37s | Nilai Angka | Nilai Huruf | Bobot Nilai |\n", "MK");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-37s | %-11.2f | %-11s | %-11.2f |\n", matkul[i], nilai[0][i], nilaiHuruf[i], nilai[1][i]);
        }
        
        System.out.println("\n==================================");
        System.out.printf("IP Semester : %.2f\n", ipSemester);
    }
}
