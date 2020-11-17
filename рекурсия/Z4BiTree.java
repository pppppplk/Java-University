package com.company;

public class Z4BiTree {
    Z4Node root;
    public Z4BiTree(Z4Node node){

        this.root = node;
    }

    private Z4Node addRecursive(Z4Node current, int value) {
        if (current == null) {
            return new Z4Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            //значение существует
            return current;
        }

        return current;
    }
    // поиск узла по значению
    private boolean containsNodeRecursive(Z4Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {

        return containsNodeRecursive(root, value);
    }

    public void add(int value) {

        root = addRecursive(root, value);
    }

    // создаем дерево
    public Z4BiTree createBinaryTree() {
        Z4BiTree bitree = new Z4BiTree(root);

        bitree.add(6);
        bitree.add(4);
        bitree.add(8);
        bitree.add(3);
        bitree.add(5);
        bitree.add(7);
        bitree.add(9);

        return bitree;
    }

    public void traverseInOrder(Z4Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Z4Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Z4Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }


}