package Lingkaran;

public class Main {
    public static void main(String[] args) {
        Lingkaran circle1 = new Lingkaran();
        circle1.jariJari = 7;

        Lingkaran circle2 = new Lingkaran(14);

        System.out.println("Panjang jari-jari lingkaran ke-1 : " + circle1.jariJari); 
        System.out.println("Panjang jari-jari lingkaran ke-2 : " + circle2.jariJari); 
    }
}
