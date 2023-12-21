package org.example;

public class Main2 {
    public static void main(String[] args){
    Str myStr = new Str();

    myStr.push("apple");
    myStr.push("banana1");
    myStr.push("banana001");
    myStr.push("banana00001");
    myStr.push("egg");
    myStr.push("banana0001");
    myStr.push("banana01");
    myStr.push("egg1");


    System.out.println(myStr);
    System.out.println(myStr.avg());
    System.out.println(myStr.max());
    System.err.println();
}
}
