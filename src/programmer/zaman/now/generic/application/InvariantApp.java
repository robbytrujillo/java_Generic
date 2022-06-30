package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.Mydata;

public class InvariantApp {
    public static void main(String[] args) {

        Mydata<String> stringMydata = new Mydata<>("Robby");
        //doIt(stringMydata); //ERROR
        //Mydata<Object> objectMydata = stringMydata;

        Mydata<Object> objectMydata = new Mydata<>(1000);
        // Mydata<Integer> integerMydata = objectMydata;
        // doItInteger(objectMydata);
    }
    public static void doIt(Mydata<Object> objectMyData) {
        //do nothing
    }

    public static void doItInteger(Mydata<Integer> integerMydata){
       // do nothing
    }
}
