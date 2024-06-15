public class NodeBarang {
    BarangRental data;
    NodeBarang prev, next;

    NodeBarang(NodeBarang prev, BarangRental data, NodeBarang next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}