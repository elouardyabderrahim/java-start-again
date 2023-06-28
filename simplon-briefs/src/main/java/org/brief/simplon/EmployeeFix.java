package org.brief.simplon;

public class EmployeeFix extends  Employee {
    private double salaire;

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public EmployeeFix(String nom, String prenom, String dateDeNaissance,double salaire) {
        super(nom,prenom,dateDeNaissance);
        this.salaire = salaire;
    }


    @Override
    public double calculDeSalaire() {
        return salaire;
    }
}
