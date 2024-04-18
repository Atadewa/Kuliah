import java.util.Scanner;
public class PostfixMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;

        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ')';

        int total = Q.length();
        Postfix03 post = new Postfix03(total);
        P = post.konversi(Q);

        System.out.println("\nPostfix: " + P);
    }
}
