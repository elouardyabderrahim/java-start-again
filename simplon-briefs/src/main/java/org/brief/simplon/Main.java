package org.brief.simplon;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        // ----------Polymorphism-----------
        Employee employee = new EmployeeFix("bika","mohammed","10-12-2000",2300);
        Employee employeeCommission = new EmployeeCommission("Hassan","Elouardy","22-12-1997",2300,23,0.25);
        Employee employeeHoraire = new EmployeeHoraire("Abderrahim","Elouardy","13-12-1996",12,200);



        System.out.println("-----------Employee Fix-----------");
        System.out.println(employee.calculDeSalaire());

        System.out.println("-----------Employee Horaire-----------");

        System.out.println(employeeHoraire.calculDeSalaire());

        System.out.println("-----------Employee commission-----------");

        System.out.println(employeeCommission.calculDeSalaire());

    }
}
