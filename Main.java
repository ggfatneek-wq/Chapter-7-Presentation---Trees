public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(40);
        tree.insert(20);
        tree.insert(60);
        tree.insert(10);
        tree.insert(30);

        System.out.println("Archive IDs in order:");
        tree.display(tree.root);
        System.out.println();
    }
}

class Node {
    int id;
    Node left, right;

    Node(int id) {
        this.id = id;
    }
}

class BinarySearchTree {
    Node root;

    void insert(int id) {
        root = add(root, id);
    }

    Node add(Node node, int id) {
        if (node == null) {
            return new Node(id);
        }

        if (id < node.id) {
            node.left = add(node.left, id);
        } else if (id > node.id) {
            node.right = add(node.right, id);
        }

        return node;
    }

    void display(Node node) {
        if (node != null) {
            display(node.left);
            System.out.print(node.id + " ");
            display(node.right);
        }
    }

    // Type findMin() here during the recording.
}
