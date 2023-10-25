package trees;

public class BFS {

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

        System.out.println(deepestLeavesSum(node));

    }

    public static int deepestLeavesSum(TreeNode root) {
        return 0;
        
    }
    
}
