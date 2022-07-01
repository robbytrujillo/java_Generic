package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.Mydata;

public class CovariantApp {
    public static void main(String[] args) {

        Mydata<String> stringMyData = new Mydata<>("Robby");
        process(stringMyData);

        Mydata<? extends  Object> myData = stringMyData;
    }

    //Covariant hanya boleh ngambil data tapi tidak boleh merubah data
    public static void process(Mydata<? extends Object> myData) {
        System.out.println(myData.getData());
        //myData.setData(1); Tidak boleh karena berbahaya/Tipe data Integer
    }
}
