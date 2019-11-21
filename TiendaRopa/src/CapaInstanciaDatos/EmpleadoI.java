
package CapaInstanciaDatos;


public class EmpleadoI {
    //Definiendo variables privadas
    private String cod_emp;
private String pat_emp;
private String mat_emp;
private String nom_emp;
private String dir_emp;
private String contacto;
private String fecha_nac;

    public EmpleadoI() {
    }
       //Instanciando de cada una de las variables
    public EmpleadoI(String cod_emp, String pat_emp, String mat_emp, String nom_emp, String dir_emp, String contacto, String fecha_nac) {
        this.cod_emp = cod_emp;
        this.pat_emp = pat_emp;
        this.mat_emp = mat_emp;
        this.nom_emp = nom_emp;
        this.dir_emp = dir_emp;
        this.contacto = contacto;
        this.fecha_nac = fecha_nac;
    }
    //Estableciendo una igualdad entre variables privadas y sus metodos publicos
    public String getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(String cod_emp) {
        this.cod_emp = cod_emp;
    }

    public String getPat_emp() {
        return pat_emp;
    }

    public void setPat_emp(String pat_emp) {
        this.pat_emp = pat_emp;
    }

    public String getMat_emp() {
        return mat_emp;
    }

    public void setMat_emp(String mat_emp) {
        this.mat_emp = mat_emp;
    }

    public String getNom_emp() {
        return nom_emp;
    }

    public void setNom_emp(String nom_emp) {
        this.nom_emp = nom_emp;
    }

    public String getDir_emp() {
        return dir_emp;
    }

    public void setDir_emp(String dir_emp) {
        this.dir_emp = dir_emp;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }


}
