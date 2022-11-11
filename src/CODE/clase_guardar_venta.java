/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODE;

public class clase_guardar_venta {
    
    float total;
    String facturado_por;

    public clase_guardar_venta() {
    }

    public clase_guardar_venta(float total, String facturado_por) {
        this.total = total;
        this.facturado_por = facturado_por;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getFacturado_por() {
        return facturado_por;
    }

    public void setFacturado_por(String facturado_por) {
        this.facturado_por = facturado_por;
    }
    
    
    
    
}
