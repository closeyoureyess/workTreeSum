package main;

public class SubTree implements MySet {
    private Integer value;
    private SubTree peak;
    private SubTree left;
    private SubTree right;

    public SubTree() {

    }

    public SubTree(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public SubTree getLeft() {
        return left;
    }

    public void setLeft(SubTree left) {
        this.left = left;
    }

    public SubTree getRight() {
        return right;
    }

    public void setRight(SubTree right) {
        this.right = right;
    }

    public SubTree getPeak() {
        return peak;
    }

    @Override
    public void add(Integer value) {
        if (peak == null) {
            peak = new SubTree(value);
            System.out.println("Parent: " + peak.getValue());
            return;
        }
        SubTree node = getPeak();
        while (node != null) {
            if (value < node.getValue()) {
                if (node.getLeft() == null) {
                    node.setLeft(new SubTree(value));
                    System.out.println("Left: " + value);
                    break;
                }
                node = node.getLeft();
            } else if (value > node.getValue()) {
                if (node.getRight() == null) {
                    node.setRight(new SubTree(value));
                    System.out.println("Right: " + value);
                    break;
                }
                node = node.getRight();
            }
        }
    }

    public int operateSum() {
        return peak.sumElements();
    }

    private int sumElements() {
        int sum = value;

        if (left != null) {
            sum += left.sumElements();
        }
        if (right != null) {
            sum += right.sumElements();
        }
        return sum;
    }
}
