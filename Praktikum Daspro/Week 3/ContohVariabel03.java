public class ContohVariabel03 {
    public static void main(String[] args) {
        String hobby = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSekarang = 20;
        double $ipk = 3.24, tinggi = 1.78;
        System.out.println(hobby);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin : " + jenisKelamin);
        System.out.println("Umurku saat ini : " + umurSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}