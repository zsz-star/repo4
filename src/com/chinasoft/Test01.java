package com.chinasoft;

public class Test01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setBread("美短");
        cat.setAge(2);
        cat.setPrice(1500.0);
        cat.setHealth(80);

        Cat cat1 = new Cat();
        cat1.setBread("中华田园猫");
        cat1.setAge(2);
        cat1.setPrice(1500.0);
        cat1.setHealth(80);

        Customer customer = new Customer();
        customer.setName("jack");
        customer.buyPet(cat);
        customer.buyPet(cat1);

        Doctor doctor = new Doctor();
        cat = doctor.injection(cat);
        cat.show();
        cat1 = doctor.injection(cat1);
        cat1.show();


    }


}
