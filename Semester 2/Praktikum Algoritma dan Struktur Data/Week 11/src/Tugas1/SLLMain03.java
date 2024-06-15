package Tugas1;

public class SLLMain03 {
    public static void main(String[] args) {
        SLL03 Mahasiswa = new SLL03();

        Mahasiswa03 mhs1 = new Mahasiswa03("Yusuf", 113);
        Mahasiswa03 mhs2 = new Mahasiswa03("Sari", 115);
        Mahasiswa03 mhs3 = new Mahasiswa03("Prita", 112);
        Mahasiswa03 mhs4 = new Mahasiswa03("Anton", 111);
        Mahasiswa03 mhs5 = new Mahasiswa03("Doni", 114);

        Mahasiswa.addFirst(mhs4);
        Mahasiswa.print();
        Mahasiswa.addLast(mhs2);
        Mahasiswa.print();
        Mahasiswa.insertAt(1, mhs3);
        Mahasiswa.print();
        Mahasiswa.insertAfter(mhs3, mhs1);
        Mahasiswa.print();
        Mahasiswa.insertAt(3, mhs5);
        Mahasiswa.print();
    }    
}
