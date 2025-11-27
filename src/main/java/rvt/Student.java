package rvt;

public class Student {

    // by default: public;
    private String name;

    private static String group = "DP2-3";

    public Student (String n){
        name = n;
    }  

    
    public static void changeName(){
        group = "abc";
    }
}


// public static void main(String[] args) {
//         Student st1 = new Student("Jack");
//         Student.group
        

//     }