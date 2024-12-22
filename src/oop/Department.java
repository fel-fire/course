package oop;

public class Department {
    private String name;
    private Employee manager;
    private Employee[] employees = new Employee[10]; //чтобы не упрощать аррэйлистом взял цифру 10 - как будто по штату;

    public Department(String name) {
        this.name = name;
    }

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", manager=" + manager +
                '}';
    }

    public String getManagerName() {
        return manager.getName();
    }

    public String getEmployeesList() {
        String result = "";
        for (Employee e: employees) {
            result += e != null? e.getName() + "\n" : "ВАКАНТ\n";
        }
        return result;
    }

    public String getName() {
        return name;
    }


    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Employee[] getEmployees() {
        return employees;
    }
}
