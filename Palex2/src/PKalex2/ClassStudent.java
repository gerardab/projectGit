package PKalex2;


import java.time.Instant;
import java.util.Date;
import javax.print.attribute.standard.DateTimeAtCompleted;

public class ClassStudent extends ClassPeople {


    private int age;
    private int[] mark = new int[2];
    private float registration;
    private ClassTeacher teacher;

    public ClassStudent(String name, String last_name, String dni, String email, Date date){
        super(name, last_name, dni, email, date);
        
        
        
    }

    public ClassStudent(String name, String last_name, String dni, String email, int age, int[] mark, float registration, Date date) {
        super(name, last_name, dni, email, date);
        setAge(age);
        setMark(mark);
        setRegistration(registration);
    }
    
    public ClassStudent(String name, String last_name, String dni, String email, int age, int[] mark, float registration, Date date, ClassTeacher teacher) {
        super(name, last_name, dni, email, date);
        setAge(age);
        setMark(mark);
        setRegistration(registration);
        setTeacher(teacher);
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getMark() {
        return mark;
    }

    public void setMark(int[] mark) {
        this.mark = mark;
    }

    public float getRegistration() {
        return registration;
    }

    public void setRegistration(float registration) {
        this.registration = registration;
    }

    public ClassTeacher getTeacher() {
        return teacher;
    }

    public void setTeacher(ClassTeacher teacher) {
        this.teacher = teacher;
    }

    public String toString() {
        String txt = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(txt);
        sb.append("\nAge: " + getAge());
        sb.append("\nMark: " + getMark());
        sb.append("\nRegistartion: " + getRegistration());
        sb.append("\nTeacher: " + getTeacher() + "\n");

        return txt;
    }

}
