package com.example.demo;

class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTree {
    public static boolean contains(Node root, int value) {
        if(root == null){
            return false;
        }

        if(root.value == value){
            return  true;
        }

        /*if(root.left != null &&  value < root.value ){
            contains(root.left,value);
        }
        if(root.right != null && value > root.value ){
            contains(root.right,value);
        }
*/
        return value < root.value?contains(root.left,value):contains(root.right,value);

        //throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);

        System.out.println(contains(n2, 3));
    }
}
