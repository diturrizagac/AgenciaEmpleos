package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Diego Iturrizaga
 */

public class UtilArchivo{
    
    public static boolean guardarArchivo(String ruta, Serializable objetoSerializable){
        boolean estado = false;
        
        FileOutputStream archivo = null;
        try {
            /*Creamos el archivo (si ya existe lo sobreescribe)*/
            File fichero = new File(ruta);
            fichero.getParentFile().mkdirs();
                    
            /*Abrimos el archivo*/
            archivo = new FileOutputStream(ruta);
            ObjectOutputStream oos = new ObjectOutputStream(archivo);
            
            /*Escribimos en el archivo*/
            oos.writeObject(objetoSerializable);
            
            /*Cerramos el archivo*/
            oos.close();
            estado = true;
        } catch (FileNotFoundException ex) {
            /*null*/
            System.out.println(ex);
        } catch (IOException ex) {
            /*null*/
            System.out.println(ex);
        } finally {
            try {
                if(archivo != null){
                    archivo.close();
                }
            } catch (IOException ex) {
                /*null*/
                System.out.println(ex);
            }
        }
        
        return estado;
    }
    
    public static Serializable leerArchivo(String ruta){
        Serializable objetoSerializable = null;
        
        FileInputStream archivo = null;
        try {
            /*Abrimos el archivo*/
            archivo = new FileInputStream(ruta);
            ObjectInputStream oos = new ObjectInputStream(archivo);
            
            /*Leemos el archivo*/
            objetoSerializable = (Serializable) oos.readObject();
            
            /*Cerramos el archivo*/
            oos.close();
        } catch (FileNotFoundException ex) {
            /*null*/
        } catch (IOException ex) {
            /*null*/
        } catch (ClassNotFoundException ex) {
            /*null*/
        } finally {
            try {
                if(archivo != null){
                    archivo.close();
                }
            } catch (IOException ex) {
                /*null*/
            }
        }
        
        return objetoSerializable;
    }
    
}