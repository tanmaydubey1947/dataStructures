package trees;


public class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


    public static void main(String[] args) {

        TreeNode node = new TreeNode();
        node.val = 4;

        //leftNodes

        TreeNode node1 = new TreeNode();
        node1.val = 2;
        node.left = node1;

        TreeNode node2 = new TreeNode();
        node2.val = 1;
        node1.left = node2;

        TreeNode node3 = new TreeNode();
        node3.val = 3;
        node1.right = node3;

        //rightNodes

        TreeNode node4 = new TreeNode();
        node.right = node4;
        node4.val = 7;

        TreeNode nodeResult = insertIntoBST(node, 5);
        System.out.println(nodeResult);


    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {

        TreeNode newNode = new TreeNode();
        newNode.val = val;

        TreeNode tempNode = root;

        if (root.right == null && val > tempNode.val) {
            tempNode.right = newNode;
        }
        if (root.left == null && val < tempNode.val) {
            tempNode.left = newNode;
        }

        while (true) {
            if (val > tempNode.val) {
                if (tempNode.right == null) {
                    tempNode.right = newNode;
                    return root;
                } else {
                    tempNode = tempNode.right;
                }
            }

            if (val < tempNode.val) {
                if (tempNode.left == null) {
                    tempNode.left = newNode;
                    return root;
                } else {
                    tempNode = tempNode.left;
                }
            }
        }

    }
}

