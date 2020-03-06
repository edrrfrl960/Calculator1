package ie.gmit;

public class Calculator {
    public Calculator(){
    }

    public int add(int arg1, int arg2)
    {
        if(arg1 > 0 && arg2 > 0) {
            int sum = arg1 + arg2;
            return sum;
        }
        else {
            throw new IllegalArgumentException("Not a valid entry");
        }
    }
}
