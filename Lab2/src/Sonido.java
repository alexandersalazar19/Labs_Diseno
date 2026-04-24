public class Sonido{
    private boolean sonidoEncendido=false;

    public void encenderSonido(){
        sonidoEncendido=true;
        System.out.println("+ Sonido Encendido");
    }
    public void apagarSonido(){
        sonidoEncendido=false;
        System.out.println("- Sonido Apagado");
    }
}