package my.learningDataStructures;

public class BinaryTree<Thing extends Comparable<Thing>> {
    private BinaryNode<Thing> root;

    //CONSTRUCTOR
    public BinaryTree() {
        this.root = null;
    }

    //MÉTODOS DA CLASSE
        // INSERT
    public void insert(Thing content){
        BinaryNode<Thing> newNode = new BinaryNode<>(content);
        root = searchInsert(root, newNode);
    }
    public BinaryNode<Thing> searchInsert(BinaryNode<Thing> current, BinaryNode<Thing> newNode){
        if(current == null){
            return newNode;
        }else if(newNode.getContent().compareTo(current.getContent()) < 0){
            current.setLeftNode(searchInsert(current.getLeftNode(), newNode));
        }else {
            current.setRightNode((searchInsert(current.getRightNode(), newNode)));
        }
        return current;
    }
        // REMOVE
    public void remove(Thing content){
        try{
            BinaryNode<Thing> current = this.root;
            BinaryNode<Thing> father = null;
            BinaryNode<Thing> child = null;
            BinaryNode<Thing> temp = null;

            while (current != null && current.getContent().equals(content)){
                father = current;
                if (content.compareTo(current.getContent()) < 0){
                    current = current.getLeftNode();
                }else {
                    current = current.getRightNode();
                }
            }

            if(current == null){
                System.out.println("CONTENT NOT FOUND. try");
            }

            if (father == null){
                if (current.getRightNode() == null) {
                    this.root = current.getLeftNode();
                }else if (current.getLeftNode() == null) {
                    this.root = current.getRightNode();
                }else {
                    for(temp = current, child = current.getLeftNode();
                    child.getRightNode() != null;
                    temp = child, child = child.getLeftNode()){
                        //não entendi essa parte[rever depois]
                        if (child != current.getLeftNode()){
                            temp.setRightNode(child.getLeftNode());
                            child.setLeftNode(root.getLeftNode());
                        }
                    }
                    child.setRightNode(root.getRightNode());
                    root = child;
                }
            }else if (current.getRightNode() == null){
                if (father.getLeftNode() == current){
                    father.setLeftNode(current.getLeftNode());
                }else {
                    father.setRightNode(current.getLeftNode());
                }
            }else if (current.getLeftNode() == null){
                if (father.getLeftNode() == current){
                    father.setLeftNode(current.getRightNode());
                }else {
                    father.setRightNode(current.getRightNode());
                }
            }else{
                for(temp = current, child = current.getLeftNode();
                child.getRightNode() != null;
                temp = child, child = child.getRightNode()){
                    if (child != current.getLeftNode()){
                        temp.setRightNode(child.getLeftNode());
                        child.setLeftNode(current.getLeftNode());
                    }
                    child.setRightNode(current.getRightNode());
                    if (father.getLeftNode() == current){
                        father.setLeftNode(child);
                    }else {
                        father.setRightNode(child);
                    }
                }
            }
        } catch (NullPointerException erro){
            System.out.println("\nCONTENT NOT FOUND. catch");
        }
    }

    //DISPLAY
        // IN ORDER MOSTRA OS VALORES EM ORDEM CRECENTE
    public void displayInOrder(){
        System.out.print("\n exibindo InOrder:  ");
        searchInOrder(this.root);
    }
    private void searchInOrder(BinaryNode<Thing> current){
        if(current!=null){
            searchInOrder(current.getLeftNode());
            System.out.print(current.getContent() + ", ");
            searchInOrder(current.getRightNode());
        }
    }
        // PRE ORDER PRIMEIRO EXIBE DEPOIS VISITA O PROXIMO NÓ A ESQUERDA
    public void displayPreOrder(){
        System.out.print("\n exibindo PreOrder: ");
        searchPreOrder(this.root);
    }
    private void searchPreOrder(BinaryNode<Thing> current){
        if(current!=null){
            System.out.print(current.getContent() + ", ");
            searchPreOrder(current.getLeftNode());
            searchPreOrder(current.getRightNode());
        }
    }
        // POS ORDER PRIMEIRO VISITA O NÓ MAIS PROFUNDO(PRIMEIRO ESQUERDA DEPOIS DIREITA) DEPOIS EXIBE
    public void displayPosOrder(){
        System.out.print("\n exibindo PosOrder: ");
        searchPosOrder(this.root);
    }
    private void searchPosOrder(BinaryNode<Thing> current){
        if(current!=null){
            searchPosOrder(current.getLeftNode());
            searchPosOrder(current.getRightNode());
            System.out.print(current.getContent() + ", ");
        }
    }
    /*
        //DISPLAY TREE MOSTRA DE FORMA GRÁFICA
    public void displayTree(){
            System.out.println("\n exibindo ARVORE");
            searchPosOrder(this.root);
        }
    private void searchTree(BinaryNode<Thing> current){
        if(current!=null){
            System.out.print(current.getContent() + ", ");
            searchTree(current.getLeftNode());
            searchTree(current.getRightNode());
        }
    }*/
}
