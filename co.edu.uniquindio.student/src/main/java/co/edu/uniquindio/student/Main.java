package co.edu.uniquindio.student;

import co.edu.uniquindio.student.model.Student;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Student student001 = new Student("Juan David Romer Alvarado", 23, "jdra@gmail.com", "older", 4.3f, 2.1f, 4.5f);
        Student student002 = new Student("Maria Perez", 21, "mperez@gmail.com", "younger", 3.5f, 2.8f, 4.1f);
        Student student003 = new Student("Carlos Rodriguez", 22, "crodriguez@gmail.com", "younger", 4.0f, 3.2f, 4.5f);
        Student student004 = new Student("Sofia Gomez", 20, "sgomez@gmail.com", "younger", 3.7f, 2.1f, 4.0f);
        Student student005 = new Student("Andres Torres", 23, "atorres@gmail.com", "older", 4.5f, 3.9f, 4.7f);

        System.out.println("Average student001: " + student001.calculateAverageGrade());//method1

        System.out.println("Average student002: " + student002.calculateAverageGrade());





    }


}