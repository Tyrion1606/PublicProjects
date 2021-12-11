package my.learningDataStructures;

public class Node <Thing> {
    private Thing content;
    private Node<Thing> reference;

    // content get/set
    public Thing getContent() {
        return content;
    }

    public void setContent(Thing content) {
        this.content = content;
    }

    // reference get/set
    public Node<Thing> getReference() {
        return reference;
    }

    public void setReference(Node<Thing> reference) {
        this.reference = reference;
    }

    public Node(Thing content) {
        this.content = content;
        this.reference = null;
    }

    @Override
    public String toString() {
        String retString = ("Node: [" + content + "] -> {");
        if (reference != null){
            retString += (reference.getContent() + "}");
        } else{
            retString += ("null}");
        }
        return retString;
    }
}