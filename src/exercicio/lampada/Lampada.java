package exercicio.lampada;

public class Lampada {
    private boolean estado;

    public Lampada(boolean estado){
        this.estado = estado;
    }

    public void ligarLampada(){
        estado = true;
    }

    public void desligarLampada(){
        estado = false;
    }

    public boolean getEstado(){
        return estado;
    }

}