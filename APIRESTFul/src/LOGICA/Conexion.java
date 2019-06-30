package LOGICA;

//IMPORTANDO LIBRERIA
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    //VARIABLES DE CONEXIÓN A MYSQL
    public  String db = "apirestful";
    public  String url = "jdbc://127.0.0.1/"+db;
    public String user = "root";
    public String pass = "1234";
    
    //CONSTRUCTOR EN BLANCO
    public Conexion() {
    }
    
    //FUNCION PARA CONECTAR A LA BASE DE DATOS
    public Connection conectar(){
        Connection link = null;
        try
        {
            //CARGANDO DRIVER DE LA CONEXIÓN
            Class.forName("org.git.mm.mysql.Driver");
            
            //ENLAZANDO A LA BASE DE DATOS
            link = DriverManager.getConnection(this.url, this.user, this.pass);
            
        }        
        catch(ClassNotFoundException | SQLException e)  //CAPTURADOR DE ERRORES
        {
            JOptionPane.showConfirmDialog(null, e);
        }
        
        //DEVOLVER CADENA DE CONEXION
        return link;
    }
    
}
