public class Employee {
    private final String name;
    private final String lastName;
    private final String midlleName;
    private int department; //отдел
    public int id; //значение id
    private double salary; // зп
    private static int counter = 1; //счетчик


    public void setDepartment(int department) {
        if (department < 0 || department >= 6) {throw new IllegalArgumentException("Такого депортамента нет");}

        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMidlleName() {
        return midlleName;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }


    public Employee(String name, String lastName, String midlleName, int department, int salary) {
        if (department < 0 || department >= 6){ throw new IllegalArgumentException("Такого депортамента нет");}
        this.name = name;
        this.lastName = lastName;
        this.midlleName = midlleName;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        counter++;
    }


    public String toString() {
        return "Сотруднк-" + "{Имя='" + name + '\'' + ", Отчество='" + lastName + '\'' + ", Фамилия='" + midlleName + '\'' + ", Отдел=" + department + ", id=" + id + ", ЗП=" + salary + '}';


    }
}