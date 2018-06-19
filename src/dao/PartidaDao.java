/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.Database;

/**
 *
 * @author Raul
 */
public class PartidaDao {
    String nombre;
    Date fecha;
    private final Connection connection;
    PreparedStatement ps;

    public PartidaDao() {
        this.connection = Database.getConnection();        
    }
    
    public void insertaPartida(String nombre, Date fesha){
        try{
            ps = connection.prepareCall("call insertaPartida(?,?)");
            ps.setString(1, nombre);
            ps.setDate(2, fesha);
        }catch(SQLException e){
            System.out.println("Error SQL -> "+e.getMessage());
        }
    }
}
