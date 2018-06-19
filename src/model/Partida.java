package model;

import java.sql.Date;

/**
 * @author Equipo 8
 */
public class Partida {


    private Date fecha;
    private String nombre;


    /**
     * @param fecha 
     * @param nombre 
     */
    public Partida(Date fecha, String nombre) {    
        this.fecha = fecha;
        this.nombre = nombre;
    }

    /**
     * @return fecha
     */
    public Date getFecha() {
        // TODO implement here
        return fecha;
    }

    /**
     * @return nombre
     */
    public String getNombre() {
        // TODO implement here
        return nombre;
    }

}