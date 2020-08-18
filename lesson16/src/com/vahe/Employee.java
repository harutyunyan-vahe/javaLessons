package com.vahe;

public class Employee {

    private String firstname;
    private String lastname;
    private int age;

    public Employee(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Employee setFirstname(String firstname) {
        this.firstname = firstname;
        return  this;
    }

    public Employee setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString(){

//        String t = "gg" + "kk" + "tt" + "uu" + "oo";
//        //ggkk , ggkktt ggkkttuu ggkkttuuoo
//
//        StringBuilder sb = new StringBuilder("gg");
////        sb.append("gg");
//        sb.append("kk");
//
//        sb.append("tt");
//        sb.append("uu");
//        sb.append("oo");
//        String finalStr = sb.toString();

//        String empStringBuilder = "Employee [ firstname " +
//                this.firstname +
//                "lastname " +
//                this.lastname +
//                " age " +
//                this.age;

       return  String.format("Empoyee [ firstname=%s lastname=%s age=%s salary=%s ] ", this.firstname,
                this.lastname, this.age, 100);
//
//        String str = "";
//        for(int i = 0; i < 100; i++){
//            str = str + "item " + i;
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < 100; i++){
//            sb.append("item ").append(i);
//
//        }
//
//
//        return empStringBuilder;


//        return  "Employee [ firstname " + this.firstname +
//              " lastname " + this.lastname + " age " + this.age + " ]";

    }
}
