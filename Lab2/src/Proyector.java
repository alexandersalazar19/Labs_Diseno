public class Proyector{
    private boolean proyectorEncendido=false;

    public void encenderProyector(){
        proyectorEncendido=true;
        System.out.println("+ Proyector Encendido");
    }
    public void apagarProyector(){
        proyectorEncendido=false;
        System.out.println("- Proyector Apagado");
    }
}