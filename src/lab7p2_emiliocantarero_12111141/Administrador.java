package lab7p2_emiliocantarero_12111141;

import java.util.ArrayList;


public class Administrador extends Usuario{

    public Administrador() {
        super();
    }

    public Administrador(String nombre, String username, int edad, String tipo) {
        super(nombre, username, edad, tipo);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    public void setTipoUsuario(){
        super.setTipo("Administrador");
    }
}
