package my.learningcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Float> notas = new ArrayList<Float>();

        for(int i=0 ; i<7 ; i++){
            notas.add(scan.nextFloat());
        }
        System.out.println(notas);
        // 7 8,5 9,3 5 7 0 3,6

        System.out.println(notas.indexOf(5f));
        notas.add(4, 8f);
        System.out.println(notas);
        notas.set(notas.indexOf(5f), 6f);
        System.out.println(notas);
        System.out.println("nota 5 esta na lista: " + notas.contains(5f));

        System.out.println(notas.get(2));
        System.out.println(Collections.min(notas));

        float soma = 0f;
        for (float nota : notas) {
            soma += nota;
        }

        System.out.printf("soma: %.2f", soma);
        System.out.printf("\nmedia: %.2f\n", (soma/notas.size()));

        Iterator<Float> iterator = notas.iterator();
        while (iterator.hasNext()){
            Float next = iterator.next();
            if(next< 7) iterator.remove();

        }


        System.out.println(notas);

        notas.clear();

        System.out.println(notas);


    }
}
