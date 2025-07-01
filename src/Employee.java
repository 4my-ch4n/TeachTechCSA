public class Employee {
    private String name;
    private String empId;
    private int pay;

    public Employee() {
        name = null;
        empId = null;
        pay = 0;
    }

    public Employee(String name, String empId, int pay) {
        this.name = name;
        this.empId = empId;
        this.pay = pay;
    }

    public Employee(String name, String empId) {
        this.name = name;
        this.empId = empId;
        pay = 20;
    }
}
