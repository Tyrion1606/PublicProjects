package my.learningDataStructures;

public class BinaryNode<Thing extends Comparable<Thing>> {

    // ATTRIBUTES
    private Thing content;
    private BinaryNode<Thing> leftNode;
    private BinaryNode<Thing> rightNode;

    // CONSTRUCTOR
    public BinaryNode(Thing content) {
        this.content = content;
        this.leftNode = this.rightNode = null;
    }

    // GETTERS ANS SETTERS
    public Thing getContent() {
        return content;
    }
    public void setContent(Thing content) {
        this.content = content;
    }

    public BinaryNode<Thing> getLeftNode() {
        return leftNode;
    }
    public void setLeftNode(BinaryNode<Thing> leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryNode<Thing> getRightNode() {
        return rightNode;
    }
    public void setRightNode(BinaryNode<Thing> rightNode) {
        this.rightNode = rightNode;
    }

    // METHODS

    @Override
    public String toString() {
        String retString = ("DuoNode: {" + leftNode.getContent() +  "}[" + content +  "]{" + rightNode.getContent() +"}");
        return retString;
    }
}