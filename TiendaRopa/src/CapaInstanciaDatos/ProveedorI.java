
package CapaInstanciaDatos;


public class ProveedorI {
    //Definiendo variables privadas
private String cod_prov;
private String nom_prov;
private String contacto;

    public ProveedorI() {
    }
       //Instanciando de cada una de las variables
    public ProveedorI(String cod_prov, String nom_prov, String contacto) {
        this.cod_prov = cod_prov;
        this.nom_prov = nom_prov;
        this.contacto = contacto;
    }
    //Estableciendo una igualdad entre variables privadas y sus metodos publicos
    public String getCod_prov() {
        return cod_prov;
    }

    public void setCod_prov(String cod_prov) {
        this.cod_prov = cod_prov;
    }

    public String getNom_prov() {
        return nom_prov;
    }

    public void setNom_prov(String nom_prov) {
        this.nom_prov = nom_prov;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
     //Conectando variables del programa con las columnas de la data base
    @Override
    public String toString() {
        return "ProveedorI{" + "cod_prov=" + cod_prov + ", nom_prov=" + nom_prov + ", contacto=" + contacto + '}';
    }


}
