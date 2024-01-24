package tap.tree;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value == data) {
            return;
        }
        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder() {

        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.print(data +" ,");
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public TreeNode get(int val) {

        if (val == data) {
            return this;
        }
        if (val < data) {
            if (leftChild != null) {
                return leftChild.get(val);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(val);
            }
        }
        return null;
    }

}
