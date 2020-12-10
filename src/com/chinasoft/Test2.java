package com.chinasoft;

public class Test2 {
    public static void main(String[] args) {

        Kongtiao kongtiao = new Kongtiao();
        kongtiao.brand = "美的、格力、奥克斯";
        kongtiao.type = "立式空调、挂机空调、中央空调";
        kongtiao.price = 5000;
        kongtiao.controlcold();
        kongtiao.controlhot();
        kongtiao.timingcontrolcold();
        kongtiao.timingcontrolhot();
    }
}
