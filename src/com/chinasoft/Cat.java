package com.chinasoft;

public class Cat {
    private String bread;
    private double age;
    private double price;
    private int health;

    public Cat() {
    }

    public void sleep(){
        System.out.println("睡觉");
    }
    public void jiao(){
        System.out.println("叫");
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
    public void show(){
        System.out.println("这是一只"+this.bread+",它"+this.age+"岁了，它的价格是："+this.price+",它的健康值是："+this.health);

    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health < 0 ||health > 100){
            System.out.println("请输入正确的健康值，范围在0-100之间，初次设置需要大于四十");
        }else if(health > 0 && health< 40){
            System.out.println("健康值要大于40");
        }else{
            this.health = health;
        }

    }
}
