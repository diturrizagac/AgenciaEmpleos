package negocio;

import entidad.ParametrosLogin;
import entidad.ParametrosDni;
import negocio.BusquedaDYV.BusquedaLoginPersona;
import negocio.BusquedaDYV.BusquedaDniPersonas;
import entidad.*;
import java.util.ArrayList;
import java.util.List;
import static negocio.Gestor.baseDeDatos;

/**
 *
 * @author Diego Iturrizaga
 */

public class GestorUsuarioPersona extends Gestor{

    
    public boolean iniciarSesion(Persona persona){
        boolean estado = false;
        
        /*Obtenemos la tabla de la base de datos*/
        List<Persona> personas = baseDeDatos.getPersonas();
        /*Asignamos los datos para luego validar */
        ParametrosLogin parametros = new ParametrosLogin();
        parametros.setUsuario(persona.getDni());
        parametros.setPassword(persona.getPassword());
        /*Creamos una variable para capturar los posibles resultados */
        List<Persona> resultado;
        /*Buscamos en la base de datos la existencia del usuario*/
        BusquedaLoginPersona DYV = new BusquedaLoginPersona();
        resultado = DYV.buscar(personas, parametros);
        if(resultado.size() != 0){
            estado = true;
        }
        /*
        Persona personaAux = null;
        for(int i=0; i<personas.size(); i++){
            //Obtenemos el usuario "i"
            personaAux = personas.get(i);
            //Verificamos la condición
            if(personaAux.getDni().trim().equals(persona.getDni()) == true &&
                personaAux.getPassword().trim().equals(persona.getPassword()) == true){
                estado = true;
                i = personas.size()+1;
            }
        }*/
        return estado;
    }
    
    public int getTamanio() {
        ArrayList<Persona> personas = baseDeDatos.getPersonas();
        return personas.size();
    }
    
    public boolean registrarPersona(Persona persona){
        boolean estado = false;
        
        /*Buscamos la persona para verificar si ya existe*/
        Persona personaAux = validarPersona(persona.getDni());
        if(personaAux == null){
            /*Registramos la persona en la base de datos*/
            baseDeDatos.getPersonas().add(persona);
            /*Actualizamos el estado*/
            estado = true;
        }
        return estado;
    }
    
    public Persona buscarPersona(String dni) {
        /*Instanciamos e setteamos de la interface Parametros*/
        ParametrosDni parametros = new ParametrosDni();
        parametros.setDni(dni);
        /*Obtenemos la tabla de la base de datos*/
        List<Persona> lsPersonas = baseDeDatos.getPersonas();
        List<Persona> personasAux;
        /*Buscamos al postulante*/
        BusquedaDniPersonas DYV = new BusquedaDniPersonas();
        personasAux = DYV.buscar(lsPersonas, parametros);

        return personasAux.get(0);
    }
    
    public Persona validarPersona(String dni){
        Persona persona = null;
        
        /*Obtenemos la tabla de la base de datos*/
        ArrayList<Persona> Personas = baseDeDatos.getPersonas();
        /*Buscamos al persona en la tabla*/
        Persona personaAux = null;
        for(int i=0; i<Personas.size(); i++){
            /*Obtenemos la persona "i"*/
            personaAux = Personas.get(i);
            
            /*Verificamos la condición de búsqueda*/
            if(dni.trim().equalsIgnoreCase(personaAux.getDni()) == true){
                persona = personaAux;
                i = Personas.size()+1; // break;
            }
        }
        return persona;
    }
    
    public ArrayList<Persona> buscarPerfil(ExperienciaLaboral experiencia){
        /*Obtenemos la tabla de la base de datos*/
        ArrayList<Persona> personas = baseDeDatos.getPersonas();
        ArrayList<ExperienciaLaboral> expeAux = new ArrayList<ExperienciaLaboral>();
        ArrayList<Persona> perfPosible = new ArrayList<Persona>();
        /*Buscamos al persona en la tabla*/
        
        Persona personaAux;
        //ExperienciaLaboral expAux;
        for(int i=0; i<personas.size(); i++){
            /*Obtenemos la persona "i"*/
            personaAux = personas.get(i);
            /*Verificamos la condición de búsqueda*/
            for(int j=0;j<personaAux.getCv().getTrabajos().size();j++){
                
                expeAux = personaAux.getCv().getTrabajos();
                
                if(experiencia.getCargo().equalsIgnoreCase(expeAux.get(j).getCargo())){
                    if(experiencia.getRubro().equalsIgnoreCase(expeAux.get(j).getRubro())){
                        if(experiencia.getUbicacion().equalsIgnoreCase(expeAux.get(j).getUbicacion())){
                            perfPosible.add(personaAux);
                        }
                    }   
                }
            }
        } 
        return perfPosible;
    }
    
    public ArrayList<ExperienciaLaboral> obtenerExpLaboral (Persona persona){
        ArrayList<ExperienciaLaboral> experiencia = persona.getCv().getTrabajos();
        ArrayList<ExperienciaLaboral> expEncontrada = new ArrayList<ExperienciaLaboral>();
        
        //ExperienciaLaboral experiencia;
        ExperienciaLaboral expLaboralAux;
        for(int i=0; i<experiencia.size(); i++){
            /*Obtenemos la experiencia laboral "i"*/
            expLaboralAux = experiencia.get(i);
            /*Guardamos toda la experiencia en expEncontrada*/
            expEncontrada.add(expLaboralAux);
        } 
        return expEncontrada;
    }
    
    
    public boolean registrarExpLaboral(Persona persona, ExperienciaLaboral experiencia){
        boolean estado = false;
        
        ExperienciaLaboral experienciaAux = null;
        
        for(int i=0;i<persona.getCv().getTrabajos().size();i++){
            if(experiencia == persona.getCv().getTrabajos().get(i)){
                experienciaAux = experiencia;
            }
        }
        if(experienciaAux == null){
            persona.getCv().getTrabajos().add(experiencia);
            estado = true;
        }
        return estado;
    }
    
    public boolean registrarEstudios(Persona persona, EstudiosRealizados estudios){
        boolean estado = false;
        
        EstudiosRealizados estudiosAux = null;
        
        for(int i=0;i<persona.getCv().getEstudios().size();i++){
            if(estudios == persona.getCv().getEstudios().get(i)){
                estudiosAux = estudios;
            }
        }
        if(estudiosAux == null){
            persona.getCv().getEstudios().add(estudios);
            estado = true;
        }
        return estado;
    }
    
    public ArrayList<Anuncio> buscarTrabajo(String rubro){
            /*Obtenemos la tabla de la Base de datos*/
        ArrayList<Empresa> empresas = baseDeDatos.getEmpresas();
        ArrayList<Anuncio> anuncios = new ArrayList<Anuncio>();
        ArrayList<Anuncio> trabPosibles = new ArrayList<Anuncio>();
        
        for(int i=0;i<empresas.size();i++){
            for(int j=0; j<empresas.get(i).getLsAnuncios().size();j++){
                anuncios.add(empresas.get(i).getLsAnuncios().get(j));
            }
        }
        
        for(int i=0; i<anuncios.size();i++){
            if(rubro.trim().equalsIgnoreCase(anuncios.get(i).getRubro())== true){
                trabPosibles.add(anuncios.get(i));
            }
        }
        return trabPosibles;     
    }
    
    public ArrayList<Anuncio> buscarTrabajo(String rubro, String cargo){
            /*Obtenemos la tabla de la Base de datos*/
        ArrayList<Empresa> empresas = baseDeDatos.getEmpresas();
        ArrayList<Anuncio> anuncios = new ArrayList<Anuncio>();
        ArrayList<Anuncio> trabPosibles = new ArrayList<Anuncio>();
        
        for(int i=0;i<empresas.size();i++){
            for(int j=0; j<empresas.get(i).getLsAnuncios().size();j++){
                anuncios.add(empresas.get(i).getLsAnuncios().get(j));
            }
        }
        
        for(int i=0; i<anuncios.size();i++){
            if(rubro.trim().equalsIgnoreCase(anuncios.get(i).getRubro())== true &&
                    cargo.trim().equalsIgnoreCase(anuncios.get(i).getCargo())== true){
                trabPosibles.add(anuncios.get(i));
            }
        }
        return trabPosibles;
    }
    
    public ArrayList<Anuncio> buscarTrabajo(String rubro, String cargo, String lugar){
            /*Obtenemos la tabla de la Base de datos*/
        ArrayList<Empresa> empresas = baseDeDatos.getEmpresas();
        ArrayList<Anuncio> anuncios = new ArrayList<Anuncio>();
        ArrayList<Anuncio> trabPosibles = new ArrayList<Anuncio>();
        
        for(int i=0;i<empresas.size();i++){
            for(int j=0; j<empresas.get(i).getLsAnuncios().size();j++){
                anuncios.add(empresas.get(i).getLsAnuncios().get(j));
            }
        }
        
        for(int i=0; i<anuncios.size();i++){
            if(rubro.trim().equalsIgnoreCase(anuncios.get(i).getRubro())== true &&
                    cargo.trim().equalsIgnoreCase(anuncios.get(i).getCargo())== true &&
                        lugar.trim().equalsIgnoreCase(anuncios.get(i).getLugar())== true){
                trabPosibles.add(anuncios.get(i));
            }
        }
        return trabPosibles;
    }

    public ArrayList<Persona> listarPersonas(){
            /*Retornamos la lista de personas*/
            return baseDeDatos.getPersonas();
    }
    
    /*public void postularAnuncio(Persona persona, Anuncio anuncio){
        
		ArrayList<Anuncio> misPostulaciones =  new ArrayList<Anuncio>();
		ArrayList<Persona> misPostulantes =  new ArrayList<Persona>();
		
		for(int i=0; i<persona.getLsPostulaciones().size();i++)            
			{
                misPostulaciones.add(persona.getLsPostulaciones().get(i));
            }
        misPostulaciones.add(anuncio);
		persona.setLsPostulaciones(misPostulaciones);
		
		for(int i=0; i<anuncio.getLsPostulantes().size();i++)            
			{
                misPostulantes.add(anuncio.getLsPostulantes().get(i));
            }
        misPostulantes.add(persona);
		anuncio.setLsPostulantes(misPostulantes);       
    }
    
    public ArrayList<Anuncio> verPostulaciones(Persona persona){
        
        return persona.getLsPostulaciones();        
    }
    
    public ArrayList<Anuncio> verTrabajosObtenidos(Persona persona){
        
        return persona.getPuestosObtenidos();        
    }
    */
}