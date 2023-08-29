package com.driver;

public class Main {

    public static void main(String[] args){

        RWOnly R = new RWOnly();

        //R.name = "sumit";
        //System.out.println(R.name);
        //since, name is private, we cannot set its value directly here

        R.setName("sumit");

        System.out.println(R.getName());
    }
}