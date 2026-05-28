import java.util.Scanner;

public class AccesoDataCenter extends ControlAcceso{
    public AccesoDataCenter(String empleado, String idTarjeta){super(empleado,idTarjeta);}

    @Override
    public boolean validarPermisos(){
        System.out.println("\n-Paso 2:");
        System.out.println("Validando empleado activo en la base de datos...");
        System.out.println("Validacion secundaria requerida.");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese PIN de seguridad de 4 digitos: ");
        int pin=scanner.nextInt();
        return pin==1234;
    }
}