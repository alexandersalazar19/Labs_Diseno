import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Random random=new Random();
        EnemigoJefe jefeOriginal=new EnemigoJefe("Jefe Principal",10000,50,30,"X:1000 Y:1000",new ArrayList<String>(Arrays.asList("Fuego","Agua","Electrico","Aire","Tierra")));
        RegistroDePrototipos.addPrototipo("Jefe",jefeOriginal);
        System.out.println("+++++ JEFE ORIGINAL ANTES DE CLONAR +++++");
        System.out.println(jefeOriginal.getAtributos());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        System.out.println("===== JEFES CLONES ANTES DE CAMBIOS =====");
        EnemigoJefe[] clones=new EnemigoJefe[5];
        for(int i=0;i<5;i++){
            clones[i]=(EnemigoJefe) RegistroDePrototipos.getPrototipo("Jefe");
            System.out.println(clones[i].getAtributos());
            System.out.println();
        }
        System.out.println("=========================================");

        ArrayList<String> poderes=new ArrayList<String>(Arrays.asList("Fuego","Agua","Electrico","Aire","Tierra"));

        System.out.println("===== JEFES CLONES DESPUES DE CAMBIOS =====");
        for(int i=0;i<5;i++){
            clones[i].setNombre("Jefe");
            clones[i].setVida((i+15)*500);
            clones[i].setFuerza((i+3)*5);
            clones[i].setVelocidad((i+1)*5);
            clones[i].setPosicion("X:"+random.nextInt(1000)+" Y:"+random.nextInt(1000));
            clones[i].clearPoderes();
            clones[i].addPoder(poderes.get(i));
            System.out.println(clones[i].getAtributos());
            System.out.println();
        }
        System.out.println("===========================================");

        System.out.println("+++++ JEFE ORIGINAL DESPUES DE CAMBIOS +++++");
        System.out.println(jefeOriginal.getAtributos());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
    }
}