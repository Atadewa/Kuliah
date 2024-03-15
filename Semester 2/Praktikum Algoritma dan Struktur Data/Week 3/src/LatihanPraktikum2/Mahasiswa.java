package LatihanPraktikum2;

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
}
