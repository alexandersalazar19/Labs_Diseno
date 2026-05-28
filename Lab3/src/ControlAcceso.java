public abstract class ControlAcceso{
    protected String empleado;
    protected String idTarjeta;

    public ControlAcceso(String empleado,String idTarjeta){
        this.empleado=empleado;
        this.idTarjeta=idTarjeta;
    }

    private void leerTarjetaRFID(){
        System.out.println("-Paso 1:");
        System.out.println("Leyendo tarjeta RFID...");
        System.out.println("Tarjeta detectada: "+idTarjeta);
    }

    private void registrarIntento(boolean autorizado){
        System.out.println("\n-Paso 3:");
        System.out.println("Registrando intento en bitacora...");
        if(autorizado) System.out.println("ACCESO AUTORIZADO");
        else System.out.println("ACCESO DENEGADO");
    }

    private void liberarCerrojo(){
        System.out.println("\n-Paso 4:");
        System.out.println("Enviando pulso electrico...");
        System.out.println("Cerrojo desbloqueado.");
    }

    public abstract boolean validarPermisos();

    public final void procesarAcceso(){
        leerTarjetaRFID();
        boolean autorizado=validarPermisos();
        registrarIntento(autorizado);
        if(autorizado) liberarCerrojo();
        System.out.println("--------------------------------");
    }
}