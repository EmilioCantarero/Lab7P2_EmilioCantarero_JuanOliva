package lab7p2_emiliocantarero_12111141;
public class Usuario {
    private String nombre;
    private String username;
    private int edad;

    public Usuario() {
    }
    
    public Usuario(String nombre, String username, int edad) {
        this.nombre = nombre;
        this.username = username;
        this.edad = edad;
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

    @Override
    public String toString() {
        return nombre;
    }
}
