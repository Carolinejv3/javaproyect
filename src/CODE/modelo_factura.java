
package CODE;

import CODE.clase_guardar_venta;
import CODE.guardar_detalle_venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import CODE.MyConnection;


public class modelo_factura {
    
          MyConnection cc = new MyConnection();
       Connection cn = MyConnection.getConnection();
       PreparedStatement ps; 
       ResultSet rs;
       int r=0;
       
       
    public int GuardarFactura(clase_guardar_venta Fact){
       clase_guardar_venta factura=new clase_guardar_venta();
       String sql="insert into ventas( total, facturado_por ) values(?,?)";
       try{
         
           Connection cn = MyConnection.getConnection();
           ps = cn.prepareStatement(sql);
           ps.setString(2,Fact.getFacturado_por());
           ps.setFloat(1,Fact.getTotal());
           r=ps.executeUpdate();
           
        }catch(SQLException ex){
        Logger.getLogger(modelo_factura.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
    
        return r;
    }
    
    public int GuardarDetalleVenta(guardar_detalle_venta dv){
        String sql = "insert into detalle_ventas(Codigo,nombre,precio,cantidad,monto_pro,ID_ventas) values(?,?,?,?,?,?)";
        
        try{
        Connection cn = MyConnection.getConnection();
        ps = cn.prepareStatement(sql);
        ps.setInt(1, dv.getCodigo());
        ps.setString(2, dv.getNombre_prod());
        ps.setInt(3, dv.getPrecio());
        ps.setFloat(4, dv.getCantidad());
        ps.setFloat(5, dv.getMonto_pro());
        ps.setInt(6, dv.getId_venta());
        
        ps.executeUpdate();
         
         
        }catch(SQLException ex){
        Logger.getLogger(modelo_factura.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        
    return r;
    }
    
    
}
