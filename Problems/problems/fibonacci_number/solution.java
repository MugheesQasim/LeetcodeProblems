class Solution {
    public int fib(int n) {
        if(n==1)
            return n;
        else if(n<1)
            return 0;
        else
            return fib(n-1) + fib(n-2);
    }
}