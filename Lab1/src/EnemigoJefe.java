import java.util.ArrayList;

public class EnemigoJefe extends Enemigo{
    private ArrayList<String> poderes; //atributo pesado

    public EnemigoJefe(String nombre,int vida,int fuerza,int velocidad,String posicion,ArrayList<String> poderes){
        super(nombre,vida,fuerza,velocidad,posicion);
        this.poderes=poderes;
    }

    public void clearPoderes(){poderes.clear();}

    public void addPoder(String poder){poderes.add(poder);}

    @Override
    public Enemigo clone(){
        EnemigoJefe copia=(EnemigoJefe) super.clone(); //copia superficial del jefe para sus atributos
        copia.poderes=new ArrayList<String>(this.poderes); //copia profunda de los poderes del jefe para cambiarlos y agregarle nuevos
        return copia;
    }

    @Override
    public String getAtributos(){
        return super.getAtributos()+
                "\nPoderes: "+poderes;
    }
}