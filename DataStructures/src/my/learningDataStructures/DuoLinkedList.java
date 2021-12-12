package my.learningDataStructures;

public class DuoLinkedList<Thing> {
    private DuoNode<Thing> firstNode;
    private DuoNode<Thing> lastNode;
    private int sizeCount;

    public DuoLinkedList() {
        this.firstNode = null;
        this.lastNode = null;
        this.sizeCount = 0;
    }

        public int size () {
        return sizeCount;
    }

        public DuoNode<Thing> getNode ( int index){
        DuoNode<Thing> auxNode = firstNode;

        for (int j = 0; (j < index) && (auxNode != null); j++) {
            auxNode = auxNode.getFrontReference();
        }
        return auxNode;
    }
        public Thing get ( int index){
        return getNode(index).getContent();
    }

        public void add (Thing content,int index){
        indexValidationAdd(index);

        DuoNode<Thing> newNode = new DuoNode<>(content);
        DuoNode<Thing> indexedNode = getNode(index);

        if (sizeCount == 0) { // SE VAZIO
            firstNode = newNode;
            lastNode = newNode;
        } else if (index <= 0) { // SE PRIMEIRO
            newNode.setFrontReference(indexedNode);
            indexedNode.setBackReference(newNode);
            firstNode = newNode;
        } else if (index == sizeCount) { // SE ULTIMO
            newNode.setBackReference(getNode(index - 1));
            getNode(index - 1).setFrontReference(newNode);
            lastNode = newNode;
        } else if (index > 0 && index < sizeCount) { // SE NO MEIO
            DuoNode<Thing> anteriorNode = indexedNode.getBackReference();

            newNode.setFrontReference(indexedNode);
            newNode.setBackReference(indexedNode.getBackReference());
            indexedNode.setBackReference(newNode);
            anteriorNode.setFrontReference(newNode);
        } else {
            throw new IndexOutOfBoundsException("Something goes wrong in: DuoLinkedList[class] > add[method]");
        }
        sizeCount++;
    }
        public void addEnd (Thing content){
        DuoNode<Thing> newNode = new DuoNode<>(content);
        newNode.setFrontReference(null);
        newNode.setBackReference(lastNode);
        if (firstNode == null) {
            firstNode = newNode;
        }
        if (lastNode != null) {
            lastNode.setFrontReference(newNode);
        }
        lastNode = newNode;
        sizeCount++;
    }
        public void addFirst (Thing content){
        DuoNode<Thing> newNode = new DuoNode<>(content);
        newNode.setBackReference(null);
        newNode.setFrontReference(firstNode);
        if (lastNode == null) {
            lastNode = newNode;
        }
        if (firstNode != null) {
            firstNode.setBackReference(newNode);
        }
        firstNode = newNode;
        sizeCount++;
    }
        public void changeValue (Thing content,int index){
        indexValidation(index);
        DuoNode<Thing> indexedNode = getNode(index);
        DuoNode<Thing> changedNode = new DuoNode<>(content);

        changedNode.setFrontReference(indexedNode.getFrontReference());
        changedNode.setBackReference(indexedNode.getBackReference());
        if (indexedNode.getBackReference() != null) {
            indexedNode.getBackReference().setFrontReference(changedNode);
        } else {
            firstNode = changedNode;
        }
        if (indexedNode.getFrontReference() != null) {
            indexedNode.getFrontReference().setBackReference(changedNode);
        }

    }
        public void remove ( int index){
        indexValidation(index);

        if (index == 0) {
            firstNode = firstNode.getFrontReference();
        } else if (index == sizeCount - 1) {
            lastNode = lastNode.getBackReference();
            lastNode.setFrontReference(null);
        } else {
            getNode(index + 1).setBackReference(getNode(index - 1));
            getNode(index - 1).setFrontReference(getNode(index + 1));
        }
        sizeCount--;
    }

        private void indexValidationAdd ( int index){
        if (index > size()) {
            throw new IndexOutOfBoundsException("Index[" + index + "] can't be higher than Size[" + size() + "].");
        } else if (index < 0) {
            throw new IndexOutOfBoundsException("Index[" + index + "] can't be lower than 0");
        }
    }
        private void indexValidation ( int index){
        if (index >= size()) {
            throw new IndexOutOfBoundsException("Index[" + index + "] can't be equal or higher than Size[" + size() + "].");
        } else if (index < 0) {
            throw new IndexOutOfBoundsException("Index[" + index + "] can't be lower than 0");
        }
    }

        @Override
        public String toString () {
        DuoNode runNode = firstNode;

        String retString = "DuoLinkedList {" + size() + "} {";
        while (true) {
            if (runNode != null) {
                retString += runNode.getContent();
                runNode = runNode.getFrontReference();
                if (runNode != null) {
                    retString += ",";
                }
            } else {
                break;
            }
        }
        retString += "}";

        return retString;
    }
}
