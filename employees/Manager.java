package employees;

public class Manager extends Employee {
    public Integer numberOfSubordinates;

    public Manager(String fullName, double salary, Integer numberOfSubordinates) {
        super(fullName, salary);
        this.numberOfSubordinates = numberOfSubordinates;

    }

    public Integer getNumberOfSubordinates(){
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(Integer numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;
    }
    
    @Override
    public String toString() {
        return "Manager: " + getName() + ", Salary: " + getSalary() + ", Subordinates: " + numberOfSubordinates;
    }
}
