public abstract class Enemigo implements Cloneable{
    protected String nombre;
    protected int vida;
    protected int fuerza;
    protected int velocidad;
    protected String posicion;

    public Enemigo(String nombre,int vida,int fuerza,int velocidad,String posicion){
        this.nombre=nombre;
        this.vida=vida;
        this.fuerza=fuerza;
        this.velocidad=velocidad;
        this.posicion=posicion;
    }

    public void setNombre(String nombre){this.nombre=nombre;}
    public void setVida(int vida){this.vida=vida;}
    public void setFuerza(int fuerza){this.fuerza=fuerza;}
    public void setVelocidad(int velocidad){this.velocidad=velocidad;}
    public void setPosicion(String posicion){this.posicion=posicion;}

    public String getAtributos(){
        return "Nombre: "+this.nombre+
                "\nVida: "+this.vida+" | Fuerza: "+this.fuerza+" | Velocidad: "+this.velocidad+" | Posicion: "+this.posicion;
    }

    @Override
    protected Enemigo clone(){
        try{
            return (Enemigo) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            throw new RuntimeException("Hubo un error al clonar: ",e);
        }
    }
}