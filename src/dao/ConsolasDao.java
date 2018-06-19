/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import util.Database;

/**
 *
 * @author Raul
 */
public class ConsolasDao {
    private final Connection connection;
    PreparedStatement ps;

    public ConsolasDao(Connection connection) {
        this.connection = Database.getConnection();
    }
    
    
}
