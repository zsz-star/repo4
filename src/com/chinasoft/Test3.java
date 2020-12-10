package com.chinasoft;
/*
* 有一个超市的会员卡

  属性：卡号、手机号、积分、余额

  方法：查看卡号、查看手机号、查看积分、查看余额、消费、存钱（存钱时，1元钱累计1积分）

   （1）定义属性和方法

   （2）消费的时候打折，如果超过1000元打8折；超过2000打5折；1000以内不打折。

   （3）写测试类，使用构造方法创建对象，测试所有的方法并体现。


* */
public class Test3 {
    public static void main(String[] args) {
        Supermarketvipcard supermarketvipcard = new Supermarketvipcard();
        supermarketvipcard.cardId = "vip666";
        supermarketvipcard.phoneNum ="123456789";
        supermarketvipcard.balance = 100;
        supermarketvipcard.integral = 10;
        supermarketvipcard.lookcardId();
        supermarketvipcard.lookphoneNum();
        supermarketvipcard.lookbalance();
        supermarketvipcard.lookintegral();
        supermarketvipcard.consumption();
        supermarketvipcard.save();


    }

}
