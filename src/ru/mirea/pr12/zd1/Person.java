package ru.mirea.pr12.zd1;

public class Person {
    private String family;
    private String imia;
    private String ochetva;

    public Person(String family) {
        this.family = family;
    }

    public Person(String family, String imia, String ochetva) {
        this.family = family;
        this.imia = imia;
        this.ochetva = ochetva;
    }

    @Override
    public String toString() {
        StringBuilder fullName=new StringBuilder(family);
        if(ochetva!=null && !ochetva.equals(""))
            fullName.append(" ").append(ochetva);
        if(imia!=null && !imia.equals(""))
            fullName.append(" ").append(imia);
        return fullName.toString();
    }
}
