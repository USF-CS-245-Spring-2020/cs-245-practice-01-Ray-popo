public class Practice01MathIterative implements Practice01Math {
    @Override
    public int fact(int n) throws Exception {
        int f=1;
        if (n<0)
            throw new Exception();
        else
            for(int i=1; i<n;i++)
            f=f*(i+1);
            return f;
    }

    @Override
    public int fib(int n) throws Exception {
        if(n<0) {
            throw new Exception();
        } else if (n<=1){
            return n;
        }
        int f=1;
        int prevF=1;
        for (int i=2; i<n;i++){
            int temp = f;
            f+=prevF;
            prevF = temp;
        }
        return f;
    }
}
