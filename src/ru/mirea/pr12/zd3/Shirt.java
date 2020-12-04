package ru.mirea.pr12.zd3;



public class Shirt {
    private String code,shirtName,color,size;
    public Shirt(String s){
        String[] s1;
        s1=s.split(",");
        code=s1[0];
        shirtName=s1[1];
        color=s1[2];
        size=s1[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "code='" + code + '\'' +
                ", shirtName='" + shirtName + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
