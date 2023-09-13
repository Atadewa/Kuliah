import  java.util.Scanner;
public class Latihan03 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int r1, r2, r3, r4, i;
        float rp, totalRp, rt, v;

        System.out.println("Menghitung Nilai Tegangan (V) Sesuai Gambar");
        System.out.print("Masukkan nilai R1\t: ");
        r1 = input.nextInt();
        System.out.print("Masukkan nilai R2\t: ");
        r2 = input.nextInt();
        System.out.print("Masukkan nilai R3\t: ");
        r3 = input.nextInt();
        System.out.print("Masukkan nilai R4\t: ");
        r4 = input.nextInt();
        System.out.print("Masukkan nilai I\t: ");
        i = input.nextInt();

        //Menghitung nilai Rp
        rp = 1.0f/r1+1.0f/r2+1.0f/r3;
        totalRp = 1/rp;
        //Menghitung nilai R total
        rt = r4 + totalRp;
        //Menghitung nilai V
        v = i*rt;

        System.out.println("\nHasil Perhitungan Nilai Tegangan (V)\n");
        System.out.println("Perhitungan Hambatan Paralel");
        System.out.println("1/Rp\t= 1/"+r1+" + 1/"+r2+" + 1/"+r3);
        System.out.println("Rp\t= "+rp);
        System.out.println("Rp\t= "+totalRp);

        float rs = r4;
        System.out.println("\nPerhitungan Hambatan Total");
        System.out.println("R total\t= Rp + Rs");
        System.out.println("R total\t= "+totalRp+" + "+rs);

        System.out.println("\nPerhitungan Nilai Tegangan");
        System.out.println("V\t= I x R total");
        System.out.println("V\t= " +i+" x "+totalRp);
        System.out.println("V\t= " +v+" Volt");

    }
}



