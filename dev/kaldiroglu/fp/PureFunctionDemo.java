package dev.kaldiroglu.fp;

public class PureFunctionDemo {

   void main() {
        int x = 3;
        int y = g(f(x));
        System.out.println(y);
    }

    public static int f (int x){
        int y = x * x;
        return y;
    }

    public static int g (int x){
        x += 1;
        return x;
    }
}

