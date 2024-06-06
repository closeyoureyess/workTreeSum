package sumstack;


import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        SubTree myTree = new SubTree();

        myTree.add(30);
        myTree.add(25);
        myTree.add(35);
        myTree.add(15);
        myTree.add(29);
        myTree.add(34);
        myTree.add(18);
        myTree.add(40);
        myTree.add(12);
        myTree.sumElements();

    }
}