/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio.BusquedaDYV;

import entidad.ParametrosDni;
import entidad.Empresa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Iturrizaga
 */
public class BusquedaRucEmpresas extends BusquedaDivideYVenceras<Empresa,ParametrosDni> {
    @Override
    protected List<Empresa> resolver(List<Empresa> lista, ParametrosDni parametros) {
        Empresa empresa = null;
        
        for (int i = 0; i < lista.size(); i++) {
            /*Obtenemos el postulante "i"*/
            Empresa empresaAux = lista.get(i);

            /*Verificamos la condición de búsqueda*/
            if (parametros.getDni().trim().equalsIgnoreCase(empresaAux.getRuc()) == true) {
                empresa = empresaAux;
                i = lista.size() + 1;
            }
        }
        /* Validamos si se encontro algun resultado */
        List<Empresa> resultado = new ArrayList<Empresa>();
        if(empresa != null){
            resultado.add(empresa);
        }
        return resultado;
    }
}
