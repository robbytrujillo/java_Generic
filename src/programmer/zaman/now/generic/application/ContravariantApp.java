package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.Mydata;

public class ContravariantApp {
    public static void main(String[] args) {

        Mydata<Object> objectMydata = new Mydata<>("Robby");

        objectMydata.setData(1000);

        Mydata<? super String> myData = objectMydata;

        //Mydata<? super String> mydata

        process(objectMydata);

        System.out.println(objectMydata.getData());
    }

    //Contravariant hanya dapat melakukan set data saja dan tidak aman dengan melakukan get data
    public static void process(Mydata<? super String> myData){
        Object value = myData.getData();
        System.out.println("Proses parameter " + value);

        myData.setData("Robby Ilham");

    }
}
