package model;
import java.util.*;

/**
 * @author Equipo 8
 */
public class NintendoSwitch extends ConsolaVideojuegos {

    public NintendoSwitch(String tipoControl, int controlesJoyCon,
            int controlesPro, String colorCorreaC, String colorFundaC, int volanteJoyCon, int protectorPantalla, 
            String nombre, String compania, float cpu, float ram, float discoDuro, int noPuertos, String sistemaOperativo, 
            int noConsolasDisp, int noJuegosDisp, float tiempoUso, float montoRenta, boolean status, ArrayList<Partida> listaPartidas) {
                    
        super(nombre, compania, cpu, ram, discoDuro, noPuertos, sistemaOperativo, noConsolasDisp, 
                noJuegosDisp, tiempoUso, montoRenta, status, listaPartidas);
        this.tipoControl = tipoControl;
        this.controlesJoyCon = controlesJoyCon;
        this.controlesPro = controlesPro;
        this.colorCorreaC = colorCorreaC;
        this.colorFundaC = colorFundaC;
        this.volanteJoyCon = volanteJoyCon;
        this.protectorPantalla = protectorPantalla;
    }

    

    /**
     * 
     */
    private String tipoControl;

    /**
     * 
     */
    private int controlesJoyCon;

    /**
     * 
     */
    private int controlesPro;

    /**
     * 
     */
    private String colorCorreaC;

    /**
     * 
     */
    private String colorFundaC;

    /**
     * 
     */
    private int volanteJoyCon;

    /**
     * 
     */
    private int protectorPantalla;

    /**
     * @return
     */
    public String getTipoControl() {
        // TODO implement here
        return tipoControl;
    }

    /**
     * @return
     */
    public int getControlesJoyCon() {
        // TODO implement here
        return controlesJoyCon;
    }

    /**
     * @return
     */
    public int getControlesPro() {
        // TODO implement here
        return controlesPro;
    }

    /**
     * @return
     */
    public String getColorCorreac() {
        // TODO implement here
        return colorCorreaC;
    }

    /**
     * @return
     */
    public String getColorFundaC() {
        // TODO implement here
        return colorFundaC;
    }

    /**
     * @return
     */
    public int getVolanteJoyCon() {
        // TODO implement here
        return volanteJoyCon;
    }

    /**
     * @return
     */
    public int getProtectorPantalla() {
        // TODO implement here
        return protectorPantalla;
    }

}