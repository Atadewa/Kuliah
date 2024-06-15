public class BinaryTreeMain03 {
    public static void main(String[] args) {
        BinaryTree03 bt = new BinaryTree03();

        bt.addNode(6);
        bt.addNode(4);
        bt.addNode(8);
        bt.addNode(3);
        bt.addNode(5);
        bt.addNode(7);
        bt.addNode(9);
        bt.addNode(10);
        bt.addNode(15);

        System.out.print("PreOrder Traversal\t: ");
        bt.traversePreOrder(bt.root);
        System.out.println();
        System.out.print("InOrder Traversal\t: ");
        bt.traverseInOrder(bt.root);
        System.out.println();
        System.out.print("PostOrder Traversal\t: ");
        bt.traversePostOrder(bt.root);
        System.out.println();

        System.out.println("\nNilai terkecil dalam Binary Tree : " + bt.cariDataTerkecil());
        System.out.println("Nilai terbesar dalam Binary Tree : " + bt.cariDataTerbesar());
        
        // System.out.println("\nFind Node 5 : " + bt.find(5));
        // System.out.println("Delete Node 8");
        // bt.delete(8);
        
        // System.out.print("\nPreOrder Traversal\t: ");
        // bt.traversePreOrder(bt.root);
        // System.out.println();

        System.out.print("\nLeaf : ");
        bt.printLeaf(bt.root);
        System.out.println("\nJumlah leaf : " + bt.hitungLeaf(bt.root));
    }
}
