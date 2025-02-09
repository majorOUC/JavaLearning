package oop.finalinstance;


public class GoldCard extends Card{
    //金卡类

    public GoldCard(String vehicleid, String cardid, String name, double balance) {
        super(vehicleid, cardid, name, balance);
    }

    @Override
    public void consume(double money) {
        System.out.println("您的余额为：" + getBalance());
        System.out.println("欢迎您！尊贵的金卡用户！您本次消费的金融是：" + money*0.8);
        if(getBalance() < money){
            System.out.println("抱歉！当前余额不足！请充值！");
            return;
        }
        setBalance(getBalance()-money*0.8);
        System.out.println("消费成功！您的余额为：" + getBalance());
        if(money*0.8 >= 200){
            printwashticket(money);
        }else{
            System.out.println("抱歉！您单次消费金额未满200元，洗车券打印失败！");
        }
    }

    public void printwashticket(double money){
        System.out.println("恭喜您！您本次消费的金融为：" + money*0.8 + "元，您获得一张洗车券！");
    }
}
