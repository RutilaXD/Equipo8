/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    /**
     * Método que hace la conexión a la base de datos
     * Se crea una variable de tipo Connection la cual regresa el
     * acceso a la base de datos
     * @return
     */
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Los parámetros van en el orden: url de la base de datos, usuario, contraseña
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/videojuegos", "root", "n0m3l0");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
            return null;
        }
    }

    /**
     * Cierra la conexión
     * @param con 
     */
    public static void close(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
    }
}
