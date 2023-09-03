package co.edu.uniquindio.student.model;

public class Student {
    private String name;
    private int age;
    private String email;
    private String kindOfStudent;
    private float gradeOne;
    private float gradeTwo;
    private float gradeThree;

    double[] grades = new double[3];

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
        return gradeOne;
    }
    public void setGradeOne(float gradeOne) {
        this.gradeOne = gradeOne;
    }
    public float getGradeTwo() {
        return gradeTwo;
    }
    public void setGradeTwo(float gradeTwo) {
        this.gradeTwo = gradeTwo;
    }
    public float getGradeThree() {
        return gradeThree;
    }
    public void setGradeThree(float gradeThree) {
        this.gradeThree = gradeThree;
    }
    public Student(String name, int age, String email, String kindOfStudent, float gradeOne, float gradeTwo, float gradeThree) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.kindOfStudent = kindOfStudent;
        this.gradeOne = gradeOne;
        this.gradeTwo = gradeTwo;
        this.gradeThree = gradeThree;
    }
    // Method to calculate average grade
    public double calculateAverageGrade() {
        return (gradeOne + gradeTwo + gradeThree) / 3; // search how to use the method .length
    }
    float a = getGradeOne();
    public static void mostrar(float a ){
        System.out.println(a);
    }
}
