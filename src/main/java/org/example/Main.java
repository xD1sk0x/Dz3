package org.example;

public class Main{

        public static void main(String[] args) {
            IUStudent iustudent = new IUStudent("Emelyanov Anton Olegovich");
            MathStudent mathstudent = new MathStudent("Ivanikov Alex Genadievich");
            iustudent.writeExams(2);
            mathstudent.writeExams(4);
        }
}
