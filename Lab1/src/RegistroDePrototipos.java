import java.util.HashMap;

public class RegistroDePrototipos{
    private static HashMap<String,Enemigo> prototipos=new HashMap<>();

    public static void addPrototipo(String ID,Enemigo enemigo){
        prototipos.put(ID,enemigo);
    }

    public static Enemigo getPrototipo(String ID){
        Enemigo prototipo=prototipos.get(ID);
        return prototipo==null?null:prototipo.clone();
    }
}