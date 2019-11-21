
package CapaInstanciaDatos;


public class CategoriaI {
    
    //Definiendo variables
private String cod_cate;
private String nom_cate;




    //Estableciendo una igualdad entre variables privadas y sus metodos publicos
    public CategoriaI(String cod_cate, String nom_cate) {
        this.cod_cate = cod_cate;
        this.nom_cate = nom_cate;
    }

    public CategoriaI() {
    }

    public String getCod_cate() {
        return cod_cate;
    }

    public void setCod_cate(String cod_cate) {
        this.cod_cate = cod_cate;
    }

    public String getNom_cate() {
        return nom_cate;
    }

    public void setNom_cate(String nom_cate) {
        this.nom_cate = nom_cate;
    }


}
