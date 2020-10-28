package ru.mirea.pr9.zd2;

public class OnlinePurchase {
    private String cusName;
    private long codeTIN;

    public OnlinePurchase() {
    }

    public OnlinePurchase(String cusName, long codeTIN) {
        this.cusName = cusName;
        this.codeTIN = codeTIN;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public long getCodeTIN() {
        return codeTIN;
    }

    public void setCodeTIN(long codeTIN) {
        this.codeTIN = codeTIN;
    }

    @Override
    public String toString() {
        return "OnlinePurchase {" +
                "cusName='" + cusName + '\'' +
                ", codeTIN=" + codeTIN +
                '}';
    }
}
