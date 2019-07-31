package binarysearch;

public class PowerFunction {
    public static void main(String[] args) {
        System.out.println(new PowerFunction().pow(2,3,3));
    }

    public int pow(int x, int n, int d) {
        //System.out.println(x);
        if(n==1) return x % d;
        else if(n%2 == 0) return pow(x*x,n/2,d);
        else return (x%d) * pow(x*x,(n-1)/2,d) % d;
    }
}
