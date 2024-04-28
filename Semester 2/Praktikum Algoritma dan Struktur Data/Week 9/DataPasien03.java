public class DataPasien03 {
    Pasien03 []listPasien03 = new Pasien03[10];
    int jumlah;

    void tambahPasien(Pasien03 pasien03){
        if (jumlah < listPasien03.length) {
            listPasien03[jumlah] = pasien03;
            jumlah++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampilDataPasien(){
        System.out.println("==============================================");
        System.out.printf("| No | Nama Pasien | %-11s | ID Pasien |\n","Umur Pasien" );
        System.out.println("==============================================");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("| %-2d | %-11s | %-11s | %-9s |\n", (i+1), listPasien03[i].nama03, listPasien03[i].umur03 + " tahun", listPasien03[i].idPasien03);
        }
        System.out.println("==============================================");
    }

    void sortUmurPasien(){
        for (int i = 0; i < jumlah-1; i++) {
            int indeksMin = i;
            for (int j = i+1; j < jumlah; j++) {
                if (listPasien03[j].umur03 < listPasien03[indeksMin].umur03) {
                    indeksMin = j;
                }
            }
            Pasien03 tmp = listPasien03[indeksMin];
            listPasien03[indeksMin] = listPasien03[i];
            listPasien03[i] = tmp;
        }
    }

    Pasien03 searchIdPasien(String Id){
        for (int i = 0; i < jumlah; i++) {
            if (listPasien03[i].idPasien03.equals(Id)) {
                return listPasien03[i];
            }
        }
        return null;
    }
}
