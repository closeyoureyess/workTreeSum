package sumstack;

import java.util.Stack;

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

    /*public int operateSum() {
        return peak.sumElements();
    }*/

    public void sumElements() {
        Stack<SubTree> stack = new Stack();
        SubTree element = getPeak();
        int sum = 0;
        stack.push(element);

        while (!stack.isEmpty()) {
            element = stack.pop();

            sum += Integer.parseInt(String.valueOf(element));

            if (element.getLeft() != null) {
                stack.push(element.getLeft());
            }

            if (element.getRight() != null) {
                stack.push(element.getRight());
            }
        }
        System.out.println(sum);
    }

    @Override
    public String toString() {
        return "" + value;
    }
}

