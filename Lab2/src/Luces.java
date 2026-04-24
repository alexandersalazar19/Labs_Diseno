public class Luces{
    private boolean lucesEncendidas=false;

    public void encenderLuces(){
        lucesEncendidas=true;
        System.out.println("+ Luces Encendidas");
    }
    public void apagarLuces(){
        lucesEncendidas=false;
        System.out.println("- Luces Apagadas");
    }
}