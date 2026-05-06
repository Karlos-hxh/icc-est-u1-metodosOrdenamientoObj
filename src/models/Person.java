package models;

import java.util.Arrays;

public class Person {

    private String name;
    private int age;
    private int[] grades;

    
    public Person(String name, int age, int[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // Devolvemos una copia, no el original
    public int[] getGrades() {
        return Arrays.copyOf(this.grades, this.grades.length);
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }



    // Implementación del promedio
    public double getAverage() {
        if (grades == null || grades.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
        @Override
    public String toString() {
        return "Person " + name + ", " + age + " promedio= " + getAverage();
    }
}