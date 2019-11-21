/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInstanciaDatos;


public class Usuario {
    
    
    
    //Definiendo variables privadas
    private String cod_usu ;
private String cod_emp;
private String nom_usu;
private String password;
private String cargo;


    public Usuario() {
    }
       //Instanciando de cada una de las variables
    public Usuario(int cod_distrito, String nom_distrito, String cod_usu, String cod_emp, String nom_usu, String password) {
      
        this.cod_usu = cod_usu;
        this.cod_emp = cod_emp;
        this.nom_usu = nom_usu;
        this.password = password;
        this.cargo=cargo;
        
    }

    //Estableciendo una igualdad entre variables privadas y sus metodos publicos
    
    public String getCod_usu() {
        return cod_usu;
    }

    public void setCod_usu(String cod_usu) {
        this.cod_usu = cod_usu;
    }

    public String getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(String cod_emp) {
        this.cod_emp = cod_emp;
    }

    public String getNom_usu() {
        return nom_usu;
    }

    public void setNom_usu(String nom_usu) {
        this.nom_usu = nom_usu;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
     //Conectando variables del programa con las columnas de la data base
    @Override
    public String toString() {
        return "Usuario{" +  ", cod_usu=" + cod_usu + ", cod_emp=" + cod_emp + ", nom_usu=" + nom_usu + ", password=" + password + '}';
    }

    
    
}
