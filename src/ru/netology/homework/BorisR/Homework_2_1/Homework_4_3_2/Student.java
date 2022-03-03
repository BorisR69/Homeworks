package ru.netology.homework.BorisR.Homework_2_1.Homework_4_3_2;

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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }
}
