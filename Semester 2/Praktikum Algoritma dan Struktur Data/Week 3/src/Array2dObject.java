import java.util.Random;

class Persegi {
    int sisi;
}

public class Array2dObject {
    public static void main(String[] args) {
        Persegi ppArray [][] = new Persegi[2][2];
        Random random = new Random();

        for (int i = 0; i < ppArray.length; i++) {
            for (int j = 0; j < ppArray[i].length; j++) {
                ppArray[i][j] = new Persegi();
                ppArray[i][j].sisi = random.nextInt(50)+1;

                System.out.printf("Sisi Segitiga indeks ke[%d][%d] : %d\n", i, j, ppArray[i][j].sisi);
            }
        }
    }
}