package model;
import java.util.*;

/**
 * @author Equipo 8
 */
public class ConsolaVideojuegos {
    protected String nombre;
    protected String compania;
    protected float cpu;
    protected float ram;
    protected float discoDuro;
    protected int noPuertos;
    protected String sistemaOperativo;
    protected int noConsolasDisp;
    protected int noJuegosDisp;

    public ConsolaVideojuegos(String nombre, String compania, float cpu, float ram, float discoDuro, int noPuertos, String sistemaOperativo, int noConsolasDisp, int noJuegosDisp) {
        this.nombre = nombre;
        this.compania = compania;
        this.cpu = cpu;
        this.ram = ram;
        this.discoDuro = discoDuro;
        this.noPuertos = noPuertos;
        this.sistemaOperativo = sistemaOperativo;
        this.noConsolasDisp = noConsolasDisp;
        this.noJuegosDisp = noJuegosDisp;
    }


    

    public void limpiezaPartidas() {
    }

    public void guardarJuego() {
    }

    /**
     * @return compania
     */
    public String getCompania() {
        return this.compania;
    }

    /**
     * @return cpu
     */
    public float getCpu() {
        // TODO implement here
        return cpu;
    }

    /**
     * @return
     */
    public float getRam() {
        // TODO implement here
        return ram;
    }

    /**
     * @return
     */
    public float getDiscoDuro() {
        // TODO implement here
        return discoDuro;
    }

    /**
     * @return
     */
    public int getNoPuertos() {
        // TODO implement here
        return noPuertos;
    }

    /**
     * @return
     */
    public String getSistemaOperativo() {
        // TODO implement here
        return sistemaOperativo;
    }

    /**
     * @return
     */
    public int getNoConsolasDisp() {
        // TODO implement here
        return noConsolasDisp;
    }

    /**
     * @return
     */
    public int getNoJuegosDisp() {
        // TODO implement here
        return noJuegosDisp;
    }


}