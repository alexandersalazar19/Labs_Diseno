public class Main{
    public static void main(String[] args){
        System.out.println("========= INGRESAR A LA OFICINA ESTANDAR =========");
        ControlAcceso acceso1=new AccesoOficinaEstandar("Alexander Salazar","RFID-1001");
        acceso1.procesarAcceso();

        System.out.println("\n========= INGRESAR AL DATA CENTER =========");
        ControlAcceso acceso2=new AccesoDataCenter("Alexander Salazar","RFID-9001");
        acceso2.procesarAcceso();
    }
}