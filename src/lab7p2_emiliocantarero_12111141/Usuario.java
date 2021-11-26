package lab7p2_emiliocantarero_12111141;
public abstract class Usuario {

    private String username;
    private String contra;
    private int edad;
    private String tipo;

    public Usuario() {
    }
    
    public Usuario(String tipo, String username,String contra, int edad) {
        this.username = username;
        this.contra=contra;
        this.edad = edad;
        this.tipo = tipo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

    @Override
    public String toString() {
        return username;
    }
    
    public abstract void setTipoUsuario();
}
