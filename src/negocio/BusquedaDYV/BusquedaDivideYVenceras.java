/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio.BusquedaDYV;


import entidad.Usuario;
import java.util.ArrayList;
import java.util.List;
import entidad.IParametros;


/**
 *
 * @author Diego Iturrizaga
 */
public abstract class BusquedaDivideYVenceras<T extends Usuario, P extends IParametros> {
    private static int CRITERIO_TAMANIO_MINIMO_ARRAY = 6;
    
//    private <T extends Usuario>  List<List<T>> dividir(final List<T> lista) {
    private List<List<T>> dividir(final List<T> lista) {    
        // T se le llama Genérico        
        List<List<T>> subListas = new ArrayList<List<T>>();
        
        int medio = lista.size()%2==0? //condicion, si el tamanio del vector es par, entonces
                lista.size()/2: //verdadero
                (lista.size()-1)/2; // falso

        subListas.add(lista.subList(0, medio));       
        subListas.add(lista.subList(medio+1,lista.size()-1));
        return subListas;
    }
    
    protected abstract List<T> resolver(final List<T> lista, P parametros);
    

    /**
     *
     * El mezclado ya se hace en el metodo calcular.
     *
     * @param lista
     * @return lista total de indices
     */
    private List<T> mezclar(final List<T> lista){
        return lista;
    }

    
  
    public List<T> buscar(final List<T> lista, P parametros) {

        if( lista.size() < CRITERIO_TAMANIO_MINIMO_ARRAY ) {
            return resolver(lista,parametros);
        }else { 
            List<T> resultados =  new ArrayList<T>();
           
            List<List<T>> subListas = dividir(lista);
            for (List<T> subLista : subListas) {
                List<T> usuario = buscar(subLista,parametros);
                // el mezclado ya se hace aqui
                resultados.addAll(usuario);
            }
            return mezclar(resultados);
        }
    }
}
