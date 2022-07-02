package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.Mydata;

public class WildcardApp {
    public static void main(String[] args) {
        print(new Mydata<Integer>(100));
        print(new Mydata<String>("Robby"));
        print(new Mydata<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));


    }

    public static void print(Mydata<?> mydata){
        System.out.println(mydata.getData());
    }
}
