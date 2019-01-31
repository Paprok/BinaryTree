package com.codecool.krk.binaryTree;

public class BinaryTree {
    private Node root;

    public BinaryTree(int[] sortedlist) {
        this.root = new Node(sortedlist, 0, sortedlist.length-1);
    }
}

