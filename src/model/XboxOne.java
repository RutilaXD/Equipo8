package model;
import java.util.*;

/**
 * @author Equipo 8
 */
public class XboxOne extends ConsolaVideojuegos {

    /**
     * 
     */
    private int controlXbox;

    /**
     * 
     */
    private int noPilas;

    /**
     * 
     */
    private int auricularesChat;

    /**
     * 
     */
    private int kitCargaJuega;

    /**
     * 
     */
    private int kinect;

    public XboxOne(int controlXbox, int noPilas, int auricularesChat, int kitCargaJuega, 
            int kinect, String nombre, String compania, float cpu, float ram, float discoDuro, 
            int noPuertos, String sistemaOperativo, int noConsolasDisp, int noJuegosDisp, float tiempoUso, 
            float montoRenta, boolean status, ArrayList<Partida> listaPartidas) {
        
        super(nombre, compania, cpu, ram, discoDuro, noPuertos,
                sistemaOperativo, noConsolasDisp, noJuegosDisp, tiempoUso
                , montoRenta, status, listaPartidas);
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

}