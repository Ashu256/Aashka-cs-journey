class Employee {

    String name;
    int id;
    double salary;

    Employee() {
        name = "Rahul";
        id = 101;
        salary = 30000.0;
    }
    Employee(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {

        Employee emp1 = new Employee();

        Employee emp2 = new Employee("Amit", 102, 45000.0);

        System.out.println("Employee 1 Details:");
        emp1.display();

        System.out.println("Employee 2 Details:");
        emp2.display();
    }
}



