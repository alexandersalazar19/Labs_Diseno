public class AccesoOficinaEstandar extends ControlAcceso{
    public AccesoOficinaEstandar(String empleado, String idTarjeta){super(empleado, idTarjeta);}

    @Override
    public boolean validarPermisos(){
        System.out.println("\n-Paso 2:");
        System.out.println("Validando empleado activo en la base de datos...");
        return true;
    }
}