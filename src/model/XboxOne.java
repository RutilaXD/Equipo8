package model;
import java.util.*;

/**
 * @author Equipo 8
 */
public class XboxOne extends ConsolaVideojuegos {

    private int controlXbox;
    private int noPilas;
    private int auricularesChat;
    private int kitCargaJuega;
    private int kinect;
    private float tiempoUso;    
    private float montoRenta;
    private boolean status;
    private ArrayList<Partida> listaPartidas;

    public XboxOne(int controlXbox, int noPilas, int auricularesChat, int kitCargaJuega, 
            int kinect, String nombre, String compania, float cpu, float ram, float discoDuro,
            int noPuertos, String sistemaOperativo, int noConsolasDisp, int noJuegosDisp) {
        
        super(nombre, compania, cpu, ram, discoDuro, noPuertos, sistemaOperativo, noConsolasDisp, noJuegosDisp);
        this.controlXbox = controlXbox;
        this.noPilas = noPilas;
        this.auricularesChat = auricularesChat;
        this.kitCargaJuega = kitCargaJuega;
        this.kinect = kinect;
    }

    public XboxOne(int controlXbox, int noPilas, int auricularesChat, int kitCargaJuega, int kinect) {
        this.controlXbox = controlXbox;
        this.noPilas = noPilas;
        this.auricularesChat = auricularesChat;
        this.kitCargaJuega = kitCargaJuega;
        this.kinect = kinect;
    }
    

    /**
     * @return
     */
    public int getControlXbox() {
        // TODO implement here
        return controlXbox;
    }

    /**
     * @return
     */
    public int getNoPilas() {
        // TODO implement here
        return noPilas;
    }

    /**
     * @return
     */
    public int getAuricularesChat() {
        // TODO implement here
        return auricularesChat;
    }

    /**
     * @return
     */
    public int getKitCargaJuega() {
        // TODO implement here
        return kitCargaJuega;
    }

    /**
     * @return
     */
    public int getKinect() {
        // TODO implement here
        return kinect;
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