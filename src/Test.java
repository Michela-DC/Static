//define a class Employee with:
//    3 instance variables name, surname and address
//    a constructor method that assigns 3 params (newEmployeeName, newEmployeeSurname, newEmployeeAddress) to the respective object's properties
//    a method getEmployeeDetails() that returns an informative String with all the details of the Employee
//define a class Badge with:
//    a private static int variable called totalNumberOfEmployees (the value of this variable will be shared across multiple class instances)
//    a private String variable called badgeIdCode
//    a public Employee variable called employee
//    a private static void method called keepTrackOfEmployeesNumber() that increments by 1 the totalNumberOfEmployees
//    a private String method called generateBadgeIdCode() that returns a String containing name and surname of the employee between two random String codes (e.g. XYZNameSurnameZYX)
//    a public void method called showBadgeDetails() that informs the user about:
//      the total number of employee tracked by the badges
//      the details of the employee
//      the badgeIdCode
//    a constructor method that takes an Employee param called employeeThatNeedsBadge and:
//      call the static method for keeping track of the number of employees
//      assign the value of employeeThatNeedsBadge to the object's employee property
//      assign a generated id code to the object's badgeIdCode
//define a tester class where you:
//    create 2 new Employee objects
//    create their new 2 Badge
//    show to the user the 2 employees' badge details

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Giulio", "Bianchi", "via Verdi n. 25, Roma");
        Employee employee2 = new Employee("Marta", "Sera", "via Marzo n.7, Milano");

        Badge employee1Badge = new Badge(employee1);
        Badge employee2Badge = new Badge(employee2);

        employee1Badge.showBadgeDetails();
        System.out.println(" ");
        employee2Badge.showBadgeDetails();
    }
}