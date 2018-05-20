package model;
import java.util.*;

/**
 * @author Equipo 8
 */
public class ConsolaVideojuegos {

    /**
     * 
     */
    protected String nombre;

    /**
     * 
     */
    protected String compania;

    /**
     * 
     */
    protected float cpu;

    /**
     * 
     */
    protected float ram;

    /**
     * 
     */
    protected float discoDuro;

    /**
     * 
     */
    protected int noPuertos;

    /**
     * 
     */
    protected String sistemaOperativo;

    /**
     * 
     */
    protected int noConsolasDisp;

    /**
     * 
     */
    protected int noJuegosDisp;

    /**
     * 
     */
    protected float tiempoUso;

    /**
     * 
     */
    protected float montoRenta;

    /**
     * 
     */
    protected boolean status;

    /**
     * 
     */
    protected ArrayList<Partida> listaPartidas;



    /**
     * @param nombre 
     * @param compania 
     * @param cpu 
     * @param ram 
     * @param discoDuro 
     * @param noPuertos 
     * @param sistemaOperativo 
     * @param noConsolasDisp 
     * @param noJuegosDisp 
     * @param tiempoUso 
     * @param montoRenta 
     * @param status 
     * @param listaPartidas 
     */
    public ConsolaVideojuegos(String nombre, String compania, float cpu, float ram, float discoDuro, 
            int noPuertos, String sistemaOperativo, int noConsolasDisp,
            int noJuegosDisp, float tiempoUso, float montoRenta, boolean status, ArrayList<Partida> listaPartidas) {    
        this.nombre = nombre;
        this.compania = compania;
        this.cpu = cpu;
        this.ram = ram;
        this.discoDuro = discoDuro;
        this.noPuertos = noPuertos;
        this.sistemaOperativo = sistemaOperativo;
        this.noConsolasDisp = noConsolasDisp;
        this.noJuegosDisp = noJuegosDisp;
        this.tiempoUso = tiempoUso;
        this.montoRenta = montoRenta;
        this.status = status;
        this.listaPartidas = listaPartidas;
    }

    public void limpiezaPartidas() {
    }

    /**
     * @param status
     */
    public void usarVidejuego(boolean status) {
        this.status = status;
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

    /**
     * @return
     */
    public float getTiempoUso() {
        // TODO implement here
        return tiempoUso;
    }

    /**
     * @return
     */
    public float getMontoRenta() {
        // TODO implement here
        return montoRenta;
    }

    /**
     * @return
     */
    public boolean getStatus() {
        // TODO implement here
        return status;
    }

    /**
     * @return
     */
    public ArrayList<Partida> getListaPartidas() {
        // TODO implement here
        return listaPartidas;
    }

}