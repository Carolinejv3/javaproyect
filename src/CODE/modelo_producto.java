/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODE;

import CODE.clase_producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import CODE.MyConnection;

public class modelo_producto {
     int r;
    PreparedStatement ps;
    ResultSet rs;
    Connection cn;
    
    
    public clase_producto ListarId(int id_p){
    clase_producto p= new clase_producto();     
    String sql="select * from producto where id_producto=?";
   try{
        Connection cn = MyConnection.getConnection();
        ps = cn.prepareStatement(sql);
        ps.setInt(1, id_p);
        rs = ps.executeQuery();
        while(rs.next()){
            p.setCodigo(rs.getInt(1));
            p.setNombre(rs.getString(2));
            p.setPrecio(rs.getInt(3));
            p.setStock(rs.getInt(4));
           
        }
   
   
   }catch(SQLException ex){
           Logger.getLogger(modelo_producto.class.getName()).log(Level.SEVERE,null,ex);
           JOptionPane.showMessageDialog(null, "Error: "+ex);
        
        }
    
        return p;
    }
}
