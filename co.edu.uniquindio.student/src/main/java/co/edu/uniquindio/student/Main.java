package co.edu.uniquindio.student;

import co.edu.uniquindio.student.model.Student;

public class Main {
    public static void main(String[] args) {
        Student student001 = new Student("Juan", 17, "juan@email,com", "former",3.0f, 3.5f, 4.5f);
        Student student002 = new Student("Maria", 15, "pepita@mail.com","new", 2.0f, 2.5f, 4.5f);
        Student student003 = new Student("Pepe",20,"pepe@mail.com","former", 4.0f,2.5f,4.5f);

        System.out.println("Average student001: " + student001.calculateAverageGrade());//method1

        System.out.println("Average student002: " + student002.calculateAverageGrade());

        System.out.println();
    }
}