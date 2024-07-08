
package observer;

public class Namorada implements ChegadaAniversarianteObserver {

    @Override
    public void chegou(ChegadaAniversarianteEvent event) {
        System.out.println("Desligar as luzes!");
        System.out.println("Todo mundo quieto, shhh!");
        System.out.println("Ebaaaa! parabéns :)");
    }
}
