package org.brief.simplon;
import java.util.*;
public class Main {
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         Employee employee=new Employee();
        System.out.println("Enter your name please!");
        employee.setName(scanner.nextLine());
        System.out.println("Hello ! " + employee.getName());
        System.out.println("Enter your payment mode : n/ 1.Monthly 2.Weekly");
        int mode;
        mode=scanner.nextInt();

    if( mode==2){
        System.out.println("Weekly mode!!");
        System.out.println("Enter number of hours");
        employee.setNumberOfHours(scanner.nextInt());
        System.out.println("Enter tarif :");
        employee.setTarif(scanner.nextInt());
        employee.weeklySalary();

    }
    else if (mode==1){
        System.out.println("Monthly mode!!");
        System.out.println("Enter number of hours");
        employee.setNumberOfHours(scanner.nextInt());
        System.out.println("Enter tarif :");
        employee.setTarif(scanner.nextInt());
        employee.monthlySalary();

    }
    else{
        System.out.println("please choose between 1 or 2 !");
    }


    }
}
