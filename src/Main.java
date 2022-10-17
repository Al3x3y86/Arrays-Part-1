import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] weight = {1, 2, 3};

        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0){
                weight[i] += 1;
            }
        }
        System.out.println(Arrays.toString(weight));

    }
}