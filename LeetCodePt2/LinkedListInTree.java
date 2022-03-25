package LeetCodePt2;

public class LinkedListInTree {


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

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
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) { return false; }
        // as we traverse each child of the tree...
        return doesRootHaveList(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }
    // ...we traverse list to see if in tree
    private boolean doesRootHaveList(ListNode head, TreeNode root) {
        if (head == null) { return true; }
        if (root == null) { return false; }

        return head.val == root.val && (doesRootHaveList(head.next, root.left) || doesRootHaveList(head.next, root.right));
    }

//        public boolean isSubPath(ListNode head, TreeNode root) {
//            if(root == null)
//                return false;
//            if(head.val == root.val){
//                if(find(head, root) == true)
//                    return true;
//            }
//            if(isSubPath(head, root.left) == true)
//                return true;
//            return isSubPath(head, root.right);
//        }
//
//        public boolean find(ListNode head, TreeNode node){
//            if(head == null)
//                return true;
//            if(node == null)
//                return false;
//            if(head.val != node.val)
//                return false;
//            if(find(head.next, node.left) == true)
//                return true;
//            if(find(head.next, node.right) == true)
//                return true;
//            return false;
//        }

}
