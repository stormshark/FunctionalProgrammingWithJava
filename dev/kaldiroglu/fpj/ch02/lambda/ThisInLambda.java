package dev.kaldiroglu.fpj.ch02.lambda;

public class ThisInLambda {
    private String name = "Lambda";

    public static void main(String[] args) {
        ThisInLambda til = new ThisInLambda();
        til.run();
    }

    public void run() {
        // Anonymous class: 'this' = the anonymous object itself (ThisInLambda$1)
        Runnable anon = new Runnable() {
            public void run() {
                System.out.println(this.getClass().getName());  // -> "ThisInLambda$1"
                // System.out.println(this.name);  // COMPILE ERROR: no 'name' here
            }
        };

        // Lambda: 'this' = the enclosing ThisInLambda instance
        Runnable lambda = () -> {
            System.out.println(this.getClass().getName());  // -> "ThisInLambda"
            System.out.println(this.name);                  // works -> "Lambda"
        };

        anon.run();
        lambda.run();
    }
}
