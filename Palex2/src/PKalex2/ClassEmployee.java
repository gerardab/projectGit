package PKalex2;


import java.util.Date;

public class ClassEmployee extends ClassPeople {

    private EnumPosition position;
    private float salary;

    public ClassEmployee(String name, String last_name, String dni, String email, float salary, Date date, EnumPosition position) {
        super(name, last_name, dni, email, date);
        setSalary(salary);
        setPosition(position);
    }

    public ClassEmployee(String name, String last_name, String dni, String email, Date date) {
        super(name, last_name, dni, email, date);
        
    }

    public EnumPosition getPosition() {
        return position;
    }

    public void setPosition(EnumPosition position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString() {
        String txt = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(txt);
        sb.append("\nPosition: " + getPosition());
        sb.append("\nSalary: " + getSalary() + "\n");

        return txt;
    }

}
