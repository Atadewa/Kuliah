public class NodeLayanan03 {
    Layanan03 service03;
    NodeLayanan03 perv03, next03;

    NodeLayanan03 (NodeLayanan03 prev03, Layanan03 service03, NodeLayanan03 next03){
        this.perv03 = prev03;
        this.service03 = service03;
        this.next03 = next03;
    }
}
