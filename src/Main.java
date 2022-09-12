public class Main {
    private static Employee[] employees = new Employee[10];
    private static double sumSalary;

    public static void main(String[] args) {
        System.out.println(employees.toString());
        employees[0] = new Employee("Dmitry", "Fedorov", "Olegovitch", 1, 50_000);
        employees[1] = new Employee("Dmitr", "Fedoro", "Olegovitc", 2, 50_500);
        employees[2] = new Employee("Dmit", "Fedor", "Olegovit", 2, 500);
        employees[3] = new Employee("Dmi", "Fedo", "Olegovi", 1, 50_000);
        employees[4] = new Employee("Dm", "Fed", "Olegov", 3, 50_000);
        employees[5] = new Employee("D", "Fe", "Olego", 1, 50_000);
        employees[6] = new Employee("Dm", "F", "Oleg", 4, 50_000);
        employees[7] = new Employee("Dmi", "Fe", "Ole", 1, 50_000);
        employees[8] = new Employee("Dmit", "Fed", "Ol", 5, 60_000);
        employees[9] = new Employee("Dmitr", "Fedo", "O", 5, 50_000);
        employees[0] = null;

        System.out.println(averageSalary());
        System.out.println(toLowSalary());
        System.out.println(toHighSalary());
        System.out.println(toSumSalary());

        printNameEmployees();
        printOnlyName();
    }

    public static void printNameEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    public static double toSumSalary() {
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalary = sumSalary + employee.getSalary();
            }
        }
        return sumSalary;
    }

    public static double toLowSalary() {
        double lowSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee == null) continue;
            if (lowSalary > employee.getSalary()) {
                lowSalary = employee.getSalary();
            }
        }

        return lowSalary;
    }

    public static double toHighSalary() {
        double highSalary = 0;
        for (Employee employee : employees) {
            if (employee == null) continue;
            if (highSalary < employee.getSalary()) {
                highSalary = employee.getSalary();
            }
        }
        return highSalary;
    }

    public static double averageSalary() {
        double sum = 0;
        int counterEmployeer = 0;
        double average;
        for (Employee employee : employees) {
            if (employee == null) continue;
            counterEmployeer++;
            sum += employee.getSalary();
        }
        average = sum / counterEmployeer;
        return average;
    }

    public static void printOnlyName() {
        for (Employee employee : employees) {
            if (employee == null) continue;
            System.out.println(employee.getName()+" " + employee.getLastName());
        }
    }
}