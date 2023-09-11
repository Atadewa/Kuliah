public class ContohVariabel03 {
    public static void main(String[] args) {
        String hobbySaya = "Bermain petak umpet";
        boolean isPandai = true;
        char gender = 'L';
        byte umur = 20;
        double ipk = 3.24, tinggi = 1.78;
        System.out.println(hobbySaya);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin : " + gender);
        System.out.println("Umurku saat ini : " + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}