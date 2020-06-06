
package Modelo;

public class Persona {
    int id;
    String dni;
    String nom;
    String app;
    String apm;
    String em;
    String ed;
    
    public Persona() {
    }

    public Persona(String dni, String nom) {
        
        this.dni = dni;
        this.nom = nom;
        this.app = app;
        this.apm = apm;
        this.em = em;
        this.ed = ed;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public String getEm() {
        return em;
    }

    public void setEm(String em) {
        this.em = em;
    }

    public String getEd() {
        return ed;
    }

    public void setEd(String ed) {
        this.ed = ed;
    }
    
    
    
}
