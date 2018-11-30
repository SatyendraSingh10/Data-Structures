package in.ss.data.structures.trees.binary;

import lombok.Data;

@Data
class BinaryTree {
    Node root;

    public int minimumDepth() {
        return minimumDepth(root);
    }

    private int minimumDepth(Node node) {
        if (node == null)
            return 0;

        if (node.getLeft() == null && node.getRight() == null)
            return 1;

        if (null != node.getRight())
            return minimumDepth(node.getRight()) + 1;

        if (null != node.getLeft())
            return minimumDepth(node.getLeft()) + 1;

        return Math.min(minimumDepth(node.getRight()), minimumDepth(node.getLeft()) + 1);
    }
}
