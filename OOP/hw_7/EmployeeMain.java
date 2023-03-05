package OOP.hw_7;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", "Maklay", "Sales department", 3500);
        Employee e2 = new Employee("John", "Maklay", "IT department", 5200);
        Employee e3 = new Employee("Peter", "Symon", "IT department", 2800);

        System.out.println("e1: " + e1 + "\ne2: " + e2 + "\nрезультат сравнения (equals):" + e1.equals(e2) + "\n");
        System.out.println("e2: " + e2 + "\ne3: " + e3 + "\nрезультат сравнения (equals):" + e2.equals(e3) + "\n");

        System.out.println(e1.hashCode() == e2.hashCode());
        System.out.println(e2.hashCode() == e3.hashCode());
    }
}
