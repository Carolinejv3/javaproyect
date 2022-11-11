
package CODE;


public class clase_producto {
    int codigo;
    String nombre;
    int precio;
    int Stock;

    public clase_producto() {
    }

    public clase_producto(int codigo, String nombre, int precio, int Stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.Stock = Stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
}
