package oop;

public class Employee {

    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
        Employee[] employees = department.getEmployees();

        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) count++;
            if (count == 1) employees[i] = this;
        }
        if (count==0) {
            throw new IllegalArgumentException("В указанном отделе нет столько вакантных мест");
        }
    }

    @Override
    public String toString() {
        if (department == null ||
                department.getManager() == null ||
                    department.getName() == null ||
                        department.getName().isEmpty()) return "Это не наш сотрудник";

        if (department.getManager() == this) return String.format("%s начальник отдела %s", name, department.getName());
        return String.format("%s работает в отделе %s, начальник которого %s",
                                    name, department.getName(), department.getManagerName()) ;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        //1.2.4
        // Необходимо выполнить следующие задачи:
        //1.	Создать Сотрудников Петрова, Козлова, Сидорова работающих в отделе IT.
        //2.	Сделать Козлова начальником IT отдела.
        //3.	Вывести на экран текстовое представление всех трех Сотрудников
        //(у всех троих должен оказаться один и тот же отдел и начальник).

        Department it = new Department("IT");
        Employee employee1 = new Employee("Козлов", it);
        Employee employee2 = new Employee("Петров", it);
        Employee employee3 = new Employee("Сидоров", it);
        Employee employee4 = new Employee("Петухов", it);
        Employee employee5 = new Employee("Баранов", it);
        Employee employee6 = new Employee("Собакин", it);
        Employee employee7 = new Employee("Кошкин", it);
        Employee employee8 = new Employee("Курицын", it);
        Employee employee9 = new Employee("Коровин", it);
        Employee employee10 = new Employee("Быков", it);
        //Employee employee11 = new Employee("Воронин", it);
        it.setManager(employee1);
        System.out.println(employee1);

        System.out.println(employee2);
        System.out.println(employee3);

        // 1.3.4. Сотрудники и отделы. Измените решение, полученное в задаче 1.2.4 таким образом,
        // чтобы имея ссылку на сотрудника, можно было бы узнать список всех сотрудников этого отдела.
        System.out.println(it.getEmployeesList());
    }
}
