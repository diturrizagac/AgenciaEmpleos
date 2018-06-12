/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio.BusquedaDYV;

import entidad.Persona;
import java.util.ArrayList;
import java.util.List;
import entidad.ParametrosDni;

/**
 *
 * @author Diego Iturrizaga
 */
public class BusquedaDniPersonas extends BusquedaDivideYVenceras<Persona,ParametrosDni>{

    @Override
    protected List<Persona> resolver(List<Persona> lista, ParametrosDni parametros) {
        Persona persona = null;
        
        for (int i = 0; i < lista.size(); i++) {
            /*Obtenemos el postulante "i"*/
            Persona personaAux = lista.get(i);
            
            /*Verificamos la condición de búsqueda*/
            if (parametros.getDni().trim().equalsIgnoreCase(personaAux.getDni()) == true) {
                persona = personaAux;
                i = lista.size() + 1;
            }
        }
        /* Validamos si se encontro algun resultado */
        List<Persona> resultado = new ArrayList<Persona>();
        if(persona != null){
            resultado.add(persona);
        }
        return resultado;
    }

  

    
    
    
}
