
package CapaInstanciaDatos;

//Se crea la clase ProductoI
public class ProductoI {
    //Definiendo variables privadas
    private String cod_pro;
    private String nom_pro;
    private double precio;
    private int stock;
    private String cod_cate;
    private String cod_prov;
   
    public ProductoI() {
    }
    //Instanciando de cada una de las variables
    public ProductoI(String cod_pro, String nom_pro, double precio, int stock, String cod_cate, String cod_prov) {
        this.cod_pro = cod_pro;
        this.nom_pro = nom_pro;
        this.precio = precio;
        this.stock = stock;
        this.cod_cate = cod_cate;
        this.cod_prov = cod_prov;
    }
    //Estableciendo una igualdad entre variables privadas y sus metodos publicos
    public String getCod_pro() {
        return cod_pro;
    }

    public void setCod_pro(String cod_pro) {
        this.cod_pro = cod_pro;
    }

    public String getNom_pro() {
        return nom_pro;
    }

    public void setNom_pro(String nom_pro) {
        this.nom_pro = nom_pro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCod_cate() {
        return cod_cate;
    }

    public void setCod_cate(String cod_cate) {
        this.cod_cate = cod_cate;
    }

    public String getCod_prov() {
        return cod_prov;
    }

    public void setCod_prov(String cod_prov) {
        this.cod_prov = cod_prov;
    }
    //Conectando variables del programa con las columnas de la data base
    @Override
    public String toString() {
        return "ProductoI{" + "cod_pro=" + cod_pro + ", nom_pro=" + nom_pro + ", precio=" + precio + ", stock=" + stock + ", cod_cate=" + cod_cate + ", cod_prov=" + cod_prov + '}';
    }

    
}
