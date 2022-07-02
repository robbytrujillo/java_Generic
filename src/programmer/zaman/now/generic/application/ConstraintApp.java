package programmer.zaman.now.generic.application;

public class ConstraintApp {
    public static void main(String[] args) {

    NumberData<Integer> integerNumberData = new NumberData<>(1);
    NumberData<Long> longNumberData = new NumberData<>(1L);

    //error karena bukan number
    NumberData<String> stringNumberData = new NumberData<String>(1L);

    }

    public static class NumberData<T extends Number> { //jika Number diganti jadi Object maka akan bisa
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;

           // this.data.doubleValue();
        }
    }
}
