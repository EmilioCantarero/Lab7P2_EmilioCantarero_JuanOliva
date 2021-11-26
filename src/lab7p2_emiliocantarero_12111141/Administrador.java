package lab7p2_emiliocantarero_12111141;

import java.util.ArrayList;


public class Administrador extends Usuario{
    ArrayList<Accesorio> accesorios=new ArrayList();

    public Administrador() {
        super();
    }

    public Administrador(String nombre, String username, int edad) {
        super(nombre, username, edad);
    }

    public ArrayList<Accesorio> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(ArrayList<Accesorio> accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
