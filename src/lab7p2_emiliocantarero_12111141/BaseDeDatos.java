package lab7p2_emiliocantarero_12111141;

import java.util.ArrayList;


public class BaseDeDatos {
    ArrayList<Accesorio> inventario = new ArrayList();

    public BaseDeDatos() {
    }

    public ArrayList<Accesorio> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Accesorio> inventario) {
        this.inventario = inventario;
    }
    
    public void agregar(Accesorio a){
        inventario.add(a);
    }
    
    public void eliminar(int id){
        for (Accesorio temp : inventario) {
            if (temp.getId()==id){
                inventario.remove(temp);
                break;
            }
        }
    }
    
    public void modificarCantidad(Accesorio a, int cantidad){
        for (Accesorio temp : inventario) {
            if (temp.equals(a)){
                temp.setCantidad(temp.getCantidad()-cantidad);
                break;
            }
        }
    }
}
