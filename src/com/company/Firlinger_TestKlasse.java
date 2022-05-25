package com.company;

public class Firlinger_TestKlasse {

    public void hallo(){
        System.out.println("Hallo Welt!");
    }

    String str;

    public String getStr(){
        return str;
    }

    public void setStr(String str){
        this.str = str;
    }

    @Override
    public String toString() {
        return "Firlinger_TestKlasse{" +
                "str='" + str + '\'' +
                '}';
    }
}
