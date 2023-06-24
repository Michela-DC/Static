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

import java.util.Random;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();
    }

    // a private static void method called keepTrackOfEmployeesNumber() that increments by 1 the totalNumberOfEmployees
    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    // a private String method called generateBadgeIdCode() that returns a String containing name and surname of the employee between two random String codes (e.g. XYZNameSurnameZYX)
    private String generateBadgeIdCode() {
        String name = employee.getName();
        String surname = employee.getSurname();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int randomStringLength = 3;
        StringBuilder firstStringBuilder = new StringBuilder(randomStringLength); //StringBuilder is a class used to create a mutable, or in other words, a modifiable succession of characters
        StringBuilder secondStringBuilder = new StringBuilder(randomStringLength);
        String firstRandomString = "";
        String secondRandomString = "";
        Random random1 = new Random(); // creando un'inistanza di random si crea un generatore di numeri casuali
        Random random2 = new Random();

        for(int i = 0; i < randomStringLength; i++) {
            //creo un indice random usando random1.nextInt(characters.length()) che genera un index random tra 0 e il valore che gli indico tra parentesi
            int firstRandomIndex = random1.nextInt(characters.length());
            // creo la random String aggiungendo con append a firstStringBuilder il carattere di characters all'indice random che ho creato sopra, poi transformo in stringa perché la consegna chiede una random String
            firstRandomString = firstStringBuilder.append(characters.charAt(firstRandomIndex)).toString(); //The charAt() method returns the character at the specified index in a string

            int secondRandomIndex = random2.nextInt(characters.length());
            secondRandomString = secondStringBuilder.append(characters.charAt(secondRandomIndex)).toString();
        }

        return firstRandomString + name + surname + secondRandomString;
    }

    // a public void method called showBadgeDetails() that informs the user about: the total number of employee tracked by the badges, the details of the employee, the badgeIdCode
    public void showBadgeDetails() {
        System.out.println("The total number of employees tracked by the badges is: " + totalNumberOfEmployees);
        System.out.println(employee.getEmployeeDetails());
        System.out.println(employee.getName() + " " + employee.getSurname() + " badge id code: " + badgeIdCode);
    }

    // Posso anche creare un metodo solo per generare le stringhe random esempio:
//    private String generaterandomString() {
//        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//        int randomStringLength = 3;
//        Random random = new Random(); // random
//        String randomString = "";
//        StringBuilder stringBuilder = new StringBuilder(randomStringLength);
//
//        for(int i = 0; i < randomStringLength; i++) {
//            int randomIndex = random.nextInt(characters.length());
//            randomString = stringBuilder.append(characters.charAt(randomIndex)).toString(); //The charAt() method returns the character at the specified index in a string
//        }
//
//        return randomString;
//    }
//    poi in generateBadgeIdCode() faccio return generaterandomString() + name + surname + generaterandomString();
}
