package org.brief.simplon;

import java.util.Date;

public class Employee {


    private String nom;
    private String prénom;

    private Date dateDeNaissance;

    public Employee(String nom, String prenom, String dateDeNaissance) {
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
    public double  calculDeSalaire(){
        return 0.0;
    }



}
