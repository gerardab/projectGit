package PKalex2;


import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;


public class ClassTeacher extends ClassPeople{
    
    
    private float salary;
    private ArrayList<ClassStudent> ALstudents = new ArrayList<ClassStudent>();
 
    public ClassTeacher(String name, String last_name, String dni, String email, Date date) {
        super(name, last_name, dni, email, date);
        
    }
    
    public ClassTeacher(String name, String last_name, String dni, String email, float salary, Date date) {
        super(name, last_name, dni, email, date);
        setSalary(salary);
    }
    
    public ClassTeacher(String name, String last_name, String dni, String email, float salary, Date date, ClassStudent students) {
        super(name, last_name, dni, email, date);
        setSalary(salary);
        addStudents(students);
    }
   
    
    
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    public ArrayList <ClassStudent> getStudents() {
        return ALstudents;
    }
    public void setStudents(ArrayList<ClassStudent> students) {
        this.ALstudents = ALstudents;
    }
    public boolean addStudents(ClassStudent students) {
        boolean ok=false;
        if(!ALstudents.contains(students)){
            ALstudents.add(students);
            students.setTeacher(this);
            ok= true;
        }
        return ok;
    }
    
    public String toString() {
        String txt = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(txt);
        sb.append("\nSalary: " + getSalary());
        sb.append("\nStuents: " + getStudents() + "\n");

        return txt;
    }
}
