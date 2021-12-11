package my.learningDataStructures;

public class Main {
    public static void main(String[] args){
        testCircularList();
    }

    // PILHA
    public static void testStack() {
        System.out.println("=================================");

        Stack minhaPilha = new Stack();
        minhaPilha.push(new Node(0));
        minhaPilha.push(new Node(1));
        minhaPilha.push(new Node(2));
        minhaPilha.push(new Node(3));
        minhaPilha.push(new Node(4));

        System.out.println(minhaPilha);
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);
        System.out.println("=================================");
    }

    // FILA
    public static void testQueue() {
        System.out.println("=================================");

        Queue<Object> minhaFila = new Queue<Object>();
        minhaFila.enqueue(0);
        minhaFila.enqueue(1);
        minhaFila.enqueue(2);
        minhaFila.enqueue(3);
        minhaFila.enqueue(4);

        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
        minhaFila.enqueue(5);
        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);
        minhaFila.enqueue("teste");
        System.out.println(minhaFila);
        System.out.println("=================================");
    }

    //LISTA MONOENCADEADA
    public static void testMonoList() {
        System.out.println("=================================");

        MonoLinkedList minhaListaMono = new MonoLinkedList();
        minhaListaMono.add(0,0);
        minhaListaMono.add(1,1);
        minhaListaMono.add(2,2);
        minhaListaMono.add(3,3);
        minhaListaMono.add(4,4);
        minhaListaMono.add(5,5);
        minhaListaMono.add(6,6);
        System.out.println(minhaListaMono);
        System.out.println("size: " + minhaListaMono.size());
        minhaListaMono.remove(6);
        System.out.println(minhaListaMono);

        System.out.println("=================================");
    }

    //LISTA DUOENCADEADA
    public static void testDuoList(){
        System.out.println("=================================");
        DuoLinkedList minhaListaDuo = new DuoLinkedList();

        System.out.println(minhaListaDuo);
        minhaListaDuo.addEnd(2);
        System.out.println(minhaListaDuo);
        minhaListaDuo.addEnd(3);
        System.out.println(minhaListaDuo);
        minhaListaDuo.addFirst(4);
        System.out.println(minhaListaDuo);
        minhaListaDuo.addFirst(5);
        System.out.println(minhaListaDuo);
        minhaListaDuo.addFirst(6);
        System.out.println(minhaListaDuo);
        minhaListaDuo.addFirst(7);
        System.out.println(minhaListaDuo);
        System.out.println(minhaListaDuo.getNode(3));
        minhaListaDuo.add(99, 3);
        System.out.println(minhaListaDuo);
        System.out.println(minhaListaDuo.getNode(2));
        minhaListaDuo.changeValue(88, 3);
        System.out.println(minhaListaDuo);
        minhaListaDuo.add(333, 0);
        System.out.println(minhaListaDuo);
        minhaListaDuo.add(333, minhaListaDuo.size());
        System.out.println(minhaListaDuo);
        minhaListaDuo.add(333, 5);
        System.out.println(minhaListaDuo);
        minhaListaDuo.add(20, minhaListaDuo.size()-1);
        System.out.println(minhaListaDuo);
        System.out.println(minhaListaDuo.get(5));
        System.out.println(minhaListaDuo);
        minhaListaDuo.remove(5);
        System.out.println(minhaListaDuo);
        System.out.println(minhaListaDuo.getNode(4));
        System.out.println(minhaListaDuo.getNode(5));
        System.out.println(minhaListaDuo.getNode(6));
        System.out.println(minhaListaDuo);
        minhaListaDuo.remove(0);
        System.out.println(minhaListaDuo);
        minhaListaDuo.remove(minhaListaDuo.size()-1);
        System.out.println(minhaListaDuo);
        System.out.println("=================================");
    }

    //LISTA CIRCULAR
    public static void testCircularList(){
        CircularList<Object> minhaListaCircular = new CircularList<Object>();

        for (int j = 0 ; j < 10 ; j++){
            minhaListaCircular.add(j,j);
        }

        System.out.println(minhaListaCircular);
        System.out.println("size: " + minhaListaCircular.size());

        minhaListaCircular.add(99,0);
        System.out.println(minhaListaCircular);
        minhaListaCircular.add(99, minhaListaCircular.size());
        System.out.println(minhaListaCircular);
        minhaListaCircular.add(99, 5);
        System.out.println(minhaListaCircular);
        System.out.println("size: " + minhaListaCircular.size());

        minhaListaCircular.remove(minhaListaCircular.size()-1);
        System.out.println(minhaListaCircular);
        minhaListaCircular.remove(5);
        System.out.println(minhaListaCircular);
        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);
        System.out.println("size: " + minhaListaCircular.size());

        for (int j = 0 ; j < 10 ; j++){
            minhaListaCircular.setValue(0,j);
            System.out.println(minhaListaCircular);

        }

    }
}
