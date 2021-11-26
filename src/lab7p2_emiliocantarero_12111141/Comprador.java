package lab7p2_emiliocantarero_12111141;

import java.util.ArrayList;
import java.util.Random;

public class Comprador extends Usuario{
    private ArrayList<Accesorio> listaAccesorios = new ArrayList<Accesorio>();
    private double dinero;

    public Comprador() {
        super();
    }

    public ArrayList<Accesorio> getListaAccesorios() {
        return listaAccesorios;
    }

    public void setListaAccesorios(ArrayList<Accesorio> listaAccesorios) {
        this.listaAccesorios = listaAccesorios;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

    public boolean comprarAccesorio(Accesorio a){
        if (a.getPrecio()*1.15 <= dinero) {
            listaAccesorios.add(a);
            return true;
        }else{
            return false;
        }
    }
    
    public void asignarDinero(){
        Random aleatorio = new Random();
        dinero = 1000 + aleatorio.nextInt(7001);
    }
    
    public void setTipoUsuario(){
        super.setTipo("Admins");
    }
    
    
}
