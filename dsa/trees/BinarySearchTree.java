package trees;

class BSTNode {
    int data;
    BSTNode left, right;

    BSTNode(int data){
        this.data = data;
    }
}

class BST {
    BSTNode root;

    void insert(int value){
        root = insertRec(root, value);
    }

    // a BST keeps every left subtree smaller and every right subtree
    // larger than the current node, which makes searching O(log n) on average
    BSTNode insertRec(BSTNode node, int value){
        if(node == null){
            return new BSTNode(value);
        }
        if(value < node.data){
            node.left = insertRec(node.left, value);
        }
        else if(value > node.data){
            node.right = insertRec(node.right, value);
        }
        return node;
    }

    boolean search(int value){
        return searchRec(root, value);
    }

    boolean searchRec(BSTNode node, int value){
        if(node == null){
            return false;
        }
        if(node.data == value){
            return true;
        }
        return value < node.data ? searchRec(node.left, value) : searchRec(node.right, value);
    }

    void inorderPrint(BSTNode node){
        if(node == null) return;
        inorderPrint(node.left);
        System.out.print(node.data+" ");
        inorderPrint(node.right);
    }
}

public class BinarySearchTree {
    public static void main(String[] args){
        BST tree = new BST();
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for(int v : values){
            tree.insert(v);
        }

        tree.inorderPrint(tree.root);
        System.out.println();

        System.out.println(tree.search(40));
        System.out.println(tree.search(100));
    }
}

// Practice: Write a method findMin(BSTNode node) that returns the
// smallest value in the BST (hint: it's always the leftmost node).
