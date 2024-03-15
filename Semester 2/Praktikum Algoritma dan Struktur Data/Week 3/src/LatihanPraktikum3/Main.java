package LatihanPraktikum3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
        Mahasiswa arrayMhs[] = new Mahasiswa[3];

        for (int i = 0; i < arrayMhs.length; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i+1));
            arrayMhs[i] = new Mahasiswa();
            System.out.print("Masukkan Nama\t\t: ");
            arrayMhs[i].nama = sc.next();
            System.out.print("Masukkan NIM\t\t: ");
            arrayMhs[i].NIM = sc.next();
            System.out.print("Masukkan Jenis Kelamin\t: ");
            arrayMhs[i].gender = sc.next().charAt(0);
            System.out.print("Masukkan Nilai IPK\t: ");
            arrayMhs[i].IPK = sc.nextDouble();
        }

        for (int i = 0; i < arrayMhs.length; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i+1));
            arrayMhs[i].tampilData();
        }

        System.out.println("\n============================");

        System.out.printf("\nNilai rata-rata IPK : %.2f\n", arrayMhs[0].hitungRerataIPK(arrayMhs));
        arrayMhs[0].cariIPKTerbesar(arrayMhs);
    }
}
