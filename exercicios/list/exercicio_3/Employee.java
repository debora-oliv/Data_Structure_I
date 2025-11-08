package list.exercicio_3;

public class Employee {
    private static Integer nextId = 0;
    private Integer id;
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.id = ++nextId;
        this.name = name;
        if(salary >= 100 && salary <= 8000.0)
            this.salary = salary;
        else
            throw new IllegalArgumentException("Salary must be between 100 and 8000.");
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary >= 100 && salary <= 8000.0)
            this.salary = salary;
        else
            throw new IllegalArgumentException("Salary must be between 100 and 8000.");
    }

    public void increaseSalary(double percentage) {
        double newSalary = getSalary() + getSalary()*percentage/100;
        setSalary(newSalary);
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f", id, name, salary);
    }
}