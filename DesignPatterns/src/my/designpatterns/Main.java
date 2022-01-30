package my.designpatterns;

public class Main {

    public static void main(String[] args) {

        SingleTonLazyHolder singleTonLazyHolder = SingleTonLazyHolder.getInstance();
        System.out.println(singleTonLazyHolder);
        singleTonLazyHolder = SingleTonLazyHolder.getInstance();
        System.out.println(singleTonLazyHolder);

    }
}
