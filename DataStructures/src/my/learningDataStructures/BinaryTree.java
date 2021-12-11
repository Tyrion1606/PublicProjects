package my.learningDataStructures;

public class BinaryTree<Thing extends Comparable<Thing>> {
    private BinaryNode<Thing> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(Thing content){
        BinaryNode<Thing> newNode = new BinaryNode<>(content);
        root = search(root, newNode);
    }
    public BinaryNode<Thing> search(BinaryNode<Thing> actual, BinaryNode<Thing> newNode){
        if(actual == null){
            return newNode;
        }else if(newNode.getContent().compareTo(actual.getContent()) < 0){
            actual.setLeftNode(search(actual.getLeftNode(), newNode));
        }else {
            actual.setRightNode((search(actual.getRightNode(), newNode)));
        }
        return actual;
    }

    public void displayInOrder(){
        System.out.println("\n exibindo InOrder");
        searchInOrder(this.root);
    }
    private void searchInOrder(BinaryNode<Thing> actual){
        if(actual!=null){
            searchInOrder(actual.getLeftNode());
            System.out.println(actual.getContent() + ", ");
            searchInOrder(actual.getRightNode());
        }
    }

    public void displayPosOrder(){
        System.out.println("\n exibindo PosOrder");
        searchPosOrder(this.root);
    }
    private void searchPosOrder(BinaryNode<Thing> actual){
        if(actual!=null){
            searchPosOrder(actual.getLeftNode());
            System.out.println(actual.getContent() + ", ");
            searchPosOrder(actual.getRightNode());
        }
    }

}
