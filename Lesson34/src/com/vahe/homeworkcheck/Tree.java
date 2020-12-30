package com.vahe.homeworkcheck;

public class Tree {

    public static void main(String[] args) {
// cltrl + alt + l
        //alt + insert
        Node<String> A = new Node<>("A");
        Node<String> B = new Node<>("B");
        Node<String> C = new Node<>("C");
        Node<String> D = new Node<>("D");
        Node<String> E = new Node<>("E");
        Node<String> F = new Node<>("F");
        Node<String> G = new Node<>("G");
        Node<String> H = new Node<>("H");
        Node<String> I = new Node<>("I");
        Node<String> J = new Node<>("J");
        Node<String> K = new Node<>("K");

        Node<String> root = A;
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        D.left = H;
        D.right = I;
        E.left = J;
        C.left = F;
        C.right = G;
        G.left = K;

        preOrderTraverse(root);

    }


    public static <T> void preOrderTraverse(Node<T> node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    public static <T> void inOrderTraverse(Node<T> node) {
        if (node == null)
            return;

        inOrderTraverse(node.left);
        System.out.print(node.data + " ");
        inOrderTraverse(node.right);
    }

    static class Node<String> {
        String data;
        Node<String> left;
        Node<String> right;

        public Node(String data) {
            this.data = data;
        }
    }
}


