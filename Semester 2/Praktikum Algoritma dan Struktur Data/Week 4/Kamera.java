class Kamera{
    public String merk;
    public String type;
    public int stok;
    public int hargaSewa;

    Kamera(String merk, String type, int stok, int hargaSewa){
        this.merk = merk;
        this.type = type;
        this.stok = stok;
        this.hargaSewa = hargaSewa;
    }

    void tampilInformasi(){
        System.out.printf("| %-8s | %-15s | %-4d | %-10d |\n", merk, type, stok, hargaSewa);
    }

    int hitungHargaSewa(int lamaHari){
        return hargaSewa*lamaHari;
    }

    void kurangiStok(){
        stok--;
    }
}