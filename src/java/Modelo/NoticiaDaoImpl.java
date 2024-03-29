/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NoticiaDaoImpl implements NoticiaDao {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    private void registerDriver() {
        try {
            Class.forName(JDBC_DRIVER).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.err.println("ERROR");
            e.printStackTrace();
        }
    }

    @Override
    
   public void insert(Noticia noticia) {
        Connection conn = null;
        try {
            registerDriver();
            // abrir la conexion 
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hacknews", "root", "");

            //conn=DriverManager.getConnection(DB_URL+DB_NAME+DB_USER+DB_PASS);
            try (Statement stmt = conn.createStatement()) {
                // enviar el comando insert

                stmt.executeUpdate("INSERT INTO noticia "
                        + "VALUES (" + null + ",'" + noticia.getTitulo() + "', '" + noticia.getUrl() + "', '" + noticia.getTexto() + "','" + noticia.getFecha() + "')");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public void delete(Integer id) {
        Connection conn = null;
        try {
            registerDriver();
            // abrir la conexion 
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hacknews", "root", "");
            try (Statement stmt = conn.createStatement()) {
                // enviar el comando delete
                stmt.executeUpdate("delete from noticia where id_noticia = " + id + ";");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Noticia read(Integer id) {
        Connection conn = null;
        Noticia noticia = null;

        try {
            registerDriver();
            // abrir la conexion
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hacknews", "root", "");
            // consulta select (selecciona el producto con ID especificado)
            try (PreparedStatement ps = conn.prepareStatement(
                    "select * from noticia where id_noticia = "+id)) {
                // indicar el ID que buscamos
                //ps.setInt(1, id);
                // ejecutar la consulta
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        // obtener cada una de la columnas y mapearlas a la clase Product
                        noticia = new Noticia(id,rs.getString("titulo"),rs.getString("url"),rs.getString("texto"),rs.getString("fecha"));
                                
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return noticia;
    }

    @Override
    public void update(Noticia noticia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
