public class Practice01MathRecursive implements Practice01Math {
    @Override
    public int fact(int n) throws Exception {
        if (n < 0) {
            throw new IllegalArgumentException("Can't Accept a Negative Number");
        } else if (n >= 1)
            return n * fact(n - 1);
        else
            return 1;
    }

    @Override
    public int fib(int n) throws Exception {
        if(n==0) {
            return 0;
        } else if(n==1){
            return 1;
        } else if(n<0){
            throw new IllegalArgumentException("Can't Accept a Negative Number");
        }
        return fib(n-1)+fib(n-2);
    }
}
