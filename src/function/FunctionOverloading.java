package function;

public class FunctionOverloading {
    public static void main(String[] args) {


        int result = fun(10, 20);
        int result2 = fun(10, 20, 30);
        System.out.println(result);
        System.out.println(result2);
    }

    static int fun(int a, int b) {
        return a + b;
    }

    static int fun(int a, int b, int c) {
        return a + b + c;
    }
}
