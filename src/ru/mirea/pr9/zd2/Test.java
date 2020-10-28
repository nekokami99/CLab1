package ru.mirea.pr9.zd2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        OnlinePurchase cus=new OnlinePurchase();
        System.out.print("Enter customer name: ");
        cus.setCusName(scanner.nextLine());
        System.out.print("Enter "+ cus.getCusName()+"'s TIN: ");
        cus.setCodeTIN(scanner.nextLong());
        checkException(cus);
    }

    public static void checkException(OnlinePurchase a){
        Scanner scanner=new Scanner(System.in);
        try {
            checkTINcode.checkTIN(a);
        }
        catch (TINcodeException e){
            System.out.println(e.getMessage());
            System.out.print("Enter again "+ a.getCusName()+"'s TIN: ");
            a.setCodeTIN(scanner.nextLong());
            checkException(a);
        }
    }
}
