public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Marek Stuard", 2000);
        employees[1] = new Employee("Wojtek Jesionka", 6500);
        employees[2] = new Employee("Bob Marley", 1300);
        employees[3] = new Employee("Grzegorz Kogucik", 9800);
        employees[4] = new Employee("Michał Szpak", 5000);
      
        System.out.println("Dane dla pracownika o indeksie 3:");
        System.out.println(employees[3]);
        employees[3].setSalary(10000);

        System.out.println("\nDane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
