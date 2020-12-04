package ru.mirea.pr12.zd4;

public class PhoneNumber {
    private String cc,threeFirstNum,threeSecondNum,fourNum;
    public PhoneNumber(String pn){
        if(pn.charAt(0)=='+'){
            if(pn.length()!=12)
                System.out.println("Wrong phone number");
            else{
                cc=pn.substring(0,2);
                threeFirstNum=pn.substring(2,5);
                threeSecondNum=pn.substring(5,8);
                fourNum=pn.substring(8,12);
            }
        }
        else if(pn.charAt(0)=='8'){
            if(pn.length()!=11)
                System.out.println("Wrong phone number");
            else {
                cc = "+7";
                threeFirstNum = pn.substring(1, 4);
                threeSecondNum = pn.substring(4, 7);
                fourNum = pn.substring(7, 11);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder s =new StringBuilder();
        s.append(cc).append(" ").append(threeFirstNum).append(" ").append(threeSecondNum).append(" ").append(fourNum);
        String s2=new String(s);
        return s2;

    }
}
