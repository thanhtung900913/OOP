package week1.oop;

import java.util.Scanner;

public class PensionContributionCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the salary: $");
        int salary = scan.nextInt();
        System.out.print("Enter the age: ");
        int age = scan.nextInt();
        // Declare constants
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_AND_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_AND_ABOVE = 0.05;
        // Declare variables
        int contributableSalary;
        double employeeContribution;
        double employerContribution;
        double totalContribution;
        // Check the contribution cap
        if (salary > 6000){
            contributableSalary = 6000;
        }else {
            contributableSalary = salary;
        }
        // Compute various contributions in ”double” using a nested-if to handle 4 cases
        if (age <= 55){
            employeeContribution = contributableSalary*EMPLOYEE_RATE_55_AND_BELOW;
            employerContribution = contributableSalary*EMPLOYER_RATE_55_AND_BELOW;
            totalContribution = employeeContribution+employerContribution;
            System.out.printf("The employee's contribution is: $%.2f%n",employeeContribution);
            System.out.printf("The employer's contribution is: $%.2f%n",employerContribution);
            System.out.printf("The total contribution is: $%.2f%n",totalContribution);
        }else if(age <= 60){
            employeeContribution = contributableSalary*EMPLOYEE_RATE_55_TO_60;
            employerContribution = contributableSalary*EMPLOYER_RATE_55_TO_60;
            totalContribution = employeeContribution+employerContribution;
            System.out.printf("The employee's contribution is: $%.2f%n",employeeContribution);
            System.out.printf("The employer's contribution is: $%.2f%n",employerContribution);
            System.out.printf("The total contribution is: $%.2f%n",totalContribution);
        }else if(age <= 65){
            employeeContribution = contributableSalary*EMPLOYEE_RATE_60_TO_65;
            employerContribution = contributableSalary*EMPLOYER_RATE_60_TO_65;
            totalContribution = employeeContribution+employerContribution;
            System.out.printf("The employee's contribution is: $%.2f%n",employeeContribution);
            System.out.printf("The employer's contribution is: $%.2f%n",employerContribution);
            System.out.printf("The total contribution is: $%.2f%n",totalContribution);
        }else{
            employeeContribution = contributableSalary*EMPLOYEE_RATE_65_AND_ABOVE;
            employerContribution = contributableSalary*EMPLOYER_RATE_65_AND_ABOVE;
            totalContribution = employeeContribution+employerContribution;
            System.out.printf("The employee's contribution is: $%.2f%n",employeeContribution);
            System.out.printf("The employer's contribution is: $%.2f%n",employerContribution);
            System.out.printf("The total contribution is: $%.2f%n",totalContribution);
        }
    }
}