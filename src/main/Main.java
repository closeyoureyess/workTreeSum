package main;

public class Main {
    public static void main(String[] args) {
        SubTree myTree = new SubTree();

        myTree.add(30);
        myTree.add(15);
        myTree.add(35);
        myTree.add(14);
        myTree.add(16);
        myTree.add(34);
        myTree.add(12);
        myTree.add(40);
        myTree.add(13);

        System.out.println("Сумма: " + myTree.operateSum());
    }
}