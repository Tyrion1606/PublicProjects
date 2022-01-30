package my.designpatterns;
/*
* Minha interpretação:
*
* A ideia deste design pattern é manter apenas uma instancia de um objeto
* e reutilizá-la sempre que requisitada uma nova instancia.
 */

public class SingleTonLazyHolder {

    // Cria-se uma nova classe estática que guardará a instancia do nosso objeto
    private static class InstanceHolder{
        // aqui declara-se a instancia, fiz diferente do video
        // e não criei a instancia ainda pois acredito que ele confundiu
        public static SingleTonLazyHolder instance;
    }

    // Criando mas deixando o contrutor privado, a classe
    // NÃO poderá ser re-instanciada por "fora"
    private SingleTonLazyHolder() {
    }

    // Atravez deste método que a instancia está acessivel ao exterior
    public static SingleTonLazyHolder getInstance(){
        // Discordando da aula, para que o método ainda seja "Lazy faz-se
        // nescessário que a instancia só seja criada neste método
        // e não no instanceholder, sendo criada apenas no primeiro uso
        if(InstanceHolder.instance == null){
            InstanceHolder.instance = new SingleTonLazyHolder();
        }
        return InstanceHolder.instance;
    }
}
