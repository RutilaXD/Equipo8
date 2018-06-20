package model;
import java.util.*;

/**
 * @author Equipo 8
 */
public class NintendoSwitch extends ConsolaVideojuegos {

    
    private String tipoControl;
    private int controlesJoyCon;
    private int controlesPro;
    private String colorCorreaC;
    private String colorFundaC;
    private int volanteJoyCon;
    private int protectorPantalla;
    private float tiempoUso;    
    private float montoRenta;
    private boolean status;
    private ArrayList<Partida> listaPartidas;

    public NintendoSwitch(String tipoControl, int controlesJoyCon, int controlesPro, String colorCorreaC, 
            String colorFundaC, int volanteJoyCon, int protectorPantalla, String nombre, String compania, 
            float cpu, float ram, float discoDuro, int noPuertos, String sistemaOperativo, int noConsolasDisp, int noJuegosDisp) {
        
        super(nombre, compania, cpu, ram, discoDuro, noPuertos, sistemaOperativo, noConsolasDisp, noJuegosDisp);
        this.tipoControl = tipoControl;
        this.controlesJoyCon = controlesJoyCon;
        this.controlesPro = controlesPro;
        this.colorCorreaC = colorCorreaC;
        this.colorFundaC = colorFundaC;
        this.volanteJoyCon = volanteJoyCon;
        this.protectorPantalla = protectorPantalla;
    }
    
    public NintendoSwitch(String tipoControl, int controlesJoyCon, int controlesPro, String colorCorreaC, 
            String colorFundaC, int volanteJoyCon, int protectorPantalla) {
        this.tipoControl = tipoControl;
        this.controlesJoyCon = controlesJoyCon;
        this.controlesPro = controlesPro;
        this.colorCorreaC = colorCorreaC;
        this.colorFundaC = colorFundaC;
        this.volanteJoyCon = volanteJoyCon;
        this.protectorPantalla = protectorPantalla;
        this.tiempoUso = 0f;
        this.montoRenta = 0f;
        this.status = false;        
    }
    
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