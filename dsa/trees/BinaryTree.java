package trees;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data){
        this.data = data;
    }
}

public class BinaryTree {
    public static void main(String[] args){

        // manually building a small tree:
        //         1
        //       /   \
        //      2     3
        //     / \
        //    4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Height: "+height(root));
        System.out.println("Node count: "+countNodes(root));
    }

    static int height(TreeNode node){
        if(node == null){
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    static int countNodes(TreeNode node){
        if(node == null){
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
}

// Practice: Write a method sumOfNodes(TreeNode node) that returns the
// sum of all values in the tree.
