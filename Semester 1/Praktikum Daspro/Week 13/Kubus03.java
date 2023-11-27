import java.util.Scanner;
public class Kubus03 {

    static double hitungVolume (int s) {
        return s*s*s;
    }

    static double hitungLP (int s) {
        return 6*s*s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan sisi kubus : ");
        int sisi = sc.nextInt();

        System.out.println("\nVolume Kubus : "+hitungVolume(sisi));
        System.out.println("Luas Permukaan Kubus : "+hitungLP(sisi));
        
    }
}
