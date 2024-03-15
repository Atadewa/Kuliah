package LatihanPraktikum1;

public class Bola {
    public double jariJari;

    public double hitungLp(){
        return 4 * Math.PI * jariJari * jariJari;
    }
    
    public double hitungVolume(){
        return (4.0/3.0) * Math.PI * jariJari * jariJari * jariJari;
    }
}
