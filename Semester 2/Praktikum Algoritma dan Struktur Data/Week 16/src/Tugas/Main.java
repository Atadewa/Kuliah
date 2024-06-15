package Tugas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    // List Mahasiswa
    static List<Mahasiswa> mahasiswas = new ArrayList<>();
    
    static void tambahMhs(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    
    static Mahasiswa findMhs(String nim){
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return mahasiswas.get(i);
            }
        }
        return null;
    }
    
    static void tampilMhs(){
        System.out.println("=== DAFTAR MAHASISWA ===");
        System.out.println("------------------------------------");
        System.out.println("|  NIM  | Nama Mahasiswa | No Telp |");
        System.out.println("------------------------------------");
        for (int i = 0; i < mahasiswas.size(); i++) {
            System.out.printf("| %s | %-14s | %-7s |\n", mahasiswas.get(i).nim, mahasiswas.get(i).nama, mahasiswas.get(i).notelp);
        }
        System.out.println("------------------------------------");
    }

    static Mahasiswa hapusMhs(){
        Mahasiswa delete = mahasiswas.get(0);
        mahasiswas.remove(0);
        return delete;
    }
    
    // List MataKuliah
    static List<MataKuliah> mataKuliahs = new ArrayList<>();
    
    static void tambahMK(MataKuliah... mataKuliah) {
        mataKuliahs.addAll(Arrays.asList(mataKuliah));
    }
    
    static MataKuliah findMk(String kodeMK){
        for (int i = 0; i < mataKuliahs.size(); i++) {
            if (kodeMK.equals(mataKuliahs.get(i).kodeMK)) {
                return mataKuliahs.get(i);
            }
        }
        return null;
    }
    
    static void tampilMK(){
        System.out.println("=== DAFTAR MATA KULIAH ===");
        System.out.println("-------------------------------------------------------");
        System.out.printf("| Kode  | %-37s | SKS |\n", "Mata Kuliah");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < mataKuliahs.size(); i++) {
            System.out.printf("| %s | %-37s |  %d  |\n", mataKuliahs.get(i).kodeMK, mataKuliahs.get(i).namaMK, mataKuliahs.get(i).SKS);
        }
        System.out.println("-------------------------------------------------------");
    }
    
    // List Nilai
    static List<Nilai> nilais = new ArrayList<>();
    
    static void tambahNilai(Mahasiswa mhs, MataKuliah mk, double nilai){
        nilais.add(new Nilai(mhs, mk, nilai));
    }
    
    static void tampilNilai(){
        System.out.println("=== DAFTAR NILAI MAHASISWA ===");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("|  NIM  | %-14s | %-37s | SKS | Nilai |\n", "Nama Mahasiswa", "Mata Kuliah");
        System.out.println("--------------------------------------------------------------------------------");
        for (int i = 0; i < nilais.size(); i++) {
            System.out.printf("| %-5s | %-14s | %-37s |  %d  | %.2f |\n", nilais.get(i).mhs.nim, nilais.get(i).mhs.nama, nilais.get(i).mk.namaMK, nilais.get(i).mk.SKS, nilais.get(i).nilai);
        }
        System.out.println("--------------------------------------------------------------------------------");
    }

    static void findNilaiMhs(String nim){
        int totalSKS = 0;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.printf("|  NIM  | %-14s | %-37s | SKS | Nilai |\n", "Nama Mahasiswa", "Mata Kuliah");
        System.out.println("--------------------------------------------------------------------------------");
        for (int i = 0; i < nilais.size(); i++) {
            if (nim.equals(nilais.get(i).mhs.nim)) {
                System.out.printf("| %-5s | %-14s | %-37s |  %d  | %.2f |\n", nilais.get(i).mhs.nim, nilais.get(i).mhs.nama, nilais.get(i).mk.namaMK, nilais.get(i).mk.SKS, nilais.get(i).nilai);
                totalSKS+=nilais.get(i).mk.SKS;
            }
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Total SKS " + totalSKS + " telah diambil.");
    }
    
    static void sortNilaiAsc(){
        for (int i = 0; i < nilais.size(); i++) {
            for (int j = 1; j < nilais.size()-i; j++) {
                if (nilais.get(j).nilai < nilais.get(j-1).nilai) {
                    Nilai temp = nilais.get(j);
                    nilais.set(j, nilais.get(j-1));
                    nilais.set(j-1, temp);
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Mahasiswa m1 = new Mahasiswa("20001", "Thalhah", "021xx1");
        Mahasiswa m2 = new Mahasiswa("20002", "Zubair", "021xx2");
        Mahasiswa m3 = new Mahasiswa("20003", "Abdur-Rahman", "021xx3");
        Mahasiswa m4 = new Mahasiswa("20004", "Sa'ad", "021xx4");
        Mahasiswa m5 = new Mahasiswa("20005", "Sa'id", "021xx5");
        Mahasiswa m6 = new Mahasiswa("20006", "Ubaidah", "021xx6");
        
        tambahMhs(m1, m2, m3, m4, m5, m6);
        
        MataKuliah mk1 = new MataKuliah("00001", "Internet of Things", 3);
        MataKuliah mk2 = new MataKuliah("00002", "Algoritma dan Struktur Data", 2);
        MataKuliah mk3 = new MataKuliah("00003", "Algoritma dan Pemrograman", 2);
        MataKuliah mk4 = new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", 3);
        MataKuliah mk5 = new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", 3);
        
        tambahMK(mk1, mk2, mk3, mk4, mk5);
        
        int pilihan = 0;
        do {
            System.out.println("\n=================================================");
            System.out.println(" SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("=================================================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Data Mahasiswa");
            System.out.println("6. Keluar");
            System.out.println("=================================================\n");
            
            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();
            System.out.println();
            
            switch (pilihan) {
                case 1:
                    tampilMhs();
                    System.out.print("Pilih Mahasiswa by NIM: ");
                    String nim = sc.next();
                
                    System.out.println();
                    tampilMK();
                    System.out.print("Pilih MK by kode: ");
                    String kodeMK = sc.next();
                
                    System.out.println();
                    System.out.print("Masukkan Nilai: ");
                    double nilai = sc.nextDouble();
                
                    tambahNilai(findMhs(nim), findMk(kodeMK), nilai);
                
                    break;
                
                case 2:
                    tampilNilai();
                    break;
                
                case 3:
                    tampilNilai();
                    System.out.println();
                    System.out.print("Masukkan data mahasiswa by NIM: ");
                    nim = sc.next();
                
                    findNilaiMhs(nim);
                    break;
                
                case 4:
                    sortNilaiAsc();
                    tampilNilai();
                    break;

                case 5:
                    Mahasiswa delete = hapusMhs();
                    System.out.println("Data Mahasiswa " + delete.nama + " dengan NIM " + delete.nim + " berhasil dihapus.");
                    break;
                
                case 6:
                    System.out.println("Terimakasih.");
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 6);
    }
}