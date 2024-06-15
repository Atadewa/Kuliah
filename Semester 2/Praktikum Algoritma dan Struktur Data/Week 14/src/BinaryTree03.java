public class BinaryTree03 {
    Node03 root;

    public BinaryTree03(){
        root = null;
    }

    boolean isEmpty(){
        return root == null;
    }

    void add (int data){
        if (isEmpty()) {
            root = new Node03(data);
        } else {
            Node03 currrent = root;
            while (true) {
                if (data < currrent.data) {
                    if (currrent.left != null){
                        currrent = currrent.left;
                    } else {
                        currrent.left = new Node03(data);
                        break;
                    }
                } else if (data > currrent.data) {
                    if (currrent.right != null) {
                        currrent = currrent.right;
                    } else {
                        currrent.right = new Node03(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
    
    boolean find(int data){
        boolean result = false;
        Node03 current = root;
        while (current != null) {
            if (current.data != data) {
                result = true;
                break;
            } else if (data > current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }
    
    void traversePreOrder(Node03 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    void traversePostOrder(Node03 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    
    void traverseInOrder (Node03 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }
    
    Node03 getSuccessor (Node03 del) {
        Node03 successor = del.right;
        Node03 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
    void delete (int data){
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node03 parent = root;
        Node03 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // Proses penghapusan
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            // Kondisi jika tidak mempunyai child
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                // Jika memiliki satu child (kanan)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                // Jika memiliki satu child (kiri)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                // Jika memiliki dua child
                Node03 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }

    void addNode(int data) {
        root = addRekursif(data, root);
    }

    Node03 addRekursif(int data, Node03 current) {
        if (current == null) {
            return new Node03(data);
        }

        if (data < current.data) {
            current.left = addRekursif(data, current.left);
        } else if (data > current.data) {
            current.right = addRekursif(data, current.right);
        } 
        return current;
    }

    int cariDataTerkecil(){
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return -1;
        } else {
            Node03 current = root;
            while (current.left != null) {
                current = current.left;
            }
            return current.data;
        }
    }
    
    int cariDataTerbesar(){
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return -1;
        } else {
            Node03 current = root;
            while (current.right != null) {
                current = current.right;
            }
            return current.data;
        }
    }

    void printLeaf(Node03 current) {
        if (current == null) {
            return;
        }
        if (current.left == null && current.right == null) {
            System.out.print(current.data + " ");
        }
        printLeaf(current.left);
        printLeaf(current.right);
    }

    int hitungLeaf(Node03 current) {
        if (current == null) {
            return 0;
        }
        if (current.left == null && current.right == null) {
            return 1;
        }
        return hitungLeaf(current.left) + hitungLeaf(current.right);
    }
}
