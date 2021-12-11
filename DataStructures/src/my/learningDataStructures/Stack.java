package my.learningDataStructures;

public class Stack {

    private Node topOfStack;

    public Stack() {
        this.topOfStack = null;
    }

    // metodos da pilha
    public Node top(){
        return topOfStack;
    }
    public void push(Node newNode){
        Node oldTop = topOfStack;
        topOfStack = newNode;
        topOfStack.setReference(oldTop);
    }
    public Node pop(){
        if (this.isEmpty()) {
            return null;
        }
        Node poped = topOfStack;
        topOfStack = topOfStack.getReference();
        return poped;
    }
    public boolean isEmpty(){
        return topOfStack == null;
    }

    @Override
    public String toString() {
        Node runNode = topOfStack;

        String retString = "Stack{";
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
