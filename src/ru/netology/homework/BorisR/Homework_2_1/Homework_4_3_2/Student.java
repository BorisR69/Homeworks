package ru.netology.homework.BorisR.Homework_2_1.Homework_4_3_2;

import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private String StudentId;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return StudentId.equals(student.StudentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(StudentId);
    }

    @Override
    public String toString() {
        return "- " + name + ", " + group + ", " + StudentId;
    }
}
