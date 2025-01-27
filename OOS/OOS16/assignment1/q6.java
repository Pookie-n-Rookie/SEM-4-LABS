import java.util.*;

class Employee {
    String name;
    int id;
    String addr;
    double sal;

    Employee(String n, int i, String a, double s) {
        name = n;
        id = i;
        addr = a;
        sal = s;
    }

    double getSal() {
        return this.sal;
    }

    String res() {
        return "Employee Name: " + name + "\nEmployee ID: " + id + "\nEmployee Address: " + addr + "\nEmployee Salary: " + sal;
    }
}

class Dept {
    String name, loc;
    ArrayList<Employee> emp;

    Dept(String n, String l) {
        name = n;
        loc = l;
        emp = new ArrayList<>();
    }

    void add(Employee e1) {
        emp.add(e1);
    }

    void remove(Employee e1) {
        emp.remove(e1);
    }

    void Yexp() {
        double t = 0;
        for (Employee e : emp) {
            t += e.getSal();
        }
        System.out.println("Yearly expenditure for department of " + name + " is " + t);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Dept itDept = new Dept("Information Technology", "Building A");

        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter details for employee " + i + ":");
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter address: ");
            String addr = scanner.nextLine();
            System.out.print("Enter salary: ");
            double sal = scanner.nextDouble();
            scanner.nextLine(); 

            itDept.add(new Employee(name, id, addr, sal));
        }

        
        itDept.Yexp();

        scanner.close();
    }
}

