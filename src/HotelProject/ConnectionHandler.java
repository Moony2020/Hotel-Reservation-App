/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelProject;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author mymoo
 */
public class ConnectionHandler {
     public static Connection getConnection ( ) {
        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelReservationApp", "root", "12345");
            return connection;
        } catch ( Exception e ) {
            return null;
        }

    }
}
