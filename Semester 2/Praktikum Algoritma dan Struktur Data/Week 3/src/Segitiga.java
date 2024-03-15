public class Segitiga {
    public int alas;
    public int tinggi;
    public float sisiMiring;

    public Segitiga (int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float hitungLuas() {
        return 0.5f*alas*tinggi;
    }

    public float hitungKeliling() {
        sisiMiring = (float) Math.sqrt((alas*alas + tinggi*tinggi));
        return alas + tinggi + sisiMiring;
    }
    
    public static void main(String[] args) {
        Segitiga sgArray[] = new Segitiga[4];
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("\nSegitiga ke-" + (i+1));
            System.out.printf("Keliling : %.2f\n", sgArray[i].hitungKeliling());
            System.out.println("Luas : " + sgArray[i].hitungLuas());
        }
    }
}
