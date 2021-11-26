package lab7p2_emiliocantarero_12111141;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class BaseDeDatos {
    private ArrayList<Accesorio> inventario = new ArrayList();
    private File archivo = null;

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
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Accesorio a : inventario) {
                bw.write(a.getId()+";");
                bw.write(a.getNombre()+";");
                bw.write(a.getPrecio()+";");
                bw.write(a.getCantidad()+";");
            }
            bw.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() throws FileNotFoundException {
        Scanner sc = null;
        inventario = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    inventario.add(new Accesorio(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt()));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            sc.close();
        }
    }
    
}
