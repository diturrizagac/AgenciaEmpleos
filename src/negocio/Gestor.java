package negocio;

import entidad.BaseDeDatos;
import java.io.Serializable;
import util.UtilArchivo;

/**
 *
 * @author Diego Iturrizaga
 */

public abstract class Gestor{

    protected static BaseDeDatos baseDeDatos;
    
    /*Por medio de esta estructura de código podemos instanciar atributos estáticos*/
    static{
        /*Verificamos si podemos cargar datos desde el archivo*/
        Serializable archivoLeido = UtilArchivo.leerArchivo("C:\\Agencia2\\agencia.txt");
        if(archivoLeido != null && archivoLeido instanceof BaseDeDatos){
            baseDeDatos = (BaseDeDatos) archivoLeido;
        }else{
            baseDeDatos = new BaseDeDatos();
            
                /*Insertamos en la base de datos un usuario de pruebas*/
            /*Empresa miEmpresa = new Empresa();
            miEmpresa.setRuc("1047212510");
            miEmpresa.setRazonSocial("F&F");
            miEmpresa.setPassword("kora");
            baseDeDatos.getEmpresas().add(miEmpresa);*/
            
            /*Persona mipersona=new Persona();
            mipersona.setDni("47212510");
            mipersona.setNombre(" jose perez huaman");
            mipersona.setPassword("kora");
            baseDeDatos.getPersonas().add(mipersona);*/
        
        }
        
    }
    
}