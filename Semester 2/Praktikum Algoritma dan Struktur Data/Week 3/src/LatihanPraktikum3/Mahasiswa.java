package LatihanPraktikum3;

public class Mahasiswa {
    public String nama;
    public String NIM;
    public char gender;
    public double IPK;

    public void tampilData(){
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t: " + NIM);
        System.out.println("Jenis Kelamin\t: " + gender);
        System.out.println("Nilai IPK\t: " + IPK);
    }

    public double hitungRerataIPK(Mahasiswa mhs[]){
        double rerata = 0;
        for (int i = 0; i < mhs.length; i++) {
            rerata += mhs[i].IPK;
        }
        rerata /= 3;
        return rerata;
    }

    public void cariIPKTerbesar(Mahasiswa mhs[]){
        double IPKTerbesar = mhs[0].IPK;
        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].IPK > IPKTerbesar) {
                IPKTerbesar = mhs[i].IPK;
            }
        }

        System.out.println("\nMahasiswa yang memiliki nilai IPK terbesar:");
        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].IPK == IPKTerbesar) {
                mhs[i].tampilData();
            }
        }
    }
}
