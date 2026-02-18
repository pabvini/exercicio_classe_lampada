package exercicio.lampada;

public class Main {
    public static void main(String[] args){

        Lampada lampadaDaCozinha = new Lampada(false);

        System.out.println(lampadaDaCozinha.getEstado());

        lampadaDaCozinha.ligarLampada();
        System.out.println(lampadaDaCozinha.getEstado());

        lampadaDaCozinha.desligarLampada();
        System.out.println(lampadaDaCozinha.getEstado());

    }
}
