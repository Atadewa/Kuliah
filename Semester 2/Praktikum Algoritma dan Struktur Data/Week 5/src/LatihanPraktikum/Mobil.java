package LatihanPraktikum;

public class Mobil {
    String merk, tipe;
    int tahun, topAcceleration, topPower;

    Mobil (String merk, String tipe, int tahun, int topAcceleration, int topPower){
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }

    static void tampilTabel(Mobil cars[]) {
        System.out.println();
        System.out.println("=======================================================================");
        System.out.printf("| %-10s | %-15s | Tahun | Top Acceleration | Top Power |\n", "Merk", "Tipe");
        System.out.println("=======================================================================");
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("| %-10s | %-15s | %-5d | %-16d | %-9d |\n", cars[i].merk, cars[i].tipe, cars[i].tahun, cars[i].topAcceleration, cars[i].topPower);
        }
        System.out.println("=======================================================================\n");
    }

    static Mobil cariAccelerationTertinggi(Mobil cars[], int awal, int akhir){

        if (awal == akhir) {
            return cars[awal];
        }
        
        int mid = (awal + akhir) / 2;
        Mobil lTertinggi = cariAccelerationTertinggi(cars, awal, mid);
        Mobil rTertinggi = cariAccelerationTertinggi(cars, mid+1, akhir);

        Mobil nilaiTertinggi = lTertinggi.topAcceleration > rTertinggi.topAcceleration ? lTertinggi : rTertinggi;
        return nilaiTertinggi;
    }

    static Mobil cariPowerTerendah(Mobil cars[], int awal, int akhir){
        if (awal == akhir) {
            return cars[awal];
        }
        
        int mid = (awal + akhir) / 2;
        Mobil lTerendah = cariPowerTerendah(cars, awal, mid);
        Mobil rTerendah = cariPowerTerendah(cars, mid+1, akhir);

        Mobil nilaiTerendah = lTerendah.topPower < rTerendah.topPower ? lTerendah : rTerendah;
        return nilaiTerendah;
    }

    static double hitungRerataPower(Mobil cars[]) {
        double rerata = 0;
        for (int i = 0; i < cars.length; i++) {
            rerata += cars[i].topPower;
        }
        rerata /= cars.length;

        return rerata;
    }
}
