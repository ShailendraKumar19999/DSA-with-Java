package function;

public class PassingValue {
    public static void main(String[] args) {
        String name = "shailendra";
        greeting(name);
        System.out.println(name);
    }

    static void greeting(String naam) {
        naam = "kumar";
    }
}
