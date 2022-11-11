
package CODE;


public class guardar_detalle_venta {
       int Codigo;
       String nombre_prod;
       int precio;
       int cantidad;
       float monto_pro;
       int Id_venta;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getMonto_pro() {
        return monto_pro;
    }

    public void setMonto_pro(float monto_pro) {
        this.monto_pro = monto_pro;
    }

    public int getId_venta() {
        return Id_venta;
    }

    public void setId_venta(int Id_venta) {
        this.Id_venta = Id_venta;
    }

    public guardar_detalle_venta() {
    }
}
