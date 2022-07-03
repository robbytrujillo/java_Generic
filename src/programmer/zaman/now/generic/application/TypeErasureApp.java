package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.Mydata;

public class TypeErasureApp {
    public static void main(String[] args) {

        Mydata mydata = new Mydata("Robby");

        Mydata<Integer> integerMyData = (Mydata<Integer>) mydata;
        //integerMyData.setData(1000);

        Integer integer = integerMyData.getData();

    }
}
