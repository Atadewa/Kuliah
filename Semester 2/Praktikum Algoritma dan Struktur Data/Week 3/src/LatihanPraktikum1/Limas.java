package LatihanPraktikum1;

public class Limas {
    public double sisiAlas;
    public double tinggiLimas;

    public double hitungLp(){
        double luasAlas = sisiAlas*sisiAlas;
        double luasSisiTegak = 4*0.5*sisiAlas*tinggiLimas;
        return luasAlas+luasSisiTegak;
    }
    
    public double hitungVolume(){
        double luasAlas = sisiAlas*sisiAlas;
        return (1.0/3.0) * luasAlas * tinggiLimas;
    }
}
