package trees;

class Node2 {
    int data;
    Node2 left, right;

    Node2(int data){
        this.data = data;
    }
}

public class TreeTraversals {
    public static void main(String[] args){
        Node2 root = new Node2(1);
        root.left = new Node2(2);
        root.right = new Node2(3);
        root.left.left = new Node2(4);
        root.left.right = new Node2(5);

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();
    }

    // left -> root -> right, gives sorted order for a BST
    static void inorder(Node2 node){
        if(node == null) return;
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

    // root -> left -> right, useful for copying a tree
    static void preorder(Node2 node){
        if(node == null) return;
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    // left -> right -> root, useful for deleting a tree bottom-up
    static void postorder(Node2 node){
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }
}

// Practice: Write a level-order traversal (breadth-first) using a
// Queue from java.util instead of recursion.
