public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Marek Stuard", 2000, 0);
        employees[1] = new Worker("Wojtek Jesionka", 6500);
        employees[2] = new Employee("Bob Marley", 1300);
        employees[3] = new Worker("Grzegorz Kogucik", 9800);
        employees[4] = new Employee("Michał Szpak", 5000);
        employees[5] = new Employee("Ludwik Wach", 5000);
        employees[6] = new Manager("Michał Wiśniewski", 5000, 0);
       for (Employee employee : employees) {
            double newSalary = employee.getSalary() + 500;
            employee.setSalary(newSalary);
        }
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager)employee).setNumberOfSubordinates(7500);
                employee.setSalary(7500);
            }
        }
        System.out.println("\nZaktualizowane informacje o pracownikach:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
