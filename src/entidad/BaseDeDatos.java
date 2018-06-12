
package entidad;

import java.io.Serializable;
import java.util.ArrayList;
import util.UtilArchivo;

/**
 *
 * @author Diego Iturrizaga
 */

public class BaseDeDatos implements Serializable{

    private ArrayList<Empresa> empresas;
    private ArrayList<Persona> personas;
    
    public BaseDeDatos(){

        empresas = new ArrayList<Empresa>();
        personas = new ArrayList<Persona>();
    }
    
    public boolean guardarCambios(){
        return UtilArchivo.guardarArchivo("C:\\Agencia2\\agencia.txt", this);
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    
}
