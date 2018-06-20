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
        
    }
}
