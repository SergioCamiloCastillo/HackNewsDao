package Controlador;

import Modelo.Noticia;
import Modelo.NoticiaDao;
import Modelo.NoticiaDaoImpl;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class NoticiasController {

    public void validarNoticia(String titulo, String url, String texto, String fecha) {
        NoticiaDao noticia=new NoticiaDaoImpl();
        noticia.insert(new Noticia(titulo,url,texto,fecha));
    }
    
        /*
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.err.println("ERROR");
            e.printStackTrace();
        }
        Connection conn = null;
        try {

            // abrir la conexion 
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ser", "root", "");

            //conn=DriverManager.getConnection(DB_URL+DB_NAME+DB_USER+DB_PASS);
            Statement stmt = conn.createStatement();
            // enviar el comando insert
            stmt.executeUpdate("INSERT INTO s "
                    + "VALUES ('" + titulo + "', '" + url + "', '" + texto + "','"+fecha+"')");

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
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";*/
}
