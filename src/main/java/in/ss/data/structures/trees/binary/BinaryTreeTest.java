package in.ss.data.structures.trees.binary;

class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.setRoot(new Node(1));
        tree.getRoot().setLeft(new Node(2));
        tree.getRoot().setRight(new Node(3));

        tree.getRoot().getLeft().setLeft(new Node(4));
        tree.getRoot().getLeft().setRight(new Node(5));

        System.out.println("minimum depth of tree : " + tree.minimumDepth());

    }

}
