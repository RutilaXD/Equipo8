package model;
import java.util.*;

/**
 * @author Equipo 8
 */
public class PlayStation4 extends ConsolaVideojuegos {


    /**
     * 
     */
    private int controlesDualShock;

    /**
     * 
     */
    private int auricularesPS4;

    /**
     * 
     */
    private int arcadeStick;

    public PlayStation4(int controlesDualShock, int auricularesPS4, int arcadeStick, 
            String nombre, String compania, float cpu, float ram, float discoDuro, int noPuertos,
            String sistemaOperativo, int noConsolasDisp, int noJuegosDisp, float tiempoUso, float montoRenta, 
            boolean status, ArrayList<Partida> listaPartidas) {
        
        super(nombre, compania, cpu, ram, discoDuro, noPuertos, sistemaOperativo,
                noConsolasDisp, noJuegosDisp, tiempoUso, montoRenta, status, listaPartidas);
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

}