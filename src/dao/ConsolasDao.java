/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Database;
import model.*;

/**
 *
 * @author Raul
 */
public class ConsolasDao {
    private final Connection connection;
    PreparedStatement ps;

    public ConsolasDao() {
        this.connection = Database.getConnection();
    }
    
    public ArrayList<String> cosultaTipoConsola(){
        ArrayList<String> consolas = new ArrayList<>();
       try{
            ps = connection.prepareStatement("select consola.nombre from consola;");
            ResultSet rs =ps.executeQuery();
            while(rs.next()){
                consolas.add(rs.getString("nombre"));
            }
        }catch(SQLException e){
            System.out.println("Error SQL -> "+e.getMessage());
        }        
        return consolas;
    }
    
    public void registraXbox(XboxOne xbox){
       try{
            ps = connection.prepareCall("call insertaXbox(?,?,?,?,?,?,?,?,?);");
            ps.setInt(1, 1);
            ps.setInt(2, xbox.getControlXbox());
            ps.setInt(3, xbox.getNoPilas());
            ps.setInt(4, xbox.getAuricularesChat());
            ps.setInt(5, xbox.getKitCargaJuega());
            ps.setInt(6, xbox.getKinect());
            ps.setFloat(7, xbox.getTiempoUso());
            ps.setFloat(8, xbox.getMontoRenta());
            ps.setBoolean(9, xbox.isStatus());
            ps.executeQuery();
            System.out.println("Xbox registrado con exito");
        }catch(SQLException e){
            System.out.println("Error SQL -> "+e.getMessage());
        }        
    }
    
    public void registraNintendo(NintendoSwitch nintendo){
       try{
            ps = connection.prepareCall("call insertaNintendo(?,?,?,?,?,?,?,?,?,?,?);");
            ps.setInt(1, 2);
            ps.setString(2, nintendo.getTipoControl());
            ps.setInt(3, nintendo.getControlesJoyCon());
            ps.setInt(4, nintendo.getControlesPro());
            ps.setString(5, nintendo.getColorCorreac());
            ps.setString(6, nintendo.getColorFundaC());
            ps.setInt(7, nintendo.getVolanteJoyCon());
            ps.setInt(8, nintendo.getProtectorPantalla());
            ps.setFloat(9, nintendo.getTiempoUso());
            ps.setFloat(10, nintendo.getMontoRenta());
            ps.setBoolean(11, nintendo.isStatus());
            ps.execute();
            System.out.println("Nintendo registrado con exito");
        }catch(SQLException e){
            System.out.println("Error SQL -> "+e.getMessage());
        }          
    }
    
    public ArrayList<ConsolaVideojuegos> verConsolas(){
        ArrayList<ConsolaVideojuegos> consolas = new ArrayList<>();
        ConsolaVideojuegos c;
        String nombre;
        String compa;
        float cpu;
        int ram;
        int hd;
        int port;
        String so;
        int consDisp;
        int juegosDisp;
       try{
            ps = connection.prepareCall("select * from consola;");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                nombre = rs.getString("nombre");
                compa = rs.getString("compania");
                cpu = rs.getFloat("cpu");
                ram = rs.getInt("ram");
                hd = rs.getInt("harddisk");
                port = rs.getInt("ports");
                so = rs.getString("so");
                consDisp = rs.getInt("consolaDisp");
                juegosDisp = rs.getInt("juegosDisp");
                c = new ConsolaVideojuegos(nombre, compa, cpu, ram, hd, port, compa, consDisp, juegosDisp);
                consolas.add(c);
            }
            
        }catch(SQLException e){
            System.out.println("Error SQL -> "+e.getMessage());
        }          
        return consolas;
    }
}
