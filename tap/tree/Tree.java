package tap.tree;

import lombok.Data;

@Data
public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInorder(){
        if(root != null) {
            root.traverseInOrder();
        }
    }

    public TreeNode get(int val) {
        if (root != null) {
            return root.get(val);
        }

        return null;
    }
}
