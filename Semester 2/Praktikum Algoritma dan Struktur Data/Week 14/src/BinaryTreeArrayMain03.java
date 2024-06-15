public class BinaryTreeArrayMain03 {
    public static void main(String[] args) {
        // int data[] = {6,4,8,3,5,7,9,0,0,0};
        // int idxLast = 6;
        
        // bta.populateData(data, idxLast);
        // System.out.print("\nInOrder Traversal : ");
        // bta.traverseInOrder(0);
        // System.out.println("\n");
        
        BinaryTreeArray03 bta = new BinaryTreeArray03();
        bta.add(3);
        bta.add(2);
        bta.add(5);
        bta.add(1);
        bta.add(6);
        bta.add(4);

        System.out.print("PreOrder Traversal\t: ");
        bta.traversePreOrder(0);
        System.out.println();
        System.out.print("InOrder Traversal\t: ");
        bta.traverseInOrder(0);
        System.out.println();
        System.out.print("PostOrder Traversal\t: ");
        bta.traversePostOrder(0);
        System.out.println();
    }   
}
