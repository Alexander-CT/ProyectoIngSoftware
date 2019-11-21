
package CapaInstanciaDatos;


// se crea la clase clientes
public class ClientesI {
    //Definiendo variables
    private String cod_cli ;
    private String pat_cli;
    private String mat_cli;
    private String nom_cli;
    private String dir_cli ;
    private String sexo;
    private String dni_ruc;
    private String contacto;

    public ClientesI() {
    }


     //Instanciando de cada una de las variables
    public ClientesI(String cod_cli, String pat_cli, String mat_cli, String nom_cli, String dir_cli, String sexo, String dni_ruc, String contacto) {
        this.cod_cli = cod_cli;
        this.pat_cli = pat_cli;
        this.mat_cli = mat_cli;
        this.nom_cli = nom_cli;
        this.dir_cli = dir_cli;
        this.sexo = sexo;
        this.dni_ruc = dni_ruc;
        this.contacto = contacto;
    }
    //Estableciendo una igualdad entre variables privadas y sus metodos publicos
    public String getCod_cli() {
        return cod_cli;
    }

    public void setCod_cli(String cod_cli) {
        this.cod_cli = cod_cli;
    }

    public String getPat_cli() {
        return pat_cli;
    }

    public void setPat_cli(String pat_cli) {
        this.pat_cli = pat_cli;
    }

    public String getMat_cli() {
        return mat_cli;
    }

    public void setMat_cli(String mat_cli) {
        this.mat_cli = mat_cli;
    }

    public String getNom_cli() {
        return nom_cli;
    }

    public void setNom_cli(String nom_cli) {
        this.nom_cli = nom_cli;
    }

    public String getDir_cli() {
        return dir_cli;
    }

    public void setDir_cli(String dir_cli) {
        this.dir_cli = dir_cli;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDni_ruc() {
        return dni_ruc;
    }

    public void setDni_ruc(String dni_ruc) {
        this.dni_ruc = dni_ruc;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    //Conectando variables del programa con las columnas de la base de datos
    @Override
    public String toString() {
        return "Clientes{" + "cod_cli=" + cod_cli + ", pat_cli=" + pat_cli + ", mat_cli=" + mat_cli + ", nom_cli=" + nom_cli + ", dir_cli=" + dir_cli + ", sexo=" + sexo + ", dni_ruc=" + dni_ruc + ", contacto=" + contacto + '}';
    }
    



    
}
