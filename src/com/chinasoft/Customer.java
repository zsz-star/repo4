package com.chinasoft;

public class Customer {
    private String name;
    private int age;

    public void buyPet(Cat cat){
      if(cat.getHealth()<40){
          System.out.println("不可购买");
      }else {
          System.out.println("这是"+this.name+"猫的信息");
      }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
