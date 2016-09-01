package com.runoob.test;

public class Test{
    public void pupAge(){
        int age = 0;    //初始化
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String args[]){
        Test test = new Test();
        test.pupAge();
    }
}

/*
public class Test{
   public void pupAge(){
      int age;
      age = age + 7;
      System.out.println("小狗的年龄是 : " + age);
   }

   public static void main(String args[]){
      Test test = new Test();
      test.pupAge();
   }
}

age没有初始化
*/