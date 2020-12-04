package ru.mirea.pr12.zd5;

import java.util.ArrayList;
import java.util.Arrays;

public class MatchWord {
    public static String getLine(String s){
        StringBuilder sb=new StringBuilder();
        String[] s1;
        s1=s.split(" ");
        ArrayList<String> s2=new ArrayList<>(Arrays.asList(s1));
        int a=0;
        while(s2.size()>0) {
            String s3= s2.remove(a);
            sb.append(s3).append(" ");
            for(int i=0;i< s2.size();i++) {
                if (s3.toLowerCase().charAt(s3.length()-1) == s2.get(a).toLowerCase().charAt(0)) {
                    a = i;
                    break;
                }
            }
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}
