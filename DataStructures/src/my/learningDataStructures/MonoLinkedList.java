package my.learningDataStructures;

public class MonoLinkedList<Thing> {
    Node<Thing> entryReference;

    public MonoLinkedList(){
        this.entryReference = null;
    }

    public int size(){
        int x = 0;
        Node<Thing> runNodeReference = entryReference;

        while (runNodeReference != null){
            x++;
            if (runNodeReference.getReference() != null){
                runNodeReference = runNodeReference.getReference();
            } else {
                break;
            }
        }

        return x;
    }

    public void add(Thing content , int i){
        Node<Thing> newNode = new Node<>(content);
        Node<Thing> auxNode = entryReference;
        Node<Thing> secondary;

        if(this.isEmpty()){
            entryReference = newNode;
            return;
        } else{
            for(int j = 0 ; j < i ; j++){
                if (auxNode.getReference() != null){
                    auxNode = auxNode.getReference();
                } else{
                    break;
                }
            }
            newNode.setReference(auxNode.getReference());

            if (i > (size() - 1)){
                auxNode.setReference(newNode);
            } else if(i < 0){
                throw new IndexOutOfBoundsException("Index[" + i + "] can't be lower than 0");
            } else if(i == 0){
                entryReference = newNode;
            } else {
                secondary = getPointer(auxNode);
                secondary.setReference(newNode);
            }
        }
    }

    public void remove(int i){
        indexValidation(i);
        Node<Thing> deletedNode = getNode(i);
        if (getPointer(deletedNode) == null){
            entryReference = deletedNode.getReference();
        } else{
            getPointer(deletedNode).setReference(deletedNode.getReference());
        }
    }

    public Thing get(int index){
        return getNode(index).getContent();
    }

    public boolean isEmpty(){
        return (entryReference == null);
    }

    private Node<Thing> getNode(int index){
        indexValidation(index);
        Node<Thing> auxNode = entryReference;
        Node<Thing> retNode = null;
        for(int j = 0 ; j < this.size() ; j++){
           retNode = auxNode;
           auxNode = auxNode.getReference();
            if(j == index){
                break;
            }
        }
        return retNode;
    }

    private Node<Thing> getPointer(Node<Thing> pointed){
        Node<Thing> auxNode = entryReference;
        if (entryReference.getReference() == pointed){
            return auxNode;
        }
        for(int j = 0 ; j < this.size() ; j++){
            if (auxNode.getReference() != null){
                auxNode = auxNode.getReference();
            } else{
                return null;
            }

            if(auxNode.getReference() == pointed){
                break;
            }
        }
        return auxNode;
    }

    private void indexValidation(int index){
        if(index >= size()){
            throw new IndexOutOfBoundsException("Index[" + index + "] can't be equal or higher than Size[" + size() + "].");
        } else if(index < 0){
            throw new IndexOutOfBoundsException("Index[" + index + "] can't be lower than 0");
        }
    }

    @Override
    public String toString() {
        Node runNode = entryReference;

        String retString = "SingleLinkedList{";
        while (true){
            if (runNode != null){
                retString += runNode.getContent();
                runNode = runNode.getReference();
                if (runNode != null){
                    retString += ",";
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
