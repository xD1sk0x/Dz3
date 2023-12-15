package org.example;

public class MathStudent extends Student{
        public MathStudent(String fio){
            super(fio);
        }
        @Override
        public void writeExams(int course) {
            System.out.println("FH student from "+course+"th course is writing an Exam");
        }
    }