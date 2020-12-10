package com.chinasoft;

public class Doctor {
     private String name;
    private int age;



    public Cat injection(Cat cat){
       int health = cat.getHealth();
       if(health<0){
           System.out.println("让它好生安息吧");
           return null;
       }else if(health>80){
           System.out.println("该宠物很健康，不需要打针，可以去吃点药解决");
            return cat;
       }
        health +=20;
        cat.setHealth(health);
        return cat;
    }
    public Cat medicine(Cat cat){
        int health = cat.getHealth();
        if(health<0){
            System.out.println("让它好生安息吧");
            return null;
        }else if(health>90){
            System.out.println("该宠物很健康，不需要吃药");
            return cat;
        }
        health +=10;
        cat.setHealth(health);
        return cat;
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
