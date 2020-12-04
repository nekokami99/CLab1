package ru.mirea.pr12.zd2;

import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, housing, apartment;
    public Address(String address, boolean onePunctuationMark){
        String[] s1;
        if(onePunctuationMark==false){
            StringTokenizer s = new StringTokenizer(address,".,;");
            s1=new String[s.countTokens()];
            int i=0;
            while(s.hasMoreTokens()){
                s1[i]=s.nextToken();
                i++;
            }
        }else{
            s1=address.split(",");
        }
        if(s1.length<7)
            System.out.println("Incomplete address");
        else{
            country=s1[0].trim();
            region=s1[1].trim();
            city=s1[2].trim();
            street=s1[3].trim();
            house=s1[4].trim();
            housing=s1[5].trim();
            apartment=s1[6].trim();
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", housing='" + housing + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
