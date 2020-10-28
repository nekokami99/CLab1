package ru.mirea.pr9.zd2;



public class checkTINcode {
    public static void checkTIN(OnlinePurchase customer) throws TINcodeException{
        if(customer.getCodeTIN()<1000000000L) {
            throw new TINcodeException("TIN: " + customer.getCodeTIN() + " invalid. Please enter TIN code again");
        }
        else if(customer.getCodeTIN()>9999999999L) {
            throw new TINcodeException("TIN: " + customer.getCodeTIN() + " invalid. Please enter TIN code again");
        }
        System.out.println("TIN: " + customer.getCodeTIN()  + " accepted!");
    }
}
