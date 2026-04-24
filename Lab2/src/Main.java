public class Main{
    public static void main(String[] Args) throws InterruptedException{
        Luces luces=new Luces();
        Pantalla pantalla=new Pantalla();
        Proyector proyector=new Proyector();
        Sonido sonido=new Sonido();
        FachadaCineCasa cine=new FachadaCineCasa(luces,pantalla,proyector,sonido);

        cine.iniciarCineEnCasa();
        System.out.println();
        System.out.println("*** Viendo Pelicula ***");
        Thread.sleep(2000);
        System.out.println("*** Pelicula Terminada ***");
        System.out.println();
        cine.apagarCineEnCasa();
    }
}