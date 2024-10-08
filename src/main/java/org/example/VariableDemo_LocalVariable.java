package org.example;

public class VariableDemo_LocalVariable {

    public void pupAge(){
        int age=0;
        age=age +7;
        System.out.println("Puppy age is :"+age);
    }




    public static void main(String[] args) {
       //Local variable
        VariableDemo_LocalVariable demo=new VariableDemo_LocalVariable();
        demo.pupAge();
        int age=12;
        System.out.println("Age:"+age);




    }
}
