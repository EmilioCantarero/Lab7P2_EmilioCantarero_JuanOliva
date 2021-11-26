package lab7p2_emiliocantarero_12111141;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class adminUsuarios {
    ArrayList<Usuario>usuarios=new ArrayList();
    private File archivo=null;
    
    public adminUsuarios(String path){
        archivo =new File(path);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminUsuarios{" + "usuarios=" + usuarios + ", archivo=" + archivo + '}';
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuario t : usuarios) {
                bw.write(t.getTipo() + "|");
                bw.write(t.getUsername()+ "|");
                bw.write(t.getContra() + "|");
                bw.write(t.getEdad() + "|");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        usuarios = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {
                    String tipo=sc.next();
                    if (tipo.equals("Administrador")){
                        usuarios.add(new Administrador(tipo,
                                        sc.next(),
                                        sc.next(),
                                        sc.nextInt()
                                     )
                        );
                    }
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
    
    
}
