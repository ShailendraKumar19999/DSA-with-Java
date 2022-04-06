package function;

public class Shadowing {
    static int x = 100;

    public static void main(String[] args) {
        System.out.println(x);
        int x = 50;
        System.out.println(x);
        shadow();
    }

    static void shadow() {
        System.out.println(x);
    }

}
