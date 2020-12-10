package com.chinasoft;

public class Supermarketvipcard {
    String cardId;
    String phoneNum;
    double integral;
    double balance;

    public void lookcardId (){
        System.out.println(cardId);
    }
    public void lookphoneNum (){
        System.out.println(phoneNum);
    }

    public void lookbalance (){
        System.out.println(balance);
    }
    public void lookintegral (){
        System.out.println(integral);
    }

    public void consumption (){
        int sum=1500;
        if(sum>1000){
            System.out.println(0.8*sum);
        }else if(sum>2000){
            System.out.println(0.5*sum);
        }else{
            System.out.println(sum);
        }
    }

    public void save (){
        int num=0;
        integral=integral+num;
    }


}
