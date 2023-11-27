import java.util.Scanner;
public class Tugas3 {

    static void inputNamaDanNilai(int [][] nilai, String [] nama) {
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < nama.length; i++) {
            System.out.println();
            System.out.print("Masukkan nama Mahasiswa ke-"+(i+1)+" : ");
            nama[i] = sc.nextLine();
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai Minggu ke-"+(j+1)+" : ");
                nilai[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
    }

    static void tampilNilai(int [][] nilai, String [] nama) {
        int i = 0;
        System.out.println();
        for (int a[] : nilai) {
            System.out.print("Nilai dari Mahasiswa " + nama[i]+"\t: ");
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
            i++;
        }
    }

    static String cariMhsTertinggi (int [][] nilai, String [] nama) {
        String NamaTertinggi = null;
        int maks = nilai[0][0];
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > maks) {
                    maks = nilai [i][j];
                    NamaTertinggi = nama[i];
                }
            }
        }
        return NamaTertinggi;
    }

    static void cariNilaiMaks (int [][] nilai, int []nilaiMaks) {
        nilaiMaks[0] = nilai[0][0];
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > nilaiMaks[0]) {
                    //Nilai maks
                    nilaiMaks[0] = nilai [i][j];
                    //Minggu nilai maks
                    nilaiMaks[1] = j+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah Mahasiswa\t: ");
        int jmlMhs = sc.nextInt();
        System.out.print("Masukkan jumlah nilai\t\t: ");
        int jmlNilai = sc.nextInt();

        int [][] nilaiMhs = new int [jmlMhs][jmlNilai];
        String []namaMhs = new String [jmlMhs];
        int []nilaiTertinggi = new int[2];

        //Menginput nama dan nilai Mahasiswa
        inputNamaDanNilai(nilaiMhs, namaMhs);

        //Mengoutput seluruh nilai Mahasiswa
        tampilNilai(nilaiMhs, namaMhs);

        //Output Nama Mahasiswa dengan nilai tertinggi
        String mhsNilaiTertinggi = cariMhsTertinggi(nilaiMhs, namaMhs);
        System.out.println("\nMahasiswa dengan nilai tertinggi adalah " + mhsNilaiTertinggi);

        //Output nilai tertinggi dan minggu dari nilai tersebut
        cariNilaiMaks(nilaiMhs, nilaiTertinggi);
        System.out.println("Nilai tertinggi adalah " +nilaiTertinggi[0] + " di Minggu ke-" + nilaiTertinggi[1]);

    }
}