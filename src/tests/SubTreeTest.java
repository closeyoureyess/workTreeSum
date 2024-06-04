package tests;

import main.SubTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubTreeTest {

    SubTree myTree = new SubTree();
    SubTree subTree;

    @Test
    public void testAdd() {

        //1
        myTree.add(30);
        subTree = myTree.getPeak();
        Assertions.assertEquals(30, subTree.getValue());

        //2 -
        myTree.add(15);
        Assertions.assertEquals(15, subTree.getLeft().getValue());

        //3
        myTree.add(35);
        Assertions.assertEquals(35, subTree.getRight().getValue());

        //4 L - L
        myTree.add(14);
        subTree = myTree.getPeak();
        Assertions.assertEquals(14, subTree.getLeft().getLeft().getValue());

        //6 L - R
        myTree.add(16);
        subTree = myTree.getPeak();
        subTree = subTree.getLeft().getRight();
        Assertions.assertEquals(16, subTree.getValue());

        //5 R - L
        myTree.add(34);
        subTree = myTree.getPeak();
        subTree = subTree.getRight().getLeft();
        Assertions.assertEquals(34, subTree.getValue());

        myTree.add(40);
        subTree = myTree.getPeak();
        Assertions.assertEquals(40, subTree.getRight().getRight().getValue());

    }
}