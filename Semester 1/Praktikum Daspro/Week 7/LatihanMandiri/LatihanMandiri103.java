import java.util.Scanner;
public class LatihanMandiri103 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama;
        char gender;

        System.out.println("Mahasiswa Kelas 1A TI\n");
        for (int i = 1; i <= 30; i++) {
            System.out.print("Masukkan nama mahasiswa ke-"+i+"\t: ");
            nama = input.next();
            System.out.print("Masukkan gender mahasiswa (L/P)\t: ");
            gender = input.next().charAt(0);

            if (gender == 'p' || gender == 'P') {
                System.out.println("\n" + nama + " adalah seorang mahasiswa perempuan");
            }
            System.out.println("");
        }
    }
}
