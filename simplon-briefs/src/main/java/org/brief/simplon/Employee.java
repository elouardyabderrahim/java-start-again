package org.brief.simplon;

public class Employee {


    private String name;
    private float salary;
    private int numberOfHours;
    private int tarif;

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    private PaymentMode paymentMode;

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        salary = salary;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }
    public Employee() {

    }
    public Employee(String name, float salary, int numberOfHours) {
        this.name = name;
        salary = salary;
        this.numberOfHours = numberOfHours;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Salary=" + salary + " DH"+
                ", numberOfHours=" + numberOfHours +
                ", tarif=" + tarif +" DH"+
                ", paymentMode=" + paymentMode +
                '}';
    }
    void monthlySalary(){
        if (tarif>=20){
            System.out.println("inside the monthly method.........");

            paymentMode=PaymentMode.Monthly;
            if(numberOfHours<=180){
            salary=(numberOfHours*tarif);
                System.out.println(toString());

            }
            else if(numberOfHours>180 && numberOfHours<=200){
                salary=(180*tarif+(numberOfHours-180)*(tarif+tarif*(1/2)));
                System.out.println(toString());

            }
            else{
                System.out.println("le nombre des heures ne doit pas depasse 200 heures! ");
            }
        }else{
            System.out.println("le tarif ne doit pas etre inferieure a 20 DH");

        }

    }


    void weeklySalary(){
        if (tarif>=50){
            System.out.println("inside the weekly method");
            paymentMode=(PaymentMode.Weekly);
            if(numberOfHours<=40){
                salary=(numberOfHours*tarif);
                System.out.println(toString());

            }
            else if(numberOfHours>40 && numberOfHours<=50){
                salary=(40*tarif+(numberOfHours-40)*(tarif+tarif*(1/2)));
                System.out.println(toString());

            }
            else{
                System.out.println("le nombre des heures ne doit pas depasse 50 heures! ");
            }
        }
        else{ System.out.println("le tarif ne doit pas etre inferieure a 25 DH");
        }
    }


}
