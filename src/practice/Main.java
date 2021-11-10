package practice;

//SearchTree implementation from https://www.baeldung.com/java-binary-tree

public class Main {

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();
        t.givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements();
        t.givenABinaryTree_WhenDeletingElements_ThenTreeDoesNotContainThoseElements();

        BinaryTree tree = new BinaryTree();
        String treeValues = "9 59 4 3 20 12 6";
        String [] strValues = treeValues.split(" ");
        int [] intValues = new int[strValues.length];
        for (int i = 0; i < intValues.length; i++) {
            intValues[i] = Integer.parseInt(strValues[i]);
        }

        for (int i = 0; i < intValues.length; i++) {
            tree.add(intValues[i]);
        }

        tree.traverseInOrder(tree.root);
        System.out.println();
        tree.traversePreOrder(tree.root);
        System.out.println();
        tree.traversePostOrder(tree.root);
        System.out.println();
        tree.traverseLevelOrder();
    }
}
