package day18;

class Node {
    public int number;
    public Node left;
    public Node right;

    Node(int num) {
        number = num;
    }

    public void add(int num) {
        if (num < number) {
            if (left == null) {
                left = new Node(num);
            } else {
                left.add(num);
            }
        } else {
            if (right == null) {
                right = new Node(num);
            } else {
                right.add(num);
            }
        }
    }

//    public void printNode() {
//        System.out.println(number);
//        if (left != null) left.printNode();
//        if (right != null) right.printNode();
//    }
}
