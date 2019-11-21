
package CapaInstanciaDatos;

public class DetalleComprobanteI {
    
    //Definiendo variables privadas
    private String cod_comprobante;
private String cod_pro;
private Double precio;
private int cant;

    public DetalleComprobanteI() {
    }
       //Instanciando de cada una de las variables
    public DetalleComprobanteI(String cod_comprobante, String cod_pro, Double precio, int cant) {
        this.cod_comprobante = cod_comprobante;
        this.cod_pro = cod_pro;
        this.precio = precio;
        this.cant = cant;
    }
    //Estableciendo una igualdad entre variables privadas y sus metodos publicos
    public String getCod_comprobante() {
        return cod_comprobante;
    }

    public void setCod_comprobante(String cod_comprobante) {
        this.cod_comprobante = cod_comprobante;
    }

    public String getCod_pro() {
        return cod_pro;
    }

    public void setCod_pro(String cod_pro) {
        this.cod_pro = cod_pro;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
     //Conectando variables del programa con las columnas de la base de datos
    @Override
    public String toString() {
        return "DetalleComprobanteI{" + "cod_comprobante=" + cod_comprobante + ", cod_pro=" + cod_pro + ", precio=" + precio + ", cant=" + cant + '}';
    }


}
