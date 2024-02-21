
public class Fungsi {

    static void hitungPendapatan (int[][] stokBunga, int[] pendapatan, int[] hargaBunga) {
        for (int i = 0; i < pendapatan.length; i++) {
            for (int j = 0; j < stokBunga[i].length; j++) {
                pendapatan[i] += stokBunga[i][j]*hargaBunga[j];
            }
        }

        System.out.printf("| %-14s | Pendapatan |\n", "Cabang");
        for (int i = 0; i < pendapatan.length; i++) {
            System.out.printf("| Royal Garden %d | %-10d |\n", i+1, pendapatan[i]);
        }
    }

    static void hitungStokBunga (int[][] stokBunga) {
        System.out.printf("| %-14s | %-8s | %-8s | %-8s | %-8s |\n", " ", "Aglonema", "Keladi", "Alocasia", "Mawar");
        for (int i = 0; i < stokBunga.length; i++) {
            System.out.print("| Royal Garden " + (i+1) + " |");
            for (int j = 0; j < stokBunga[i].length; j++) {
                System.out.printf(" %-8d |", stokBunga[i][j]);
            }
            System.out.println();
        }
    }
}