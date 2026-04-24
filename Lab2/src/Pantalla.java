public class Pantalla{
    private boolean pantallaAbajo=false;

    public void bajarPantalla(){
        pantallaAbajo=true;
        System.out.println("+ Pantalla Abajo");
    }
    public void subirPantalla(){
        pantallaAbajo=false;
        System.out.println("- Pantalla Arriba");
    }
}