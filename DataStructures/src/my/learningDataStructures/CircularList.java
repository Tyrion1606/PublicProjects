package my.learningDataStructures;

public class CircularList<Thing> {
    private Node<Thing> tailNode;
    private int sizeCount;

    public CircularList() {
        this.tailNode = null;
        this.sizeCount = 0;
    }

    public int size(){
        return sizeCount;
    }

    public Node<Thing> getNode(int index) {
        Node<Thing> auxNode = tailNode;

        for(int j = 0 ; (j < index) && (auxNode != null) ; j++){
            auxNode = auxNode.getReference();
        }
        return auxNode;
    }
    public Thing get(int index){
        return getNode(index).getContent();
    }

    public void add(Thing content , int index){
        indexValidationAdd(index);

        Node<Thing> newNode = new Node<>(content);
        Node<Thing> auxNode = getNode(index-1);
        if(this.isEmpty()){
            tailNode = newNode;
            newNode.setReference(tailNode);
        } else{
            if (index == size()){ // se ultimo
                newNode.setReference(tailNode);
                auxNode.setReference(newNode);
            } else if(index == 0){ // se primeiro
                tailNode = newNode;
                newNode.setReference(auxNode);
                getNode(sizeCount).setReference(tailNode);
            } else { // se meio
                newNode.setReference(getNode(index));
                getNode(index-1).setReference(newNode);
            }
        }
        sizeCount++;
    }
    public void remove(int index){
        indexValidation(index);
        Node<Thing> deletedNode = getNode(index);
        if (deletedNode == tailNode){
            getNode(sizeCount-1).setReference(deletedNode.getReference());
            tailNode = tailNode.getReference();
        } else{
            getNode(index-1).setReference(getNode(index+1));
        }
        sizeCount--;
    }
    public void setValue(Thing content , int index){
        remove(index);
        add(content,index);
    }

    public boolean isEmpty(){
        return (tailNode == null);
    }

    private void indexValidation(int index){
        if(index >= size()){
            throw new IndexOutOfBoundsException("Index[" + index + "] can't be equal or higher than Size[" + size() + "].");
        } else if(index < 0){
            throw new IndexOutOfBoundsException("Index[" + index + "] can't be lower than 0");
        }
    }
    private void indexValidationAdd(int index){
        if(index > size()){
            throw new IndexOutOfBoundsException("Index[" + index + "] can't be higher than Size[" + size() + "].");
        } else if(index < 0){
            throw new IndexOutOfBoundsException("Index[" + index + "] can't be lower than 0");
        }
    }

    @Override
    public String toString() {
        Node runNode = tailNode;

        String retString = "CircularList{";
        while (true){
            if (runNode != null){
                if (runNode.getReference() != tailNode){
                    retString += runNode.getContent();
                    runNode = runNode.getReference();
                    if (runNode != null){
                        retString += ",";
                    }
                }
                else {
                    retString += runNode.getContent();
                    break;
                }
            }
            else{
                break;
            }
        }
        retString += "}";
        return retString;
    }
}