package org.brief.simplon;

public class EmployeeHoraire extends Employee {

    private int heures;
    private int tauxHoraires;
    private double salaire;


    public EmployeeHoraire(String nom, String prenom, String dateDeNaissance, int heures,int tauxHoraires) {
        super(nom, prenom, dateDeNaissance);
        this.heures = heures;
        this.tauxHoraires=tauxHoraires;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getTauxHoraires() {
        return tauxHoraires;
    }

    public void setTauxHoraires(int tauxHoraires) {
        this.tauxHoraires = tauxHoraires;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public double calculDeSalaire() {
        return tauxHoraires*heures;
    }
}
