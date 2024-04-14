public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
          int nonManagerCount = 0;

        employees[0] = new Manager("Marek Stuard", 2000);
        employees[1] = new Employee("Wojtek Jesionka", 6500);
        employees[2] = new Worker("Bob Marley", 1300);
        employees[3] = new Employee("Grzegorz Kogucik", 9800);
        employees[4] = new Worker("Michał Szpak", 5000);
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }
        ((Manager)employees[0]).setNumberOfSubordinates(nonManagerCount);
        employees[0].setSalary(7500);
        System.out.println("\nDane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
