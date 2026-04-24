public class FachadaCineCasa{
    private Luces luces;
    private Pantalla pantalla;
    private Proyector proyector;
    private Sonido sonido;

    public FachadaCineCasa(Luces luces,Pantalla pantalla,Proyector proyector,Sonido sonido){
        this.luces=luces;
        this.pantalla=pantalla;
        this.proyector=proyector;
        this.sonido=sonido;
    }

    public void iniciarCineEnCasa(){
        System.out.println("vvv Iniciando Cine en Casa vvv");
        luces.encenderLuces();
        pantalla.bajarPantalla();
        proyector.encenderProyector();
        sonido.encenderSonido();
        System.out.println("^^^ Cine en Casa Iniciado ^^^");
    }

    public void apagarCineEnCasa(){
        System.out.println("vvv Apagando Cine en Casa vvv");
        luces.apagarLuces();
        pantalla.subirPantalla();
        proyector.apagarProyector();
        sonido.apagarSonido();
        System.out.println("^^^ Cine en Casa Apagado ^^^");
    }
}