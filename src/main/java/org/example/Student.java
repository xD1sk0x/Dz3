package org.example;

public abstract class Student {
    private final String fio;
    private int course;
    private int mark;

    public Student(String fio) {
        this.fio = fio;

    }
    public void setCourse(int course) {
        if (course > 0 & course < 6) {
            this.course = course;
        } else {
            throw new RuntimeException("course should be > 0 and < 6");
        }
    }
    public void setMark(int mark) {
        if (mark > 0 & mark < 6) {
            this.mark = mark;
        } else {
            throw new RuntimeException("mark should be > 0 and < 6");
        }
    }
    public abstract void writeExams(int course);
}
