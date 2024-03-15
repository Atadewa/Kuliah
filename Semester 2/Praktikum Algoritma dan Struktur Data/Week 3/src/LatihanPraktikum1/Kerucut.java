package LatihanPraktikum1;

public class Kerucut {
    public double jariJari;
    public double sisiMiring;
    public double tinggi;

    public double hitungLp() {
        return Math.PI * jariJari * (jariJari+sisiMiring);
    }

    public double hitungVolume() {
        tinggi = Math.sqrt(sisiMiring*sisiMiring - jariJari*jariJari);
        return (1.0/3.0) * Math.PI * jariJari * jariJari * tinggi;
    }
}
