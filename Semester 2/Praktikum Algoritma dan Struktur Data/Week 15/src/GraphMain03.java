import java.util.Scanner;
public class GraphMain03 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah gedung : ");
        int vertex = sc.nextInt();
        Graph03 graph = new Graph03(vertex);
        int pilihan = 0;

        do {
            System.out.println("\n=====================");
            System.out.println("         MENU");
            System.out.println("=====================");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8. Keluar");
            System.out.println("=====================\n");

            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan asal\t: ");
                    int asal = sc.nextInt();
                    System.out.print("Masukkan tujuan\t: ");
                    int tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak\t: ");
                    int jarak = sc.nextInt();
                    graph.addEdge(asal, tujuan, jarak);
                    break;

                case 2:
                    System.out.print("Masukkan asal\t: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan tujuan\t: ");
                    tujuan = sc.nextInt();
                    graph.removeEdge(asal, tujuan);
                    break;

                case 3:
                    System.out.print("Masukkan gedung yang ingin dicek degree-nya: ");
                    asal = sc.nextInt();
                    graph.degree(asal);
                    break;

                case 4:
                    graph.printGraph();
                    break;

                case 5:
                    System.out.print("Masukkan asal\t: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan tujuan\t: ");
                    tujuan = sc.nextInt();
                    graph.cekJalur(asal, tujuan);
                    break;

                case 6:
                    System.out.print("Masukkan asal\t: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan tujuan\t: ");
                    tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak baru : ");
                    jarak = sc.nextInt();
                    graph.updateJarak(asal, tujuan, jarak);
                    break;

                case 7:
                    System.out.println("Jumlah edge di dalam graf: " + graph.hitungEdge());
                    break;

                case 8:
                    System.out.println("Terimakasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 8);
    }
}
