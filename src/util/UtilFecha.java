package util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Diego Iturrizaga
 */

public class UtilFecha{

    /*Obtiene la fecha actual*/
    public static Date obtenerFechaActual(){
        return new Date();
    }
    
    /*Obtiene fecha según día, mes y año*/
    public static Date obtenerFecha(String dia, String mes, String anio){
        Integer a = Integer.parseInt(dia);
        Integer b = Integer.parseInt(mes);
        Integer c = Integer.parseInt(anio);                
        Calendar calendario = new GregorianCalendar(c, b, a);
        return calendario.getTime();
    }
    
    /*Obtiene el anio de una fecha*/
    public static int obtenerAnioDeFecha(Date fecha){
        Calendar calendario = new GregorianCalendar();
        calendario.setTime(fecha);
        return calendario.get(Calendar.YEAR);
    }
    
    /*Obtiene el mes de una fecha*/
    public static int obtenerMesDeFecha(Date fecha){
        Calendar calendario = new GregorianCalendar();
        calendario.setTime(fecha);
        return calendario.get(Calendar.MONTH);
    }
    
    /*Obtiene el día de una fecha*/
    public static int obtenerDiaDeFecha(Date fecha){
        Calendar calendario = new GregorianCalendar();
        calendario.setTime(fecha);
        return calendario.get(Calendar.DATE);
    }
    
}