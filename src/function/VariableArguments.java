package function;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        int result = variableArgument("shailendra", 1, 2, 3, 4, 5);
        System.out.println(result);
    }

    static int variableArgument(String name, int... v) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        System.out.println(Arrays.toString(v));
        return sum;
    }
}
