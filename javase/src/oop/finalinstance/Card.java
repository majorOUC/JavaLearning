package oop.finalinstance;


public class Card {
    //卡片的父类
    private String vehicleid;
    private String cardid;
    private String name;
    private double balance;

    public Card() {
    }

    public Card(String vehicleid, String name, String cardid, double balance) {
        this.vehicleid = vehicleid;
        this.balance = balance;
        this.name = name;
        this.cardid = cardid;
    }



    public String getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(String vehicleid) {
        this.vehicleid = vehicleid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    //卡片充值
    public void deposit(double money){
        this.balance += money;
    }

    //消费
    public void consume(double money){
        this.balance -= money;
    }

}
