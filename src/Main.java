public class Main {
    public static void main(String[] args) {
        int[] weight = {1, 2, 3};
        double[] temp = {1.57, 7.654, 9.986};
        char[] speed ={'a', 'b', 'c'};

        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < temp.length ; i++) {
            System.out.print(temp[i]);
            if (i != temp.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < speed.length ; i++) {
            System.out.print(speed[i]);
            if (i != speed.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}