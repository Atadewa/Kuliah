public class Graph03 {
    int vertex;
    DoubleLinkedLists03 list[];

    public Graph03(int v){
        vertex = v;
        list = new DoubleLinkedLists03[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedLists03();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // InDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    totalIn++;
                }
            }
            // OutDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + "\t: " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + "\t: " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + "\t: " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
                list[asal].size--;
            }
        }
    }

    public void removeAllEdges(){
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public void cekJalur(int asal, int tujuan) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " bertetangga");
                return;
            }
        }
        System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " tidak bertetangga");
    }

    public void updateJarak(int asal, int tujuan, int jarak) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].updateJarak(i, jarak);
                System.out.println("Jarak dari " + (char) ('A' + asal) + " ke " + (char) ('A' + tujuan) + " berhasil diperbarui menjadi " + jarak + " m");
                return;
            }
        }
        System.out.println("Edge tidak ditemukan.");
    }

    public int hitungEdge() {
        int totalEdge = 0;
        for (int i = 0; i < vertex; i++) {
            totalEdge += list[i].size();
        }
        return totalEdge;
    }
}
