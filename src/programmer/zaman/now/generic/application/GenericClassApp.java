package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.Mydata;

public class GenericClassApp {
    public static void main(String[] args) {

      Mydata<String>  stringMydata = new Mydata<String>("Robby");
      Mydata<Integer> integerMydata = new Mydata<Integer>(18);

      String stringValue = stringMydata.getData();
      Integer integerValue = integerMydata.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);

    }
}
