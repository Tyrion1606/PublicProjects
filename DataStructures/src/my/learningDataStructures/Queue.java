package my.learningDataStructures;

public class Queue<Thing> {
    private Node<Thing> entry;

    public Queue(){
        this.entry = null;
    }

    // MÉTODOS DA FILA
    public void enqueue(Thing content){
        Node newNode = new Node(content);
        newNode.setReference(entry);
        entry = newNode;
    }

    public Thing first(){
        if (entry == null || entry.getReference() == null){
            return (Thing)entry;
        } else {
            Node temp = entry;
            while(true){
                if (temp.getReference() == null){
                    break;
                } else {
                    temp = temp.getReference();
                }
            }
            return (Thing)temp.getContent();
        }
    }

    public Thing dequeue(){
        Node temp = entry;

        if (temp == null || temp.getReference() == null){
            entry = null;
            return (Thing)temp.getContent();
        } else {
            Node first = temp.getReference();

            while(true){
                if (first.getReference() == null){
                    break;
                } else {
                    temp = temp.getReference();
                    first = temp.getReference();
                }
            }
            temp.setReference(null);
            return (Thing)first.getContent();
        }
    }

    public boolean isEmpty(){
        return entry == null;
    }

    @Override
    public String toString() {
        Node runNode = entry;

        String retString = "Queue(Fila) -->{";
        while (true){
            if (runNode != null){
                retString += runNode.getContent();
                runNode = runNode.getReference();
                if (runNode != null){
                    retString += " -> ";
                }
            }
            else{
                break;
            }
        }
        retString += "}-->";

        return retString;
    }
}