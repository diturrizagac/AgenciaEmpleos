package negocio;

/**
 *
 * @author Diego Iturrizaga
 */

public class GestorBaseDeDatos extends Gestor{
    
    /**
     * Guarda los cambios realizados en el sistema en la base de datos.
     */
    public boolean guardarCambios(){
        return baseDeDatos.guardarCambios();
    }
    
}