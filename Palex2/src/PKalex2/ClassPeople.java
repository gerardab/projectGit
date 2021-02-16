package PKalex2;

/*
Herecia: La herencia es un pilar importante de OOP (Programación Orientada a Objetos). 
Es el mecanismo en Java por el cual una clase permite heredar las características 
(atributos y métodos) de otra clase. Aprenda más a continuación.
En el lenguaje de Java, una clase que se hereda se denomina superclase. 
La clase que hereda se llama subclase. Por lo tanto, una subclase es una 
versión especializada de una superclase. Hereda todas las variables y métodos 
definidos por la superclase y agrega sus propios elementos únicos.


polimorfismo: En programación orientada a objetos, polimorfismo es la capacidad
que tienen los objetos de una clase en ofrecer respuesta distinta e 
independiente en función de los parámetros (diferentes implementaciones)
utilizados durante su invocación. Dicho de otro modo el objeto como entidad 
puede contener valores de diferentes tipos durante la ejecución del programa.
*/
import java.util.Date;

public class ClassPeople {

   
    protected String name;
    protected String last_name;
    protected String dni;
    protected String email;
    protected Date date;
    
    public ClassPeople(String name, String last_name, String dni, String email, Date date){
    
        setName(name);
        setLast_name(last_name);
        setDni(dni);
        setEmail(email);
        setDate(date);
        
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
    public String toString() {
        String txt = "";
        StringBuilder sb = new StringBuilder();

        sb.append("Name: " + getName());
        sb.append("\nLast Name: " + getLast_name());
        sb.append("\nDni: " + getDni());
        sb.append("\nE-mail: " + getEmail());
        sb.append("\nDate: " + getDate()+ "\n");

        return txt;
    }
    
}
