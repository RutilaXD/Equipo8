package model;
import java.util.*;

/**
 * @author Equipo 8
 */
public class PlayStation4 extends ConsolaVideojuegos {

    private int controlesDualShock;
    private int auricularesPS4;
    private int arcadeStick;
    private float tiempoUso;    
    private float montoRenta;
    private boolean status;
    private ArrayList<Partida> listaPartidas;

    public PlayStation4(int controlesDualShock, int auricularesPS4, int arcadeStick,
            String nombre, String compania, float cpu, float ram, float discoDuro, int noPuertos, 
            String sistemaOperativo, int noConsolasDisp, int noJuegosDisp) {
        
        super(nombre, compania, cpu, ram, discoDuro, noPuertos, sistemaOperativo, noConsolasDisp, noJuegosDisp);
        this.controlesDualShock = controlesDualShock;
        this.auricularesPS4 = auricularesPS4;
        this.arcadeStick = arcadeStick;
    }

    /**
     * @return
     */
    public int getControlesDualShock() {
        // TODO implement here
        return controlesDualShock;
    }

    /**
     * @return
     */
    public int getAuricularesPS4() {
        // TODO implement here
        return auricularesPS4;
    }

    /**
     * @return
     */
    public int getArcadeStick() {
        // TODO implement here
        return arcadeStick;
    }

    /**
     * @return the tiempoUso
     */
    public float getTiempoUso() {
        return tiempoUso;
    }

    /**
     * @param tiempoUso the tiempoUso to set
     */
    public void setTiempoUso(float tiempoUso) {
        this.tiempoUso = tiempoUso;
    }

    /**
     * @return the montoRenta
     */
    public float getMontoRenta() {
        return montoRenta;
    }

    /**
     * @param montoRenta the montoRenta to set
     */
    public void setMontoRenta(float montoRenta) {
        this.montoRenta = montoRenta;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the listaPartidas
     */
    public ArrayList<Partida> getListaPartidas() {
        return listaPartidas;
    }

    /**
     * @param listaPartidas the listaPartidas to set
     */
    public void setListaPartidas(ArrayList<Partida> listaPartidas) {
        this.listaPartidas = listaPartidas;
    }

}