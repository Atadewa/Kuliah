import java.util.Scanner;
public class latiahanIndividu203 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner (System.in);
        String username = "admin", password = "admin123", user, pass;

        System.out.print("Masukkan username Anda\t: ");
        user = input03.nextLine();
        System.out.print("Masukkan password Anda\t: ");
        pass = input03.nextLine();

        if (user.equals(username) && pass.equals(password)) {
            System.out.println("Selamat, Anda berhasil login");
        } else {
            System.out.println("Username dan password salah");
        }

    }
}
