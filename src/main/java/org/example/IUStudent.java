package org.example;

public class IUStudent extends Student{
  public IUStudent(String fio){
      super(fio);
  }
    @Override
    public void writeExams(int course) {
      System.out.println("IU student from "+course+"th course is writing an Exam");
    }
}
