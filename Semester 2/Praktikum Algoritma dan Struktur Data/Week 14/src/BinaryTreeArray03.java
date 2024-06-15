public class BinaryTreeArray03 {
    int []data;
    int idxLast;

    public BinaryTreeArray03(){
        data = new int[10];
        idxLast = -1;
    }

    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart){
        if (idxStart <= idxLast) {
            if (data[idxStart] != 0) {
                traverseInOrder(2*idxStart+1);
                System.out.print(data[idxStart] + " ");
                traverseInOrder(2*idxStart+2);
            }
        }
    }

    void add(int data) {
        if (idxLast == this.data.length - 1) {
            System.out.println("Tree is full");
        } else if (idxLast == -1) {
            this.data[++idxLast] = data;
        } else {
            int current = 0;
            while (true) {
                if (data < this.data[current]) {
                    int leftChild = 2*current+1;
                    if (this.data[leftChild] == 0) {
                        this.data[leftChild] = data;

                        if (leftChild > idxLast) {
                            idxLast = leftChild;
                        }
                        break;
                    } else {
                        current = leftChild;
                    }
                } else {
                    int rightChild = 2*current+2;
                    if (this.data[rightChild] == 0) {
                        this.data[rightChild] = data;

                        if (rightChild > idxLast) {
                            idxLast = rightChild;
                        }
                        break;
                    } else {
                        current = rightChild;
                    }
                }
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != 0) {
                System.out.print(data[idxStart] + " ");
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
    
    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != 0) {
                traversePostOrder(2 * idxStart + 1);
                traversePostOrder(2 * idxStart + 2);
                System.out.print(data[idxStart] + " ");
            }
        }
    }
}
