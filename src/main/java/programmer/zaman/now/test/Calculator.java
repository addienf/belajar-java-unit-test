package programmer.zaman.now.test;

public class Calculator {

    public Integer devide(Integer a, Integer b){
        if (b == 0){
            throw new IllegalArgumentException("Can not divide by zero");
        } else {
            return a / b;
        }
    }

    public Integer add(Integer a, Integer b){
        return a + b;
    }
}
