import java.util.Scanner;
public class Pemilihan2Percobaan203 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner (System.in);
        float sudut1, sudut2, sudut3, totalSudut;
        System.out.print("Masukkan sudut 1 : ");
        sudut1 = input03.nextInt();
        System.out.print("Masukkan sudut 2 : ");
        sudut2 = input03.nextInt();
        System.out.print("Masukkan sudut 3 : ");
        sudut3 = input03.nextInt();

        totalSudut = sudut1  +sudut2 + sudut3;

        if (totalSudut == 180) {
            if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
                System.out.println("Segitga tersebut adalah segitiga siku-siku");
            } else {
                System.out.println("Segitga tersebut adalah bukan segitiga siku-siku");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }
    }
}
