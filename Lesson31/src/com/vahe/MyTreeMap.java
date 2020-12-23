package com.vahe;

public class MyTreeMap {

    private Node root;


    public void put(int key, String value) {
        if (this.root == null) {
            this.root = new Node();
            this.root.setKey(key);
            this.root.setValue(value);
        } else {
            if (key > this.root.getKey()) {
                Node node = new Node(key, value);
                this.root.setRight(node);
            }
        }
    }

    public String get(int key) {
        return getByNode(key, root);
    }

    private String getByNode(int key, Node node) {

        if (node == null) {
            return null;
        }

        if (node.getKey() == key) {
            return node.getValue();
        }

        if (key > node.getKey()) {
            return getByNode(key, node.getRight());
        } else {
            return getByNode(key, node.getLeft());
        }
    }

}
