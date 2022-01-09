package JavaCore.Day06.Ex01;

import java.util.ArrayList;

public class EmployeeManagement {
    public static void main (String[] args) {
        ArrayList<Employee> listEmployee = new ArrayList<>();

        System.out.println("Production staff");
        ProductionStaff productionStaff = new ProductionStaff();
        listEmployee.add(productionStaff.input());

        System.out.println("Daily staff");
        DailyStaff dailyStaff = new DailyStaff();
        listEmployee.add(dailyStaff.input());

        System.out.println("Manager");
        Manager manager = new Manager();
        listEmployee.add(manager.input());

        for (Employee employee : listEmployee) {
            employee.display();
        }
    }
}
