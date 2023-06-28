package org.brief.simplon;

public class EmployeeCommission extends  Employee {
    private int ventes;
    private double commission;
    private double salaire;

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public int getVentes() {
        return ventes;
    }

    public void setVentes(int ventes) {
        this.ventes = ventes;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public EmployeeCommission(String nom, String prenom, String dateDeNaissance, double salaire,int ventes, double commission) {
        super(nom, prenom, dateDeNaissance);
        this.ventes = ventes;
        this.commission = commission;
        this.salaire=salaire;

    }

    @Override
    public double calculDeSalaire() {
        return salaire + commission*ventes;
    }

    @Override
    public String toString() {
        return "EmployeeHoraire{" +
                ", ventes=" + ventes +
                ", commission=" + commission +
                '}';
    }
}
