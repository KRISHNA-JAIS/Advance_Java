package advance12;

public class Employee {
    private int EmpID;
    private String EmpName;
    private int age;

    public Employee(int EmpID, String EmpName, int age){
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.age = age;
    }

    public int getEmpID() {
        return EmpID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String  toString(){
        return "Employee{" +
                "empId=" + EmpID +
                ", empName='" + EmpName + '\'' +
                ", age=" + age +
                '}';

    }
}
