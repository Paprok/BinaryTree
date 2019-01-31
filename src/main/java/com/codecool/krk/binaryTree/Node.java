package com.codecool.krk.binaryTree;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int[] list, int first, int last) {
        int mid = (last-first)/2 +first;
        this.value = list[mid];
        if(mid<last){
            this.right = new Node(list, mid +1, last);
        }
        if(first<mid){
            this.left = new Node(list, first, mid-1);
        }
    }


    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
