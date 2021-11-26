package lab7p2_emiliocantarero_12111141;

import java.util.ArrayList;


public class Administrador extends Usuario{

    public Administrador() {
        super();
    }

    public Administrador(String tipo, String username, String contra, int edad) {
        super(tipo, username, contra, edad);
    }

    
    @Override
    public String toString() {
        return super.toString();
    }
    
    public void setTipoUsuario(){
        super.setTipo("Administrador");
    }
}
