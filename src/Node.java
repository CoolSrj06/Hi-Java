import java.util.Scanner;

class Node {
    int data;
    Node left, right,nextRight;

    public Node(int item) {
        data = item;
        left = right = null;
        nextRight = null;
    }
}

class BinaryTree {
    Node root;

    // Function to insert a new node with the given data
    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Function to insert values into the binary tree without rearrangement
    void insertValues(int[] values) {
        for (int value : values) {
            root = insert(root, value);
        }
    }

    // Inorder traversal of the binary tree with depth
    void inorderTraversal(Node root, int depth) {
        if (root != null) {
            inorderTraversal(root.left, depth + 1);
            System.out.println(getSpaces(depth) + root.data);
            inorderTraversal(root.right, depth + 1);
        }
    }


    // Helper method to generate spaces for tree-like structure
    String getSpaces(int count) {
        StringBuilder spaces = new StringBuilder();
        for (int i = 0; i < count; i++) {
            spaces.append("  ");
        }
        return spaces.toString();
    }


    void takeInput(Node node, String position) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value for the current " + position + " node (current value: " + node.data + "):");
        int data = scanner.nextInt();
        node.data = data;

        System.out.println("Does the " + position + " node of value " + node.data + " have a left child? (Enter Y/N):");
        char leftChoice = scanner.next().charAt(0);
        if (leftChoice == 'Y' || leftChoice == 'y') {
            node.left = new Node(0); // Create a new node
            takeInput(node.left, "left"); // Pass the left child for recursive input
        }

        System.out.println("Does the " + position + " node of value " + node.data + " have a right child? (Enter Y/N):");
        char rightChoice = scanner.next().charAt(0);
        if (rightChoice == 'Y' || rightChoice == 'y') {
            node.right = new Node(0); // Create a new node
            takeInput(node.right, "right"); // Pass the right child for recursive input
        }
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Creating the root node
        tree.root = new Node(0);

        // Taking input for the binary tree
        tree.takeInput(tree.root,"");

//        // Example values for each node in the binary tree
//        int[] values = { 50, 30, 70, 20, 40, 60, 80 };
//
//        // Inserting values into the binary tree without rearrangement
//        tree.insertValues(values);

        // Displaying the binary tree using inorder traversal
        System.out.println("Inorder Traversal of Binary Tree:");
        tree.inorderTraversal(tree.root,0);
    }
}
