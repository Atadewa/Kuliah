import java.util.Scanner;
public class latihanIndividu103 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner (System.in);

        System.out.print("Jarak Anda dengan lawan (meter) : ");
        float range = input03.nextFloat();
        
        if (range<=5 && range>0) {
            System.out.println("Pertarungan jarak dekat, Anda harus menggunakan melee weapon");
        } else if (range>5) {
            System.out.println("Anda harus menggunakan range weapon");
        }
        
    }
}
