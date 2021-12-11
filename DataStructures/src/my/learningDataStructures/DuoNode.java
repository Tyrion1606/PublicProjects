package my.learningDataStructures;

public class DuoNode<Thing> {
    private Thing content;
    private DuoNode<Thing> frontReference;
    private DuoNode<Thing> backReference;

    public DuoNode(Thing content) {
        this.content = content;
    }

    public Thing getContent() {
        return content;
    }

    public void setContent(Thing content) {
        this.content = content;
    }

    public DuoNode<Thing> getFrontReference() {
        return frontReference;
    }

    public void setFrontReference(DuoNode<Thing> frontReference) {
        this.frontReference = frontReference;
    }

    public DuoNode<Thing> getBackReference() {
        return backReference;
    }

    public void setBackReference(DuoNode<Thing> backReference) {
        this.backReference = backReference;
    }

    @Override
    public String toString() {
        String retString = ("DuoNode: {" + backReference.getContent() +  "}[" + content +  "]{" + frontReference.getContent() +"}");
        return retString;
    }
}
