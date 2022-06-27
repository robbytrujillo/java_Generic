package programmer.zaman.now.generic;

public class Mydata<T> { //supaya ketahuan generic parameter <T> --> Type

    private T data;

    public Mydata(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
