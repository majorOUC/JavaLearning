package oop.finalinstance;

public class Test {
    public static void main(String[] args) {
        //设计一个加油站加油支付小程序。分金卡和银卡两个卡片，金卡必须预存金额5000元，银卡必须预存金额2000元。
        //金卡在支付时可以享受八折优惠，并且单次消费满两百元，可以免费打印洗车券；银卡在支付时可以享受九折优惠。
        //卡片信息包括车辆车牌号、车主姓名、电话号码、卡片余额。
        GoldCard c1 = new GoldCard("粤A12345", "123456789", "张三", 5000);
        SilverCard c2 = new SilverCard("鲁A12345", "2341235", "李四", 2000);

        ServiceMachine.pay(c1);
        ServiceMachine.pay(c2);
        ServiceMachine.deposit(c1);
        ServiceMachine.deposit(c2);

    }
}
