package model;
import java.util.*;

/**
 * @author Equipo 8
 */
public class Partida {

    /**
     * 
     */
    private Date fecha;

    /**
     * 
     */
    private String nombre;


    /**
     * @param fecha 
     * @param nombre 
     * @return
     */
    public Partida(Date fecha, String nombre) {    
        this.fecha = fecha;
        this.nombre = nombre;
    }

    /**
     * @return
     */
    public Date getFecha() {
        // TODO implement here
        return fecha;
    }

    /**
     * @return
     */
    public String getNombre() {
        // TODO implement here
        return nombre;
    }

}