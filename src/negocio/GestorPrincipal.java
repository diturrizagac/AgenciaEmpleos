package negocio;

/**
 *
 * @author Diego Iturrizaga
 */

public class GestorPrincipal{
    /*Almacenamos datos */
    private static GestorUsuarioEmpresa gestorUsuarioEmpresa;
    private static GestorUsuarioPersona gestorUsuarioPersona;
    private static GestorBaseDeDatos gestorBaseDeDatos;
    
    /*Por medio de esta estructura de código podemos instanciar atributos estáticos*/
    static{
        gestorUsuarioEmpresa = new GestorUsuarioEmpresa();
        gestorUsuarioPersona = new GestorUsuarioPersona();
        gestorBaseDeDatos = new GestorBaseDeDatos();
    }
    
    public static GestorUsuarioEmpresa getGestorUsuarioEmpresa() {
        return gestorUsuarioEmpresa;
    }

    public static GestorUsuarioPersona getGestorUsuarioPersona() {
        return gestorUsuarioPersona;
    }

    public static GestorBaseDeDatos getGestorBaseDeDatos() {
        return gestorBaseDeDatos;
    }
    
}