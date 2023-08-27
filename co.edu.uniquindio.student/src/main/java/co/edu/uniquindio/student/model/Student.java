package co.edu.uniquindio.student.model;

public class Student {
    private String name;
    private int age;
    private String email;
    private String kindOfStudent;
    private float GradeOne;
    private float GradeTwo;
    private float GradeThree;

    float[] grades = new float[3];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKindOfStudent() {
        return kindOfStudent;
    }

    public void setKindOfStudent(String kindOfStudent) {
        this.kindOfStudent = kindOfStudent;
    }

    public float getGradeOne() {
        return GradeOne;
    }

    public void setGradeOne(float gradeOne) {
        GradeOne = gradeOne;
    }

    public float getGradeTwo() {
        return GradeTwo;
    }

    public void setGradeTwo(float gradeTwo) {
        GradeTwo = gradeTwo;
    }

    public float getGradeThree() {
        return GradeThree;
    }

    public void setGradeThree(float gradeThree) {
        GradeThree = gradeThree;
    }

    public float[] getGrades() {
        return grades;
    }

    public void setGrades(float[] grades) {
        this.grades = grades;
    }

    public Student(String name, int age, String email, String kindOfStudent, float gradeOne, float gradeTwo, float gradeThree) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.kindOfStudent = kindOfStudent;
        GradeOne = gradeOne;
        GradeTwo = gradeTwo;
        GradeThree = gradeThree;
    }
}