package sumqueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
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

    public void sumElements() {
        Queue<SubTree> queue = new LinkedList<>();
        SubTree element = getPeak();
        int sum = 0;
        queue.add(element);

        while (!queue.isEmpty()) {
            element = queue.poll();
            System.out.println(element);

            sum += Integer.parseInt(String.valueOf(element));

            if (element.getLeft() != null) {
                queue.add(element.getLeft());
            }

            if (element.getRight() != null) {
                queue.add(element.getRight());
            }
        }
        System.out.println(sum);
    }

    @Override
    public String toString() {
        return "" + value;
    }
}

