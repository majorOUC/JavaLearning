package oop.finalinstance;

public class SilverCard extends Card{
    //银卡类
    public SilverCard(String vehicleid, String cardid, String name, double balance) {
        super(vehicleid, cardid, name, balance);
    }
    //消费方法重写
    @Override
    public void consume(double money) {
        System.out.println("欢迎您，尊贵的银卡用户，您的账户余额为：" + getBalance());
        System.out.println("您该次消费的金额是" + money*0.9);
        if(money > getBalance()){
            System.out.println("您的账户余额不足，请充值！");
            return;
        }
        setBalance(getBalance() - money*0.9);
        System.out.println("消费成功！您的余额为：" + getBalance());
    }
}
