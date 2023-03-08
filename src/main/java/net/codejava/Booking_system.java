/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class Booking_system {

    public static void main(String[] args) {
            String databaseURL = "jdbc:derby:C:/database/booking";
        try {
            //        System.out.println("Hello World!");
            Connection connection = DriverManager.getConnection(databaseURL);
            System.out.println("Connected to database");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
