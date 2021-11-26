package lab7p2_emiliocantarero_12111141;
public abstract class Usuario {
    private String nombre;
    private String username;
    private int edad;
    private String tipo;

    public Usuario() {
    }
    
    public Usuario(String nombre, String username, int edad, String tipo) {
        this.nombre = nombre;
        this.username = username;
        this.edad = edad;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        return nombre;
    }
    
    public abstract void setTipoUsuario();
}
