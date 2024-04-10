package LatihanPraktikum;

public class MainMobil {
    public static void main(String[] args) {
        Mobil cars[] = {
        new Mobil("BMW", "M2 Coupe", 2016, 6816, 728),
        new Mobil("Ford", "Fiersa ST", 2014, 3921, 575),
        new Mobil("Nissan", "370Z", 2009, 4360, 657),
        new Mobil("Subaru", "BRZ", 2014, 4058, 609),
        new Mobil("Subaru", "Impreza WRX STI", 2013, 6255, 703),
        new Mobil("Toyota", "AE86 Trueno", 1986, 3700, 553),
        new Mobil("Toyota", "86/GT86", 2014, 4180, 609),
        new Mobil("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        Mobil.tampilTabel(cars);

        Mobil mobilTopAccelerationTertinggi = Mobil.cariAccelerationTertinggi(cars, 0, cars.length - 1);
        System.out.println("Mobil dengan top acceleration tertinggi");
        System.out.println("Merk\t\t : " + mobilTopAccelerationTertinggi.merk);
        System.out.println("Tipe\t\t : " + mobilTopAccelerationTertinggi.tipe);
        System.out.println("Tahun\t\t : " + mobilTopAccelerationTertinggi.tahun);
        System.out.println("Top Acceleration : " + mobilTopAccelerationTertinggi.topAcceleration);
        System.out.println("Top Power\t : " + mobilTopAccelerationTertinggi.topPower);
        
        Mobil mobilTopPowerTerendah = Mobil.cariPowerTerendah(cars, 0, cars.length - 1);
        System.out.println("\nMobil dengan top power terendah");
        System.out.println("Merk\t\t : " + mobilTopPowerTerendah.merk);
        System.out.println("Tipe\t\t : " + mobilTopPowerTerendah.tipe);
        System.out.println("Tahun\t\t : " + mobilTopPowerTerendah.tahun);
        System.out.println("Top Acceleration : " + mobilTopPowerTerendah.topAcceleration);
        System.out.println("Top Power\t : " + mobilTopPowerTerendah.topPower);

        System.out.println("\nRata-rata top power dari keseluruhan mobil : " + Mobil.hitungRerataPower(cars));
    }
}
